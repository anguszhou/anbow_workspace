<%@ page contentType="text/html; charset=GBK" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=gbk" />
		<title>Auto Parts</title>
		<link rel="stylesheet" type="text/css" href="style.css" />
		<script language="javascript">
			function check_null(caller){
				
				if(caller.value.length == 0)
				{
					alert("�����Ϊ��");
					caller.focus(); 
				}
			}
		</script>
	</head>
	<body>
		<div id="wrap">

			<div class="header">
				<div class="logo">
					<a href="index.html"><img src="images/logo.gif" alt="" title=""
							border="0" />
					</a>
				</div>
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


			<div  class="center_content" >

				<div >
					<div class="title" style="margin-left:90px;">
						<span class="title_icon"><img src="images/bullet1.gif" />
						</span>�˻�����
					</div>

					<div class="feat_prod_box_details" >
						
						<div  class="contact_form"  style="margin-left:150px;width:65%;">
							<div class="form_subtitle">
								�޸��û���Ϣ
							</div>
							
							<form style="padding-left:5%;" method="post" action="/ects/Update.func">
								<table>
									<tr>
										<td>�û�����</td>
										<td>
											<input name="username" value="${user.name}"/><font color="red">*�û���������6-20����ĸ���������</font>
										</td>
									</tr>
									<tr>
										<td>���룺</td>
										<td><input type="password" name="password" /><font color="red">*�û���������6-20����ĸ���������</font></td>
									</tr>
									<tr>
										<td>ȷ�����룺</td>
										<td><input type="password" name="enter" /><font color="red"  >*������������������</font></td>
									</tr>
									<tr>
										<td>���ڵ�����</td>
										<td>
											<select name="country">
											<option value="1">
												�й�
											</option>
										</select>
										<select name="province">
											<option value="1" selected="selected">����</option>

											<option value="2">
												����
											</option>

											<option value="3">
												����
											</option>

											<option value="4">
												����
											</option>

											<option value="5">
												�㶫
											</option>

											<option value="6">
												����
											</option>

											<option value="7">
												����
											</option>

											<option value="8">
												����
											</option>

											<option value="9">
												����
											</option>

											<option value="10">
												����
											</option>

											<option value="11">
												�ӱ�
											</option>

											<option value="12">
												����
											</option>

											<option value="13">
												���
											</option>

											<option value="14">
												������
											</option>

											<option value="15">
												����
											</option>

											<option value="16">
												����
											</option>

											<option value="17">
												����
											</option>

											<option value="18">
												����
											</option>

											<option value="19">
												����
											</option>

											<option value="20">
												����
											</option>

											<option value="21">
												���ɹ�
											</option>

											<option value="22">
												����
											</option>

											<option value="23">
												�ຣ
											</option>

											<option value="24">
												�Ĵ�
											</option>

											<option value="25">
												ɽ��
											</option>

											<option value="26">
												�Ϻ�
											</option>

											<option value="27">
												����
											</option>

											<option value="28">
												ɽ��
											</option>

											<option value="29">
												���
											</option>

											<option value="30">
												̨��
											</option>

											<option value="31">
												�½�
											</option>

											<option value="32">
												����
											</option>

											<option value="33">
												����
											</option>

											<option value="34">
												�㽭
											</option>

											<option value="35">
												����
											</option>
										</select>
										ʡ
										<input name="city" type="text" size="10"   value="${user.info.city }"/>��/��
										</td>
									</tr>
									<tr>
										<td >��ϵ��ַ1��</td>
										<td><input type="text" size="35" name="street1"  value="${user.info.street1 }"/></td>
									</tr>
									<tr>
										<td >��ϵ��ַ2��</td>
										<td><input type="text" size="35" name="street2"  value="${user.info.street2}" /></td>
									</tr>
									<tr>
										<td >�ʱࣺ</td>
										<td><input type="text" size="35" name="zip"  value="${user.info.zip}"/></td>
									</tr>
									<tr>
										<td >�칫�ҵ绰</td>
										<td><input type="text" size="15" name="officePhone" value="${user.info.officePhone}"/></td>
									</tr>
									<tr>
										<td >�ֻ�</td>
										<td><input type="text" size="15" name="cellphone" value="${user.info.cellPhone}"/></td>
									</tr>
									<tr>
										<td >��ͥ�绰</td>
										<td><input type="text" size="15" name="homePhone" value="${user.info.homePhone}"/></td>
									</tr>
									<tr>
										<td >Email��ַ��</td>
										<td ><input type="text" size="32" name="email" value="${user.info.email}"/><font color="red">*��������Ч���ʼ���ַ</font>
										</td>
									</tr>
								</table>
								<div class="form_row">
									<div class="terms">
										<input type="checkbox" name="terms" />
										I agree to the
										<a href="#">terms &amp; conditions</a>
									</div>
								</div>
								<div style="padding-left:30px;">
									<input type="submit" value="ȷ��"/>
									<button style="margin-left:30px;"  onclick="history.go(-1)">ȡ��</button>
								</div>
                                <br />
							</form>
						</div>

					</div>
					<div class="clear"></div>
				</div>
				
				<div class="clear"></div>
			</div>
			


			<div class="footer">
				<div class="left_footer">
					<img src="images/footer_logo.gif" alt="" title="" />
					<br />
					<a href="http://csscreme.com/freecsstemplates/"
						title="free templates">
					</a>
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