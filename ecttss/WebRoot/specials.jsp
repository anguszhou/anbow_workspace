<%@ page contentType="text/html; charset=GBK" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Auto Parts</title>
<link rel="stylesheet" type="text/css" href="style.css" />

</head>
<body>
<div id="wrap">

       <div class="header">
       		<div class="logo"><a href="index.html"><img src="images/logo.gif" alt="" title="" border="0" /></a></div>            
            <div id="menu">
                <ul>                                                                       
                <li class="selected"><a href="index.jsp">��ҳ</a></li>
                <li><a href="about.jsp">��������</a></li>
                <li><a href="category.jsp">��Ʒ����</a></li>
                <li><a href="productList.do">�ؼ���Ʒ</a></li>
                <li><a href="myaccount.jsp">��¼</a></li>
                <li><a href="register.jsp">ע��</a></li>
                <!--<li><a href="details.html">prices</a></li>
                <li><a href="contact.html">��ϵ����</a></li>-->
                 <li><a href="account.jsp">�˻�����</a></li>
                </ul>
            </div> 
   
            
            
       </div> 
       
       
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
             
             <div class="right_box">
             
             	<div class="title"><span class="title_icon"><img src="images/bullet4.gif" alt="" title="" /></span>Promotions</div> 
                    <div class="new_prod_box">
                        <a href="details.html">product name</a>
                        <div class="new_prod_bg">
                        <span class="new_icon"><img src="images/promo_icon.gif" alt="" title="" /></span>
                        <a href="details.html"><img src="images/thumb1.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div>           
                    </div>
                    
                    <div class="new_prod_box">
                        <a href="details.html">product name</a>
                        <div class="new_prod_bg">
                        <span class="new_icon"><img src="images/promo_icon.gif" alt="" title="" /></span>
                        <a href="details.html"><img src="images/thumb2.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div>           
                    </div>                    
                    
                    <div class="new_prod_box">
                        <a href="details.html">product name</a>
                        <div class="new_prod_bg">
                        <span class="new_icon"><img src="images/promo_icon.gif" alt="" title="" /></span>
                        <a href="details.html"><img src="images/thumb3.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div>           
                    </div>              
             
             </div>
         </div><!--end of right content-->
        
        	<div class="right_content">
        	
            <div class="title"><span class="title_icon"><img src="images/bullet1.gif" alt="" title="" />��Ʒ�б�<br /></span></div>
        
			<c:forEach items="${productList}" var="product" varStatus="status">     
        	<div class="feat_prod_box">
            	<div class="prod_img">
            		<a href="details.html"><img src="${product.images}" alt="image" title="image" border="0" /></a>
            	</div>
                
                <div class="prod_det_box">
                <!--<span class="special_icon"><img src="images/special_icon.gif" alt="" title="" /></span>  -->
                	<div class="box_top"></div>
                    <div class="box_center">
                    <div class="prod_title">${product.name}</div>
                    <div class="prod_title">${product.author}</div>
                    <p class="details">${product.publish}</p>
                    <p class="details">${product.basePrice}</p>
               		<!--<a href="details.jsp?pid=${ product.id }"><img src="images/thumb1.gif" alt="" title="" class="thumb" border="0" /></a>  --> 
                    <a href="${pageContext.request.contextPath}/findById.do?pid=${ product.id }" class="more">- ��ϸ��Ϣ -</a>
                    <div class="clear"></div>
                    </div>
                    <div class="box_bottom"></div>
                </div>    
           		 <div class="clear"></div>
            </div>
            </c:forEach>   
            
           <div class="pagination">
            <span class="disabled"></span><span class="current">1</span><a href="#?page=2">2</a><a href="#?page=3">3</a>��<a href="#?page=199">10</a><a href="#?page=200">11</a><a href="#?page=2"></a>
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
       	<div class="left_footer"><img src="images/footer_logo.gif" alt="" title="" /><br />
       	</div>
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