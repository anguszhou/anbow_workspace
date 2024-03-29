<%@ page contentType="text/html; charset=GBK" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Auto Parts</title>
<link rel="stylesheet" type="text/css" href="style.css" />
<script language="javascript">
	function check_num(caller)
	{
		if(caller.value<1)
		{
			alert('对不起，产品数量不能小于 1 ');
			caller.focus();
		}
	}
	function modifyCart(formName, productId, amount)  
  	{  
  		formName.action="${pageContext.request.contextPath}/modifyCart.do?productId="+productId+"&&amount="+amount;    

  		formName.submit();
  	} 
  	function cancelProduct(formName, productId)  
  	{  
  		formName.action="${pageContext.request.contextPath}/cancelProduct.do?productId="+productId;    
 
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
                <li class="selected"><a href="index.jsp">主页</a></li>
                <li><a href="about.jsp">关于我们</a></li>
                <li><a href="category.jsp">商品种类</a></li>
                <li><a href="productList.do">特价商品</a></li>
                <li><a href="myaccount.jsp">登录</a></li>
                <li><a href="register.jsp">注册</a></li>
                <!--<li><a href="details.html">prices</a></li>
                <li><a href="contact.html">联系我们</a></li>-->
                 <li><a href="account.jsp">账户管理</a></li>
                </ul>
            </div> 
          
       </div> 
       
       
       <div class="center_content">

        
        <div class="left_content">
        
             
        
             
             
             <div class="right_box">
             
             	<div class="title"><span class="title_icon"><img src="images/bullet5.gif" alt="" title="" /></span>商品分类</div> 
                
                <ul class="list">
                <li><a href="#">ThinkPad(IBM)</a></li>
                <li><a href="#">Apple/苹果</a></li>
                <li><a href="#">Asus/华硕</a></li>
                <li><a href="#">HP/惠普</a></li>
                <li><a href="#">Haier/海尔</a></li>
                <li><a href="#">Lenovo/联想</a></li>
                <li><a href="#">Dell/戴尔</a></li>
                <li><a href="#">Toshiba/东芝</a></li>
                <li><a href="#">Sony/索尼</a></li>
                <li><a href="#">Samsung/三星</a></li>
                <li><a href="#">Fido/七喜</a></li>                                              
                </ul>
                <div class="clear"></div>
       	      <div class="title"><span class="title_icon"><img src="images/bullet6.gif" alt="" title="" /></span>相关产品</div> 
                
                <ul class="list">
                <li><a href="#">笔记本电脑包</a></li>
                <li><a href="#">笔记本电池</a></li>
                <li><a href="#">笔记本电源适配器</a></li>
                <li><a href="#">液晶屏贴膜</a></li>
                <li><a href="#">笔记本小音箱</a></li>
                <li><a href="#">笔记本散热底座</a></li>
                <li><a href="#">笔记本键盘</a></li>
                <li><a href="#">笔记本支架/床上桌</a></li>                             
                </ul>      
             
             </div>
             
          <div class="right_box">
             
             </div>
        </div><!--end of right content-->
       
        
        <div class="right_content">
          <div class="cart">
      <div class="title"><span class="title_icon"><img src="images/cart.gif" alt="" title="" /></span>购物车</div>
                  
                 
              
          </div>
        	<div class="feat_prod_box_details">
            
            
      <form  method="post">     <!-- action="${pageContext.request.contextPath}/modifyCart.do?orderLineId=${ item.value.product.id }" --> 
      <table class="cart_table">
            	<tr class="cart_title">
                	<td width="74">商品照片</td>
                	<td width="72">商品名称</td>
                    <td width="32">单价</td>
                    <td>数量</td>
                    <td width="40">合计</td> 
                    <td width="141">操作</td>              
                </tr>
             <c:forEach items="${shopCart.items}" var="item" varStatus="status">
             
            	<tr>
                	<td><a href="${pageContext.request.contextPath}/details.do?pid=${ item.value.product.id }"><img src="images/cart_thumb.gif" alt="" title="" border="0" class="cart_thumb" /></a></td>
                	<td>${ item.value.product.name }</td>
                    <td>${ item.value.product.basePrice }</td>
                    <td class=tablebody2 valign=middle align=center width="40">
                    <input id="${ status.count }" type="text" name="amount" value="${ item.value.amount }" size="4" onblur="check_num(this);"/></td>
                    <td>${ item.value.product.basePrice*item.value.amount}</td>
                    <td>
                    	<input type="button" value="返回" onclick="history.go(-1)"/>
                    	
                    	<input type="button" value="保存修改" onclick="modifyCart(this.form, ${ item.value.product.id }, document.getElementById(${ status.count }).value)"  /> 
                    	<input type="button" value="取消商品" onclick="cancelProduct(this.form, ${ item.value.product.id })"  /> 
					</td>               
                </tr>  
              </c:forEach>  
                <tr>
                <td colspan="4" class="cart_total"><span class="red">总计金额:</span></td>
                <td> ${ shopCart.total }</td>                
                </tr>                  
             
            </table>
            </form>
            <center>
				<a href="${pag6eContext.request.contextPath}/clearCart.do">清空购物车</a>
            </center>
            
            <a href="productList.do" class="continue">&lt;继续购物</a>
            <a href="${pageContext.request.contextPath}/order_list.jsp" class="checkout">付款订货 &gt;</a> 
           </div>	
            
        <div class="clear"></div>
        </div><!--end of left content-->
       
      <div class="rank_content">
       		<div class="right_box">
             
             	 <div class="title"><span class="title_icon"><img src="images/bullet5.gif" alt="" title="" /></span>排行榜</div> 
                
                <ul class="list">
                <li><a href="#">ThinkPad(IBM)</a></li>
                <li><a href="#">Apple/苹果</a></li>
                <li><a href="#">Asus/华硕</a></li>
                <li><a href="#">HP/惠普</a></li>
                <li><a href="#">Haier/海尔</a></li>
                <li><a href="#">Lenovo/联想</a></li>
                <li><a href="#">Dell/戴尔</a></li>
                <li><a href="#">Toshiba/东芝</a></li>
                <li><a href="#">Sony/索尼</a></li>
                <li><a href="#">Samsung/三星</a></li>
                <li><a href="#">Fido/七喜</a></li>                                              
                </ul>
           </div>
       
       </div>
       
       <div class="clear"></div>
       </div><!--end of center content-->
       
              
       <div class="footer">
       	<div class="left_footer"><img src="images/footer_logo.gif" alt="" title="" /><br />
       	</div>
        <div class="right_footer">
        <a href="about.html">关于我们</a>
            <a href="category.html">商品种类</a>
            <a href="specials.html">特价商品</a>
            <a href="myaccount.html">登录</a>
            <a href="register.html">注册</a>
            <!--<li><a href="details.html">prices</a></li>-->
            <a href="contact.html">联系我们</a>
       
        </div>
        
       
       </div>
    

</div>

</body>
</html>