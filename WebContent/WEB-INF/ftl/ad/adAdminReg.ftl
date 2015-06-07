<!DOCTYPE html "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>广告主注册页面</title>
<script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
<script type="text/javascript">
</script>
</head>
<body>
	<form method="post" action="adAdminReg.no" >
	<table>
		<tr>
			<td>
				用户名：
			</td>
			<td>
				<input type="text" name="adUserName" />
			</td>
			<td>
				*长度为3-16位的字符串
			</td>
		</tr>
		<tr>
			<td>
				真实姓名：
			</td>
			<td>
				<input type="text" name="adRealName" />
			</td>
			<td>
			*
			</td>
		</tr>
		<tr>
			<td>
				手机号：
			</td>
			<td>
				<input type="text" name="mible" />
			</td>
			<td>
			*
			</td>
		</tr>
		<tr>
			<td>
				密码：
			</td>
			<td>
				<input type="password" name="adPassword" />
			</td>
			<td>
			*
			</td>
		</tr>
		<tr>
			<td>
				确认密码：
			</td>
			<td>
				<input type="password" name="confirmPassword" />	
			</td>
			<td>
			*
			</td>
		</tr>
		<tr>
			<td colspan="3" align="center">
				<input type="submit" vlaue="提交" />
			</td>
		</tr>
	</table>
	</form>
</body>
</html>