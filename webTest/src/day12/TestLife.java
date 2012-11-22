package day12;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class TestLife extends HttpServlet
{

	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException
	{			
		System.out.println("service");
	}

	public void destroy()
	{
		System.out.println("destroy");
	}

	public void init(ServletConfig config) throws ServletException
	{
		System.out.println(config.getInitParameter("USER_NAME"));
		
		System.out.println(config.getInitParameter("PASSWORD"));
		
		System.out.println("init");
	}

	
}
