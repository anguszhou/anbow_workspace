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
             
             </div>
        </div><!--end of right content-->
       
        
        <div class="right_content">
          <div class="cart">
      <div class="title"><span class="title_icon"><img src="images/cart.gif" alt="" title="" /></span>���ﳵ</div>
                  
                 
              
          </div>
        	<div class="feat_prod_box_details">
            
            
            <form>
      <table class="cart_table">
            	<tr class="cart_title">
                	<td width="74">���</td>
                	<td width="120">�������</td>
                    <td width="120">�������</td>
                    <td width="150">����״̬</td>
                    <td width="120">���ʽ</td> 
                    <td width="141">����</td>              
                </tr>
                <c:forEach items="${orderList}" var="order" varStatus="status">
            	<tr>
                	<td>${ status.count }</td>
                	<td>${ order.name }</td>
                    <td>${ order.cost }</td>
                    <td >${ order.status.name }</td>
                    <td>${ order.payWay.payStyle }</td>  
                    <td>
                    
                    	<a href="${pageContext.request.contextPath}/viewOrder.do?orderId=${ order.id }" class="continue">������ϸ</a>
                    
                    </td>             
              </tr>          
            	</c:forEach>
                               
             
            </table>
            
           <!-- <div align="center" style="margin-top:10px;">
            	 <input type="button"  value="��������"  onclick="location='index.html'" />
                  <input type="button"  value="�� ��"  onclick="location='cart.html'" />
            </div>-->
            </form>
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