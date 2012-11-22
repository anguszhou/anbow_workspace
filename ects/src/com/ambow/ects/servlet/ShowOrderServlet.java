package com.ambow.ects.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ambow.ecport.exception.ManagerOrderException;
import com.ambow.ects.dao.IOrderDao;
import com.ambow.ects.dao.impl.OrderDaoImpl;
import com.ambow.ects.entity.Order;

public class ShowOrderServlet 
{


	public  void  viewOrder(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		IOrderDao dao = new OrderDaoImpl();		
		request.setCharacterEncoding ("gbk");
		response.setCharacterEncoding("gbk");
		
		Collection<Order> studentList = null;
		try
		{
			studentList =  dao.findAll("lili");
		}
		catch (ManagerOrderException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
				
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Untitled</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2 align=\"center\">ORDER LIST</h2>");
		out.println("<hr/>");
		out.println("<table align=\"center\" border=\"1\" width=\"600\" height=\"50\" >");
		out.println("<tr align=\"center\">");
		out.println("<td>ID</td>");
		out.println("<td>BUYER_NAME</td>");
		out.println("<td>BUYER_ID</td>");
		out.println("<td>PAYWAY</td>");
		out.println("<td>STATUS</td>");
		out.println("</tr>");
		
		
		Iterator<Order> it = studentList.iterator();		
		while(it.hasNext()){
			
			Order order = new Order ();
			order = it.next();

			out.println("<tr align=\"center\">");
			out.println("<td>"+order.getId()+"</td>");
			out.println("<td>"+order.getName()+"</td>");
			out.println("<td>"+order.getUser().getId()+"</td>");
			out.println("<td>"+order.getPayWay().getPayStyle()+"</td>");
			out.println("<td>"+order.getStatus().getName()+"</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		out.close();
		
	}

}


	


