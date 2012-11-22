package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ambow.ects.dao.IProductDao;
import com.ambow.ects.dao.impl.ProductDaoImpl;
import com.ambow.ects.entity.Product;

public class TestDao extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		request.setCharacterEncoding("GBK");
		response.setCharacterEncoding("GBK");
		PrintWriter out = response.getWriter();
		
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Untitled</title>");
		out.println("</head>");
	
		out.println("<body>");
		out.println("<h2 align=\"center\">Product List view</h2>");
		out.println("<hr/>");
		out.println("<table align=\"center\" border=\"1\" width=\"500\" height=\"50\">");
		out.println("<tr>");
		out.println("<td>id</td>");
		out.println("<td>name</td>");
		out.println("<td>author</td>");
		out.println("<td>publish</td>");
		out.println("<td>pages</td>");
		out.println("<td>images</td>");
		out.println("<td>basePrice</td>");
		out.println("<td>descriptions</td>");
		out.println("<td>category_id</td>");
		out.println("</tr>");

		Connection conn = null;
		
		Statement st = null;
		
		Collection rs = null;
		
		Product product = null;
		
		IProductDao dao = new ProductDaoImpl ();
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
	
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ects", 
					"root", "1234");
			st = conn.createStatement();
			
			rs = dao.findAll();
			
			for (Object object : rs)
			{
				product = (Product)object ;
				out.println("<tr>");
				out.println("<td>"+product.getId()+"</td>");
				out.println("<td>"+product.getName()+"</td>");
				out.println("<td>"+product.getAuthor()+"</td>");
				out.println("<td>"+product.getPublish()+"</td>");
				out.println("<td>"+product.getPages()+"</td>");
				out.println("<td>"+product.getImages()+"</td>");
				out.println("<td>"+product.getBasePrice()+"</td>");
				out.println("<td>"+product.getDescriptions()+"</td>");
				out.println("<td>"+product.getCategory().getId()+"</td>");
				out.println("</tr>");
			}		
			
		}catch(Exception e){
			
			new RuntimeException("when query student error");
			
			e.printStackTrace();
		
		}finally{
			try {
			
				if (st != null)
					st.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				new RuntimeException("when query student error");
				
				e.printStackTrace();
			}
			
		}
		
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			doGet(request, response);
	}
}
