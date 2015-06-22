<!DOCTYPE html "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>饭店添加页面</title>
<script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
<script type="text/javascript">
</script>
</head>
<body>
	<#if ( resList?? && resList?size > 0 ) >
		<table>
			<tr>
				<th>
					饭店名称
				</th>
				<th>
					饭店电话
				</th>
				<th>
					添加菜单
				</th>
			</tr>
		<#list resList as res >
			<tr>
				<td>
					${res.resName}
				</td>
				<td>
					${res.resPhone}
				</td>
				<td>
					<a href="gotoAddMenu.no?resId=${res.idEnc}" >添加</a>
				</td>
			</tr>
		</#list>
		</table>
	</#if>
</body>
</html>