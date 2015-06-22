<!DOCTYPE html "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>添加菜单</title>
<script type="text/javascript" src="../js/jquery-1.8.0.min.js"></script>
<script type="text/javascript">
</script>
</head>
<body>
	<form method="post" action="addMenu.no" >
	<input type="hidden" name="resId" value="${resId}" />
	<table>
		<tr>
			<td>
				食物名称：
			</td>
			<td>
				<input type="text" name="foodName" />
			</td>
		</tr>
		<tr>
			<td>
				食物描述：
			</td>
			<td>
				<input type="text" name="foodDesc" />
			</td>
			<td>
				*长度为3-16位的字符串
			</td>
		</tr>
		<tr>
			<td>
				所属菜系：
			</td>
			<td>
				<input type="text" name="foodCuisine" />
			</td>
			<td>
			*
			</td>
		</tr>
		<tr>
			<td>
				现价：
			</td>
			<td>
				<input type="text" name="costPrice" />
			</td>
			<td>
			*
			</td>
		</tr>
		<tr>
			<td>
				原价：
			</td>
			<td>
				<input type="text" name="oriPrice" />
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