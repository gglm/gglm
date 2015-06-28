<!DOCTYPE html "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>广告主注册页面</title>
<script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
<script type="text/javascript">
</script>
</head>
<body>
	<#if (adAdminList?? && adAdminList?size>0) >
	<table>
		<tr>
			<th>
				用户名
			</th>
			<th>
				联系电话
			</th>
			<th>
				店铺地址
			</th>
			<th>
				操作
			</th>
		</tr>
		<#list adAdminList as adAdmin>
		<tr>
			<td>
				${adAdmin.userName}
			</td>
			<td>
				${adAdmin.mobile}
			</td>
			<td>
				${adAdmin.addr}
			</td>
			<td>
				<a href="javascript:;">审核通过</a>
			</td>
		</tr>
		</#list>
	</table>
	</#if>
</body>
</html>
