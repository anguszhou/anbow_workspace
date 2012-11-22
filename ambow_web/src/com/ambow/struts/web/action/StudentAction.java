package com.ambow.struts.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;

import com.ambow.struts.dao.IStudentDao;
import com.ambow.struts.dao.impl.StudentDaoImpl;
import com.ambow.struts.form.LoginForm;
import com.ambow.struts.pojo.Student;

public class StudentAction  extends MappingDispatchAction{

	
	public ActionForward login(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		ActionForward forward = null;
		
		Student student = null;
		
		//1：获得页面的提交参数
		
		/*String name = request.getParameter("name");
		
		String password = request.getParameter("password");*/
		
		LoginForm loginForm = (LoginForm)form;
		
		System.out.println(loginForm);
		String name = loginForm.getName();
		
		System.out.println("loginForm======>name"+name);
		
		String password = loginForm.getPassword();
		
		System.out.println("loginForm======>password"+password);
		
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
	
	
	public ActionForward logout(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ActionForward forward = null;
		
		HttpSession session = request.getSession();
		
		session.removeAttribute("student");
		
		session.invalidate();
		
		forward = mapping.findForward("login");
		
		return forward;
	}




	
}
