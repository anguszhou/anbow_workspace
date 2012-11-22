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
		
		//��ʼ����logдip����
		try {
			
			OutputStream os = new FileOutputStream(config.getInitParameter("FILE_PATH"),true);
		
			log = new PrintWriter(os);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
			throw new RuntimeException("��Դԭ��ʧ��");
			
		}
			
	}
	protected void  service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			//����mine��ʽ
			response.setContentType("text/html");
			//���printwriter����
			PrintWriter out = response.getWriter();
			//���ip��ַ
			String path = request.getRemoteAddr();
			//��log�ļ�ȥд����
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
