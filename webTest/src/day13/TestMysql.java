package day13;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestMysql extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Untitled</title>");
		out.println("</head>");
	
		out.println("<body>");
		out.println("<h2 align=\"center\">Student List view</h2>");
		out.println("<hr/>");
		out.println("<table align=\"center\" border=\"1\" width=\"500\" height=\"50\">");
		out.println("<tr>");
		out.println("<td>ID</td>");
		out.println("<td>NAME</td>");
		out.println("<td>PASSWORD</td>");
		out.println("</tr>");

		Connection conn = null;
		
		Statement st = null;
		
		 ResultSet rs = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
	
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zhoucong", 
					"root", "1234");
			st = conn.createStatement();
			String sql = "select * from testservlet";
			rs = st.executeQuery(sql);
			while(rs.next()){
				out.println("<tr>");
				out.println("<td>"+rs.getString("id")+"</td>");
				out.println("<td>"+rs.getString("name")+"</td>");
				out.println("<td>"+rs.getString("password")+"</td>");
				out.println("</tr>");
			}
		}catch(Exception e){
			
			new RuntimeException("when query student error");
			
			e.printStackTrace();
		
		}finally{
			try {
				if (rs != null)
					rs.close();
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
			throws ServletException, IOException
	{
		 doGet(request,response);
	}

}
