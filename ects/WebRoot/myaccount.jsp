<%@ page contentType="text/html; charset=GBK" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk" />
<title>Auto Parts</title>
<link rel="stylesheet" type="text/css" href="style.css" />
</head>
<body>
<div id="wrap">

       <div class="header">
       		<div class="logo"><a href="index.html"><img src="images/logo.gif" alt="" title="" border="0" /></a></div>            
                <div id="menu">
                <ul>                                                                       
              <li class="selected">
							<a href="index.jsp">��ҳ</a>
						</li>
						<li>
							<a href="about.jsp">��������</a>
						</li>
						<li>
							<a href="category.jsp">��Ʒ����</a>
						</li>
						<li>
							<a href="specials.jsp">�ؼ���Ʒ</a>
						</li>
						<li>
							<a href="myaccount.jsp">��¼</a>
						</li>
						<li>
							<a href="register.jsp">ע��</a>
						</li>
												
						  <li><a href="account.jsp">�˻�����</a></li>
                </ul>
            </div>     
  
            
            
       </div> 
       
       
       <div class="center_content">
       	
        
        <div class="left_content">  
        
        </div><!--end of right content-->
        
        <div class="right_content">
            <div class="title"><span class="title_icon"><img src="images/bullet1.gif" alt="" title="" /></span>�û���¼</div>
        
        	<div class="feat_prod_box_details">
            <!-- ˳��˵һ�£�����ע�� 
            <p class="details">
             Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud.
            </p>
            -->
              	<div class="contact_form">
                <div class="form_subtitle">����������ʺź�����</div>
                  <form name="register" action="/ects/Login.func" method="post">          
                    <div class="form_row">
                    	<label class="contact"><strong>�û���:</strong></label>
                    	<input type="text" name="username"/>
                    </div> 
                    <div class="form_row">
                   	 	<label class="contact"><strong> �� �� :</strong></label>
                    	<input type="password" name="password"/>
                    </div>                     

                    <div class="form_row" style="margin-left:40px;">
                    	
                       <input type="checkbox" name="terms" />
                      		 ��ס����
	                       
                    </div> 
                    <div class="form_row">
                    	<input type="submit" class="register" value="��¼" />
                    	<a href="register.html" style="margin-left:40px;">���û�����ע��ɣ�</a>
                    </div>   
                    
                  </form> 
                </div>  
            
            </div>	
            
              

            

            
        <div class="clear"></div>
        </div><!--end of left content-->
       
       
       <div class="clear"></div>
       </div><!--end of center content-->
       
              
       <div class="footer">
       	<div class="left_footer"><img src="images/footer_logo.gif" alt="" title="" /><br /> <a href="http://csscreme.com/freecsstemplates/" title="free templates"><img src="images/csscreme.gif" alt="free templates" title="free templates" border="0" /></a></div>
        <div class="right_footer">
        <a href="#">home</a>
        <a href="#">about us</a>
        <a href="#">services</a>
        <a href="#">privacy policy</a>
        <a href="#">contact us</a>
       
        </div>
        
       
       </div>
    

</div>

</body>
</html>