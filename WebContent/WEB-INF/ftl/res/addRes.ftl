<!DOCTYPE html "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>广告主注册页面</title>
<script type="text/javascript" src="../js/jquery-1.8.0.min.js"></script>
<script type="text/javascript">
</script>
</head>
<body>
	<form method="post" action="addRes.no" >
	<table>
		<tr>
			<td>
				所属城市：
			</td>
			<td>
				<select name="cityId">
					<option value="1">北京</option>
					<option value="100">临汾</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>
				饭店名称：
			</td>
			<td>
				<input type="text" name="resName" />
			</td>
			<td>
				*长度为3-16位的字符串
			</td>
		</tr>
		<tr>
			<td>
				老板名称：
			</td>
			<td>
				<input type="text" name="resOwner" />
			</td>
			<td>
			*
			</td>
		</tr>
		<tr>
			<td>
				联系电话：
			</td>
			<td>
				<input type="text" name="resPhone" />
			</td>
			<td>
			*
			</td>
		</tr>
		<tr>
			<td>
				饭店地址：
			</td>
			<td>
				<input type="text" name="resAddr" />
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