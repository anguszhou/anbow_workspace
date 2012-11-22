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
            <div class="cart">
                  <div class="title"><span class="title_icon"><img src="images/cart.gif" alt="" title="" /></span>My cart</div>
                  <div class="home_cart_content">
                  3 x items | <span class="red">TOTAL: 100$</span>
                  </div>
                  <a href="cart.html" class="view_cart">view cart</a>
              </div>
                     
            <div id="menu">
                <ul>                                                                       
              <li class="selected">
							<a href="index.jsp">��ҳ</a>
						</li>
						<li>
							<a href="about.jsp">��������</a>
						</li>
						<li>
							<a href="/ects/ShowProductServlet.func">��Ʒ����</a>
						</li>
						<li>
							<a href="specials.jsp">�ؼ���Ʒ</a>
						</li>
						<li>
							<a href="/ects/toLogin.func">��¼</a>
						</li>
						<li>
							<a href="/ects/logout.do">�˳�</a>
						</li>
						<li>
							<a href="/ects/AddUserServlet1.func">ע��</a>
						</li>
												
						  <li><a href="/ects/toModify.func">�˻�����</a></li>
                </ul>
            </div>     
            
            
       </div> 
       
       <form method="post" action="/ects/user/manager.do?methodName=find">
      <table class="tableBorder2" align="center" border="1" 
cellpadding="3" cellspacing="1">
		<tbody><tr>
		<td height="25">
          ��Ʒ�߼�����:          
        </td>
        <td>�����������ؼ���:</td>
        <td height="25">
          <input name="name" size="20" type="text"/>         
        </td>
         <td>��ѡ����������:</td>
        <td height="25">
            <select name="tj">
            <option selected="selected" value="1" >---��������---</option>
            <option value="2">---��������---</option>
            <option value="3">---��������---</option>
            <option value="4">---��ͼ����---</option>
            </select>       
        </td>
        <td>
        <input value="�� ʼ �� ��" type="submit"/>
        </td>
        </tr>
		</tbody></table>
      </form>
       
       
       <div class="center_content">
        
        <div class="left_content">
        	
             <div class="right_box">
             
           <div class="title"><span class="title_icon"><img src="images/bullet5.gif" alt="" title="" /></span>��Ʒ����</div> 
                
                <ul class="list">
                <li><a href="#">ThinkPad(IBM)</a></li>
                <li><a href="#">Apple/ƻ��</a></li>
                <li><a href="#">Asus/��˶</a></li>
                <li><a href="#">HP/����</a></li>
                <li><a href="#">Haier/����</a></li>
                <li><a href="#">Lenovo/����</a></li>
                <li><a href="#">Dell/����</a></li>
                <li><a href="#">Toshiba/��֥</a></li>
                <li><a href="#">Sony/����</a></li>
                <li><a href="#">Samsung/����</a></li>
                <li><a href="#">Fido/��ϲ</a></li>                                              
                </ul>
                <div class="clear"></div>
       	      <div class="title"><span class="title_icon"><img src="images/bullet6.gif" alt="" title="" /></span>��ز�Ʒ</div> 
                
                <ul class="list">
                <li><a href="#">�ʼǱ����԰�</a></li>
                <li><a href="#">�ʼǱ����</a></li>
                <li><a href="#">�ʼǱ���Դ������</a></li>
                <li><a href="#">Һ������Ĥ</a></li>
                <li><a href="#">�ʼǱ�С����</a></li>
                <li><a href="#">�ʼǱ�ɢ�ȵ���</a></li>
                <li><a href="#">�ʼǱ�����</a></li>
                <li><a href="#">�ʼǱ�֧��/������</a></li>                              
                </ul>      
             
             </div>
        </div><!--end of right content-->
        
        <div class="right_content">
        	
            <div class="title"><span class="title_icon"><img src="images/bullet1.gif" alt="" title="" /></span>Featured products</div>
        
        	<div class="feat_prod_box">
            
            	<div class="prod_img"><a href="details.html"><img src="images/prod1.gif" alt="" title="" border="0" /></a></div>
                
                <div class="prod_det_box">
                	<div class="box_top"></div>
                    <div class="box_center">
                    <div class="prod_title">Product name</div>
                    <p class="details">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.</p>
                    <a href="details.html" class="more">- more details -</a>
                    <div class="clear"></div>
                    </div>
                    
                    <div class="box_bottom"></div>
                </div>    
            <div class="clear"></div>
            </div>	
            
            
        	<div class="feat_prod_box">
            
            	<div class="prod_img"><a href="details.html"><img src="images/prod2.gif" alt="" title="" border="0" /></a></div>
                
                <div class="prod_det_box">
                	<div class="box_top"></div>
                    <div class="box_center">
                    <div class="prod_title">Product name</div>
                    <p class="details">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.</p>
                    <a href="details.html" class="more">- more details -</a>
                    <div class="clear"></div>
                    </div>
                    
                    <div class="box_bottom"></div>
                </div>    
            <div class="clear"></div>
            </div>      
            
            
            
           <div class="title"><span class="title_icon"><img src="images/bullet2.gif" alt="" title="" /></span>�ؼ���Ʒ</div> 
           
           <div class="new_products">
           
                    <div class="new_prod_box">
                        <div class="new_prod_bg">
                        <span class="new_icon"><img src="images/promo_icon.gif" alt="" title="" /></span>
                        <a href="details.html"><img src="images/thumb1.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div>   
                        <a href="details.html">����</a>  
                        <a href="details.html">1000Ԫ</a>        
                    </div>
                    
                   <div class="new_prod_box">
                        <div class="new_prod_bg">
                        <span class="new_icon"><img src="images/promo_icon.gif" alt="" title="" /></span>
                        <a href="details.html"><img src="images/thumb3.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div>   
                         <a href="details.html">����</a>  
                        <a href="details.html">2000Ԫ</a>        
                    </div>              
                                
                    
                    <div class="new_prod_box">
                        <div class="new_prod_bg">
                        <span class="new_icon"><img src="images/promo_icon.gif" alt="" title="" /></span>
                        <a href="details.html"><img src="images/thumb3.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div>     
                        <a href="details.html">��˶</a>  
                        <a href="details.html">2000Ԫ</a>         
                    </div>
           </div> 
       <div class="clear"></div>
       
       
        <div class="title"><span class="title_icon"><img src="images/bullet2.gif" alt="" title="" /></span>�»��ϼ�</div> 
           
           <div class="new_products">
           
                    <div class="new_prod_box">
                        <div class="new_prod_bg">
                        <span class="new_icon"><img src="images/new_icon.gif" alt="" title="" /></span>
                        <a href="details.html"><img src="images/thumb1.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div>      
                        <a href="details.html">product name</a> 
                        <a href="details.html">product name</a>     
                    </div>
                    
                    <div class="new_prod_box">
                        <div class="new_prod_bg">
                        <span class="new_icon"><img src="images/new_icon.gif" alt="" title="" /></span>
                        <a href="details.html"><img src="images/thumb2.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div> 
                         <a href="details.html">product name</a> 
                        <a href="details.html">product name</a>            
                    </div>                    
                    
                    <div class="new_prod_box">
                        <div class="new_prod_bg">
                        <span class="new_icon"><img src="images/new_icon.gif" alt="" title="" /></span>
                        <a href="details.html"><img src="images/thumb3.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div>     
                         <a href="details.html">product name</a> 
                        <a href="details.html">product name</a>        
                    </div>                             
           </div> 
       <div class="clear"></div>
       
         
           <div class="title"><span class="title_icon"><img src="images/bullet2.gif" alt="" title="" /></span>�Ƽ���Ʒ</div> 
           
           <div class="new_products">
           
                    <div class="new_prod_box">
                        <div class="new_prod_bg">
                        <span class="new_icon"><img src="images/promo_icon.gif" alt="" title="" /></span>
                        <a href="details.html"><img src="images/thumb1.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div>   
                        <a href="details.html">����</a>  
                        <a href="details.html">1000Ԫ</a>        
                    </div>
                    
                   <div class="new_prod_box">
                        <div class="new_prod_bg">
                        <span class="new_icon"><img src="images/promo_icon.gif" alt="" title="" /></span>
                        <a href="details.html"><img src="images/thumb3.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div>   
                         <a href="details.html">����</a>  
                        <a href="details.html">2000Ԫ</a>        
                    </div>              
                                
                    
                    <div class="new_prod_box">
                        <div class="new_prod_bg">
                        <span class="new_icon"><img src="images/promo_icon.gif" alt="" title="" /></span>
                        <a href="details.html"><img src="images/thumb3.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div>     
                        <a href="details.html">��˶</a>  
                        <a href="details.html">2000Ԫ</a>         
                    </div>
           </div> 
       <div class="clear"></div>
       
        </div><!--end of left content-->
       
       <div class="rank_content">
       		<div class="right_box">
             
             	 <div class="title"><span class="title_icon"><img src="images/bullet5.gif" alt="" title="" /></span>���а�</div> 
                
                <ul class="list">
                <li><a href="#">ThinkPad(IBM)</a></li>
                <li><a href="#">Apple/ƻ��</a></li>
                <li><a href="#">Asus/��˶</a></li>
                <li><a href="#">HP/����</a></li>
                <li><a href="#">Haier/����</a></li>
                <li><a href="#">Lenovo/����</a></li>
                <li><a href="#">Dell/����</a></li>
                <li><a href="#">Toshiba/��֥</a></li>
                <li><a href="#">Sony/����</a></li>
                <li><a href="#">Samsung/����</a></li>
                <li><a href="#">Fido/��ϲ</a></li>                                              
                </ul>
           </div>
       
       </div>
       
       
       
       
       <div class="clear"></div>
       </div><!--end of center content-->
       
              
       <div class="footer">
       	<div class="left_footer"><img src="images/footer_logo.gif" alt="" title="" /><br /> <a href="http://csscreme.com/freecsstemplates/" title="free templates"><img src="images/csscreme.gif" alt="free templates" title="free templates" border="0" /></a></div>
        <div class="right_footer">
        <a href="about.html">��������</a>
            <a href="category.html">��Ʒ����</a>
            <a href="specials.html">�ؼ���Ʒ</a>
            <a href="myaccount.html">��¼</a>
            <a href="register.html">ע��</a>
            <!--<li><a href="details.html">prices</a></li>-->
            <a href="contact.html">��ϵ����</a>
                   
       
        </div>
        
       
       </div>
    

</div>

</body>
</html>