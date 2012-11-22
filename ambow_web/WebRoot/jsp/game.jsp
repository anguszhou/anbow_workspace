<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%!
		public int getAnswer(){
	
			int answer = new Random().nextInt();
			
			answer = Math.abs(answer);
			
			answer = answer%100+1;
			
			return answer;
	}

%>

<%

			String guess = request.getParameter("guess");

			String message ="";
			
			boolean isSuccess = false;
			
			if(guess == null){
				
				//第一次进来
				session.setAttribute("answer",getAnswer());
				
				session.setAttribute("times",0);
			}else{
				//真正猜
				
				int userGuess = Integer.parseInt(guess);
				
				int answer = (Integer)session.getAttribute("answer");
				
				int times = (Integer)session.getAttribute("times");
				
				session.setAttribute("times",times+1);
				
				if(userGuess==answer){
					
					 message = "HE HE  YOU ARE HIT IT";
						
					 isSuccess = true;
						
					
				}else if(userGuess < answer){
					
					message = "please try high" ;
				}else{
					
					message = "please try lower" ;
				}
				
			}

	
%>
<html>
  <head>
    <title>My JSP 'game.jsp' starting page</title>
  </head>
  
  <body>
  	<h2 align="center"> 我 猜猜 数字游戏</h2>
    <hr>
    <% if(!isSuccess) {%>
    	<div align="center">
		<form action="game.jsp" method="post">
				<input name="guess" type="text">
				
				<input type="submit" value="我猜猜">
		</form>
		</div>
	<%} %>
		
	<%=message %>
	<% if(isSuccess) {%>
		 
		 you are tried <%=session.getAttribute("times") %>
		 
		 <a href="game.jsp">try again</a>
	<%}%>
  </body>
</html>







