package com.ambow.struts.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.ambow.struts.dao.IStudentDao;
import com.ambow.struts.dao.impl.StudentDaoImpl;
import com.ambow.struts.pojo.Student;

public class LoginAction extends Action {


	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
			ActionForward forward = null;
			
			Student student = null;
			
			//1：获得页面的提交参数
			
			String name = request.getParameter("name");
			
			String password = request.getParameter("password");
			
			IStudentDao dao = new StudentDaoImpl();
			
			student = dao.findByNameAndPassword(name, password);
			
			if(student != null){
				
				request.setAttribute("student", student);
				
				forward = mapping.findForward("success");
			}else{
				
				request.setAttribute("message", "The User Not found From DB");
				
				forward = mapping.findForward("error");
			}
			
			
			return forward;
		
	}

}
