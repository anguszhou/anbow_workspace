package com.ambow.struts.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginOutAction extends Action {


	public ActionForward execute(ActionMapping mapping, ActionForm form,
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
