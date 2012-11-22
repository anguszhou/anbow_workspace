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
            
            
            <form>
      <table class="cart_table">
            	<tr class="cart_title">
                	<td width="74">序号</td>
                	<td width="120">订单编号</td>
                    <td width="120">订单金额</td>
                    <td width="150">订单状态</td>
                    <td width="120">付款方式</td> 
                    <td width="141">操作</td>              
                </tr>
                <c:forEach items="${orderList}" var="order" varStatus="status">
            	<tr>
                	<td>${ status.count }</td>
                	<td>${ order.name }</td>
                    <td>${ order.cost }</td>
                    <td >${ order.status.name }</td>
                    <td>${ order.payWay.payStyle }</td>  
                    <td>
                    
                    	<a href="${pageContext.request.contextPath}/viewOrder.do?orderId=${ order.id }" class="continue">订单明细</a>
                    
                    </td>             
              </tr>          
            	</c:forEach>
                               
             
            </table>
            
           <!-- <div align="center" style="margin-top:10px;">
            	 <input type="button"  value="继续购物"  onclick="location='index.html'" />
                  <input type="button"  value="返 回"  onclick="location='cart.html'" />
            </div>-->
            </form>
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