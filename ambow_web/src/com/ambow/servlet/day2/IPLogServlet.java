package com.ambow.servlet.day2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IPLogServlet extends HttpServlet {

	private PrintWriter log;
	
	public void init(ServletConfig config) throws ServletException {
		
		//初始化往log写ip的流
		try {
			
			OutputStream os = new FileOutputStream(config.getInitParameter("FILE_PATH"),true);
		
			log = new PrintWriter(os);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
			throw new RuntimeException("资源原件失败");
			
		}
			
	}
	protected void  service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			//设置mine格式
			response.setContentType("text/html");
			//获得printwriter对象
			PrintWriter out = response.getWriter();
			//获得ip地址
			String path = request.getRemoteAddr();
			//往log文件去写东西
			synchronized (this) {
				log.print(new Date());
				log.println(path);
				log.println();
				log.flush();
			}
			out.println("<html>");
			out.println("<head>");
			out.println("	<title>IP</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h2 align=\"center\">Your information has been logged on server.</h2>");
			out.println("<hr>");
			out.println("d:\\iplog.txt");
			out.println(path);
			out.println("</body>");
			out.println("</html>");
			out.close();
		
	}

	
	public void destroy() {

			log.close();
	}

	

}
