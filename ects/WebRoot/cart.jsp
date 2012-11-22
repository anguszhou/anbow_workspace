<%@ page contentType="text/html; charset=GBK" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk" />
<title>Auto Parts</title>
<link rel="stylesheet" type="text/css" href="style.css" />
<script language="javascript">
	function check_num(caller)
	{
		if(caller.value<1)
		{
			alert('�Բ��𣬲�Ʒ��������С�� 1 ');
			caller.focus();
		}
	}
		function modifyCart(formName, productId, amount)  
  	{  
  		formName.action="${pageContext.request.contextPath}/modifyCart.do?productId="+productId+"&&amount="+amount;    

  		formName.submit();
  	} 
  	function deleteProduct(formName, productId)  
  	{  
  		formName.action="${pageContext.request.contextPath}/deleteProduct.do?productId="+productId;    
 
  		formName.submit();
  	}  
</script>
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
            
            
       <form  method="post">
      <table class="cart_table">
            	<tr class="cart_title">
                	<td width="74">��Ʒ��Ƭ</td>
                	<td width="72">��Ʒ����</td>
                    <td width="32">����</td>
                    <td>����</td>
                    <td width="40">�ϼ�</td> 
                    <td width="141">����</td>              
                </tr>
                
            	     
            	<c:forEach items="${cart.items}" var="orderline" varStatus="status">         
            	<tr>
                	<td><a href="${pageContext.request.contextPath}/ShowProductServlet1.func?productId=${orderline.value.product.id}"><img src="images/cart_thumb.gif" alt="" title="" border="0" class="cart_thumb" /></a></td>
                	<td>${orderline.value.product.name}</td>
                    <td>${orderline.value.product.basePrice}</td>
                    <td class=tablebody2 valign=middle align=center width="40">
                    <input id="${status.count}"  type="text" name="num" value="${orderline.value.amount}" size="4" onblur="check_num(this);"/></td>
                    <td>${orderline.value.product.basePrice * orderline.value.amount}</td>  
                    <td><input type="button" value="����" onclick="history.go(-1)"/>
                       <input type="button" value="�����޸�" onclick="modifyCart(this.form, ${ orderline.value.product.id }, document.getElementById(${ status.count }).value)"  /> 
                    	<input type="button" value="ȡ����Ʒ" onclick="deleteProduct(this.form, ${ orderline.value.product.id })"  /> 
					</td>             
                </tr>
                 </c:forEach>     

                <!--
                <tr>
                <td colspan="4" class="cart_total"><span class="red">TOTAL SHIPPING:</span></td>
                <td> 250$</td>                
                </tr>  
                -->
                
                <tr>
                <td colspan="4" class="cart_total"><span class="red">�ܼƽ��:</span></td>
                <td>${total}</td>                
                </tr>                  
             
            </table>
            <center>             
					<input type="button" onclick="javascript:window.location='${pageContext.request.contextPath}/deleteOrderLine.do?methodName=deleteCart';" value="��չ��ﳵ"/>  
            </center>
            </form>
            <a href="${pageContext.request.contextPath}/ShowProductServlet.func" class="continue">&lt;��������</a>
            <a href="${pageContext.request.contextPath}/order_list.jsp"  class="checkout">����� &gt;</a> 
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