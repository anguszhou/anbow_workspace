<%@ page contentType="text/html; charset=GBK" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk" />
<title>Auto Parts</title>
<link rel="stylesheet" type="text/css" href="style.css" />
	<link rel="stylesheet" href="lightbox.css" type="text/css" media="screen" />
	
	<script src="js/prototype.js" type="text/javascript"></script>
	<script src="js/scriptaculous.js?load=effects" type="text/javascript"></script>
	<script src="js/lightbox.js" type="text/javascript"></script>
    <script type="text/javascript" src="js/java.js"></script>
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
        	<div class="crumb_nav">
            <a href="index.html">主页</a> &gt;&gt; 商品名称
            </div>
            <div class="title"><span class="title_icon"><img src="images/bullet1.gif" alt="" title="" /></span>商品名称</div>
        
        	<div class="feat_prod_box_details">
            
            	<div class="prod_img"><a href="details.html"><img src="images/prod1.gif" alt="" title="" border="0" /></a>
                <br /><br />
                <a href="images/big_pic.jpg" rel="lightbox"><img src="images/zoom.gif" alt="" title="" border="0" /></a>
                </div>
                
                <div class="prod_det_box">
                	<div class="box_top"></div>
                    <div class="box_center">
                    <div class="prod_title">详细介绍</div>
                    
                    <div class="price"><strong>品牌:</strong> <span class="red">${product.name}</span></div>
                    <div class="price"><strong>型号:</strong> <span class="red">${product.author}</span></div>                 
                    <div class="price"><strong>价格:</strong> <span class="red">${product.publish}</span></div>
                    <div class="price"><strong>机型:</strong> <span class="red">${product.pages}</span></div>
                     <div class="price"><strong>CPU:</strong> <span class="red">${product.images}</span></div>
                      <div class="price"><strong>显卡:</strong> <span class="red">${product.basePrice}</span></div>
                    <div class="price"><strong>主频:</strong> <span class="red">2.74GHz</span></div>
                    <div class="price"><strong>内存:</strong> <span class="red">3G</span></div>
                    <div class="price"><strong>硬盘:</strong> <span class="red">250G</span></div>
                     <a href="/ects/addOrderLine.do?productId=${product.id}" class="checkout">加入订单 &gt;</a>
                    <div class="clear"></div>
                    </div>
                    
                    <div class="box_bottom"></div>
                </div>    
            <div class="clear"></div>
            </div>	
      
            <hr />
            <div id="demo" class="demolayout">

                <ul id="demo-nav" class="demolayout">
                <li><a class="active" href="#tab1">更多介绍
                </a></li>
                <li><a class="" href="#tab2">相关产品</a></li>
                </ul>
    
            <div class="tabs-container">
            
                    <div style="display: block;" class="tab" id="tab1">
                                        <p class="more_details">
                                      </p>
                                      <!--  
                            <ul class="list">
                            <li><a href="#">Lorem ipsum dolor sit amet, consectetur adipisicing elit</a></li>
                            <li><a href="#">Lorem ipsum dolor sit amet, consectetur adipisicing elit</a></li>
                            <li><a href="#">Lorem ipsum dolor sit amet, consectetur adipisicing elit</a></li>
                            <li><a href="#">Lorem ipsum dolor sit amet, consectetur adipisicing elit</a></li>                                          
                            </ul> -->  
                                         <p class="more_details">  ${product.descriptions}   </p>                       
                    </div>	
                    
                            <div style="display: none;" class="tab" id="tab2">
                    <div class="new_prod_box">
                        <a href="details.html">商品名称</a>
                        <div class="new_prod_bg">
                        <a href="details.html"><img src="images/thumb1.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div>           
                    </div>
                    
                    <div class="new_prod_box">
                        <a href="details.html">商品名称</a>
                        <div class="new_prod_bg">
                        <a href="details.html"><img src="images/thumb2.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div>           
                    </div>                    
                    
                    <div class="new_prod_box">
                        <a href="details.html">商品名称</a>
                        <div class="new_prod_bg">
                        <a href="details.html"><img src="images/thumb3.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div>           
                    </div>    

                    <div class="new_prod_box">
                        <a href="details.html">商品名称</a>
                        <div class="new_prod_bg">
                        <a href="details.html"><img src="images/thumb1.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div>           
                    </div>
                    
                    <div class="new_prod_box">
                        <a href="details.html">商品名称</a>
                        <div class="new_prod_bg">
                        <a href="details.html"><img src="images/thumb2.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div>           
                    </div>                    
                    
                    <div class="new_prod_box">
                        <a href="details.html">商品名称</a>
                        <div class="new_prod_bg">
                        <a href="details.html"><img src="images/thumb3.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div>           
                    </div>  


                   
                    <div class="clear"></div>
                            </div>	
            
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
        <a href="#">主页</a>
        <a href="#">介绍</a>
        <a href="#">服务</a>
        <a href="#">隐私政策</a>
        <a href="#">联系我们</a>
       
        </div>
        
       
       </div>
    

</div>

</body>

</html>