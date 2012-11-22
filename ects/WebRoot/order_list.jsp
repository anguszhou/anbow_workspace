
<%@ page contentType="text/html; charset=GBK" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
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
           <div class="right_box">
             
             	<div class="title"><span class="title_icon"><img src="images/bullet5.gif" alt="" title="" /></span>Categories</div> 
                
                <ul class="list">
                <li><a href="#">accesories</a></li>
                <li><a href="#">premium parts</a></li>
                <li><a href="#">specials</a></li>
                <li><a href="#">best deals</a></li>
                <li><a href="#">accesories</a></li>
                <li><a href="#">premium parts</a></li>
                <li><a href="#">specials</a></li>
                <li><a href="#">best deals</a></li>
                <li><a href="#">accesories</a></li>
                <li><a href="#">premium parts</a></li>
                <li><a href="#">specials</a></li>                                              
                </ul>
                
             	<div class="title"><span class="title_icon"><img src="images/bullet6.gif" alt="" title="" /></span>Partners</div> 
                
                <ul class="list">
                <li><a href="#">accesories</a></li>
                <li><a href="#">premium parts</a></li>
                <li><a href="#">specials</a></li>
                <li><a href="#">best deals</a></li>
                <li><a href="#">accesories</a></li>
                <li><a href="#">premium parts</a></li>
                <li><a href="#">specials</a></li>
                <li><a href="#">best deals</a></li>
                <li><a href="#">accesories</a></li>                              
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
             
             </div>
        </div><!--end of right content-->
       
        <div class="right_content">
        <div class="title"><span class="title_icon"><img src="images/bullet1.gif" alt="" title="" /></span>����ϸ������¹��ﳵ����Ʒ<br/></div>
         <form action="${pageContext.request.contextPath}/orderList.do"  method="post">
        	<div class="feat_prod_box_details">
            
            <table class="cart_table">
            	<tr class="cart_title">
                	<td>���</td>
                	<td>ͼƬ</td>
                	<td>�ֻ�����</td>
                    <td>����</td>
                    <td>�۸�</td>
                    <td>����</td>   
                    <td>�ϼ�</td>            
                </tr>                
            	<c:forEach items="${cart.items}" var="orderline" varStatus="status">         
            	<tr>
                	<td>${status.count } </td>
                	<td><a href="${pageContext.request.contextPath}/ShowProductServlet1.func?productId=${orderline.value.product.id}"><img src="images/cart_thumb.gif" alt="" title="" border="0" class="cart_thumb" /></a></td>
                	<td>${orderline.value.product.name}</td>
                	<td>${orderline.value.product.category.name}</td>
                    <td>${orderline.value.product.basePrice}</td>
                    <td>${orderline.value.amount}</td>
                    <td>${orderline.value.product.basePrice*orderline.value.amount}</td>                           
                </tr>
                 </c:forEach>  
            </table>
            </div>	
            <div>
            �������û�ע���ͻ���Ϣȷ��,����仯���Ƚ��и��²�����
            <table class="cart_table">
            	<tr class="cart_title">
                	<td colspan="2">�û�ע����Ϣȷ��</td>            
                </tr>
                <tr>
                	<td>�û�����</td>
                	<td>
					<input name="username" value="${user.name}"/>
					</td>            
                </tr>
                <tr>
                	<td>��ϵ��ַһ��</td>
                	<td><input type="text" size="20" name="street1"  value="${user.info.street1 }"/></td>            
                </tr>
                <tr>
                	<td>��ϵ��ַ����</td>
                	<td><input type="text" size="20" name="street2"  value="${user.info.street2}"/></td>            
                </tr>
                <tr>
                	<td>�ʱࣺ</td>
                	<td><input type="text" size="20" name="zip" value="${user.info.zip}"/></td>            
                </tr>
                <tr>
                	<td>��ͥ�绰��</td>
                	<td><input type="text" size="20" name="homePhone" value="${user.info.homePhone}"/></td>            
                </tr>
                <tr>
                	<td>�칫�绰��</td>
                	<td><input type="text" size="20" name="officePhone" value="${user.info.officePhone}" /></td>            
                </tr>
                <tr>
                	<td>�ֻ���</td>
                	<td><input type="text" size="20" name="cellphone" value="${user.info.cellPhone}" /></td>            
                </tr>
                 <tr>
                	<td>Email��</td>
                	<td><input type="text" size="20" name="email" value="${user.info.email}" /></td>            
                </tr>
            </table>
            </div>
            <div align="center" style="margin-top:10px;">
            	<table>
            		<tr>
            			<td>��ѡ�񸶿ʽ��</td>
            			<td>
            				<select name="payway">
            					<option value="1">�ֽ�֧��</option>
            					<option value="2">����ת��</option>
            					<option value="3">����֧��</option>
            				</select>
            			</td>
            		</tr>
            	</table>
            </div>
            <div align="center" style="margin-top:10px;">
            	 <input type="submit"  value="�� ��" />
                  <input type="button"  value="ȡ ��"  onclick="location='index.jsp'" />
            </div>
      
        	<div class="clear"></div>
        </form>
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