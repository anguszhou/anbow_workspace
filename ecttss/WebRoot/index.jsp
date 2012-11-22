<%@ page contentType="text/html; charset=GBK" %>
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
            <div class="cart">
                  <div class="title"><span class="title_icon"><img src="images/cart.gif" alt="" title="" /></span>My cart</div>
                  <div class="home_cart_content">
                  3 x items | <span class="red">TOTAL: 100$</span>
                  </div>
                  <a href="cart.html" class="view_cart">view cart</a>
              </div>
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

         <form method="post" action="/ects/user/manager.do?methodName=find">
      <table class="tableBorder2" align="center" border="1" 
cellpadding="3" cellspacing="1">
		<tbody><tr>
		<td height="25">
          商品高级搜索:          
        </td>
        <td>请输入搜索关键字:</td>
        <td height="25">
          <input name="name" size="20" type="text"/>         
        </td>
         <td>请选择搜索条件:</td>
        <td height="25">
            <select name="tj">
            <option selected="selected" value="1" >---条件不限---</option>
            <option value="2">---按作者名---</option>
            <option value="3">---按出版社---</option>
            <option value="4">---按图书名---</option>
            </select>       
        </td>
        <td>
        <input value="开 始 搜 索" type="submit"/>
        </td>
        </tr>
		</tbody></table>
      </form>
       
       
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
            
            
            
           <div class="title"><span class="title_icon"><img src="images/bullet2.gif" alt="" title="" /></span>特价商品</div> 
           
           <div class="new_products">
           
                    <div class="new_prod_box">
                        <div class="new_prod_bg">
                        <span class="new_icon"><img src="images/promo_icon.gif" alt="" title="" /></span>
                        <a href="details.html"><img src="images/thumb1.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div>   
                        <a href="details.html">戴尔</a>  
                        <a href="details.html">1000元</a>        
                    </div>
                    
                   <div class="new_prod_box">
                        <div class="new_prod_bg">
                        <span class="new_icon"><img src="images/promo_icon.gif" alt="" title="" /></span>
                        <a href="details.html"><img src="images/thumb3.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div>   
                         <a href="details.html">联想</a>  
                        <a href="details.html">2000元</a>        
                    </div>              
                                
                    
                    <div class="new_prod_box">
                        <div class="new_prod_bg">
                        <span class="new_icon"><img src="images/promo_icon.gif" alt="" title="" /></span>
                        <a href="details.html"><img src="images/thumb3.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div>     
                        <a href="details.html">华硕</a>  
                        <a href="details.html">2000元</a>         
                    </div>
           </div> 
       <div class="clear"></div>
       
       
        <div class="title"><span class="title_icon"><img src="images/bullet2.gif" alt="" title="" /></span>新货上架</div> 
           
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
       
         
           <div class="title"><span class="title_icon"><img src="images/bullet2.gif" alt="" title="" /></span>推荐商品</div> 
           
           <div class="new_products">
           
                    <div class="new_prod_box">
                        <div class="new_prod_bg">
                        <span class="new_icon"><img src="images/promo_icon.gif" alt="" title="" /></span>
                        <a href="details.html"><img src="images/thumb1.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div>   
                        <a href="details.html">戴尔</a>  
                        <a href="details.html">1000元</a>        
                    </div>
                    
                   <div class="new_prod_box">
                        <div class="new_prod_bg">
                        <span class="new_icon"><img src="images/promo_icon.gif" alt="" title="" /></span>
                        <a href="details.html"><img src="images/thumb3.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div>   
                         <a href="details.html">联想</a>  
                        <a href="details.html">2000元</a>        
                    </div>              
                                
                    
                    <div class="new_prod_box">
                        <div class="new_prod_bg">
                        <span class="new_icon"><img src="images/promo_icon.gif" alt="" title="" /></span>
                        <a href="details.html"><img src="images/thumb3.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div>     
                        <a href="details.html">华硕</a>  
                        <a href="details.html">2000元</a>         
                    </div>
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
       	<div class="left_footer"><img src="images/footer_logo.gif" alt="" title="" /><br /> <a href="http://csscreme.com/freecsstemplates/" title="free templates"><img src="images/csscreme.gif" alt="free templates" title="free templates" border="0" /></a></div>
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