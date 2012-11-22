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
import com.ambow.ects.dao.IUserDao;
import com.ambow.ects.dao.impl.ProductDaoImpl;
import com.ambow.ects.dao.impl.UserDaoImpl;
import com.ambow.ects.entity.Product;
import com.ambow.ects.entity.User;


import javax.servlet.http.HttpServlet;

public class TestAccount extends HttpServlet
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
		out.println("<h2 align=\"center\">user view</h2>");
		out.println("<hr/>");
		out.println("<table align=\"center\" border=\"1\" width=\"500\" height=\"50\">");
		out.println("<tr>");
		out.println("<td>id</td>");
		out.println("<td>name</td>");
		out.println("<td>password</td>");

		out.println("</tr>");

		Connection conn = null;
		
		Statement st = null;
		
		Collection rs = null;
		
		User user = null;
		
		IUserDao dao = new UserDaoImpl ();
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
	
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ects", 
					"root", "1234");
			st = conn.createStatement();
			
			user = dao.login("nibingyu", "zhou");
			
			
			out.println("<tr>");
			out.println("<td>"+user.getId()+"</td>");
			out.println("<td>"+user.getName()+"</td>");
			out.println("<td>"+user.getPasswd()+"</td>");		
			out.println("</tr>");
				
			
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
