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
            <div class="title"><span class="title_icon"><img src="images/bullet1.gif" alt="" title="" /></span>������ϸ��Ϣ<br /></div>
        
        	<div class="feat_prod_box_details">
            
            <table class="cart_table">
            	<tr class="cart_title">
                	<td>���</td>
                	<td>ͼƬ</td>
                	<td>��Ʒ����</td>
                    <td>����</td>
                    <td>�۸�</td>
                    <td>����</td>   
                    <td>�ϼ�</td>            
                </tr>
                <c:forEach items="${orderdetails.orderlines}" var="item" varStatus="status">   
            	<tr>
                	<td>${ status.count }</td>
                	<td><a href="${pageContext.request.contextPath}/details.do?pid=${ item.product.id }"><img src="images/cart_thumb.gif" alt="" title="" border="0" class="cart_thumb" /></a></td>
                	<td>${ item.product.name }<br /></td>
                    <td>${ item.product.category.name }</td>
                    <td>${ item.product.basePrice }</td>
                    <td>${ item.amount }</td>
                    <td>${ item.amount * item.product.basePrice }</td>               
                </tr> 
                </c:forEach>                 

            </table>
            </div>	
            <div>
      <table class="cart_table">
            	<tr class="cart_title">
                	<td colspan="2">�����û���Ϣ</td>            
                </tr>
                <tr>
                	<td>�û�����</td>
                	<td>${ orderdetails.name }</td>            
                </tr>
                <tr>
                	<td>��ϵ��ַһ��</td>
                	<td>${ orderdetails.user.info.street1 }</td>            
                </tr>
                <tr>
                	<td>����״̬��</td>
                	<td>${ orderdetails.status.name }</td>            
                </tr>
                <tr>
                	<td>���ʽ��</td>
                	<td>${ orderdetails.payWay.payStyle }</td>            
                </tr>
            </table>
          <p align="center">
            <input type="button"  value="�� ��"  onclick="location='index.jsp'" />
          </p>

            </div>
            <!--<div align="center" style="margin-top:10px;">
            	<button style="margin-left:20px;">����</button>
            </div>-->
        	<div class="clear"></div>
        </div>
        
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
       </div>
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