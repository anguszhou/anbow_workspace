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
							<a href="index.jsp">主页</a>
						</li>
						<li>
							<a href="about.jsp">关于我们</a>
						</li>
						<li>
							<a href="category.jsp">商品种类</a>
						</li>
						<li>
							<a href="specials.jsp">特价商品</a>
						</li>
						<li>
							<a href="myaccount.jsp">登录</a>
						</li>
						<li>
							<a href="register.jsp">注册</a>
						</li>
												
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
             
            <!-- <div class="right_box">
             
             	<div class="title"><span class="title_icon"><img src="images/bullet4.gif" alt="" title="" /></span>特价商品</div> 
                 <div class="clear"></div>
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
                        <a href="details.html"><img src="images/thumb3.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div>           
                    </div>              
             
             </div>-->
        </div><!--end of right content-->
        
        <div class="right_content">
            <div class="title"><span class="title_icon"><img src="images/bullet1.gif" alt="" title="" /></span>订单详细信息<br /></div>
        
        	<div class="feat_prod_box_details">
            
            <table class="cart_table">
            	<tr class="cart_title">
                	<td>序号</td>
                	<td>图片</td>
                	<td>产品名称</td>
                    <td>分类</td>
                    <td>价格</td>
                    <td>数量</td>   
                    <td>合计</td>            
                </tr>   
             <c:forEach items="${orderinfo.orderlines}" var="orderline" varStatus="status">
            	<tr>
                	<td>${status.count}</td>
                	<td><a href="${pageContext.request.contextPath}/ShowProductServlet1.func?productId=${orderline.product.id}"><img src="images/cart_thumb.gif" alt="" title="" border="0" class="cart_thumb" /></a></td>
                	<td>${orderline.product.name}<br /></td>
                	<td>${orderline.product.category.name}</td>
                    <td>${orderline.product.basePrice}</td>
                    <td>${orderline.amount}</td>
                    <td>${orderline.amount * orderline.product.basePrice}</td>
                                   
                </tr>                   
             </c:forEach>                 
            	
            	<tr>
                	<td>&nbsp;</td>
                	<td>&nbsp;</td>
                	<td>件数<br /></td>
                    <td>${amount}</td>           
                    <td>总计：<br/></td>
                    <td>${cost}</td>               
                </tr>
            </table>
            </div>	
            <div>
      <table class="cart_table">
            	<tr class="cart_title">
                	<td colspan="2">订单用户信息</td>            
                </tr>
                <tr>
                	<td>用户名：</td>
                	<td>${orderinfo.user.name}</td>            
                </tr>
                <tr>
                	<td>联系地址一：</td>
                	<td>${orderinfo.user.info.street1}</td>            
                </tr>
                <tr>
                	<td>订单状态：</td>
                	<td>${orderinfo.status.name}</td>            
                </tr>
                <tr>
                	<td>付款方式：</td>
                	<td>${orderinfo.payWay.payStyle}</td>            
                </tr>
            </table>
          <p align="center">
            <input type="button"  value="返 回"  onclick="history.go(-1)" />
          </p>

            </div>
            <!--<div align="center" style="margin-top:10px;">
            	<button style="margin-left:20px;">返回</button>
            </div>-->
        	<div class="clear"></div>
        </div>
        
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