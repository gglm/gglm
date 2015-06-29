<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="content-type" content="text/html;charset=utf-8" />
		<meta name="author" content="www.frebsite.nl" />
		<meta name="viewport" content="width=device-width initial-scale=1.0 maximum-scale=1.0 user-scalable=yes" />

		<title>菜单</title>
		<link href="img/favicon.ico" rel="shortcut icon" type="image/x-icon">

		<link type="text/css" rel="stylesheet" href="css/jquery.mmenu.all.css" />
		<link type="text/css" rel="stylesheet" href="css/style.css" />

		<link rel="apple-touch-icon" href="img/apple-touch-icon.png">
		<link rel="apple-touch-startup-image" href="img/apple-touch-startup-image.png">
		
		<script type="text/javascript" src="js/jquery.min.js"></script>
		<script type="text/javascript" src="js/jquery.mmenu.min.all.js"></script>
		<script type="text/javascript" src="js/jquery.easy-pie-chart.js"></script>
		<script type="text/javascript" src="js/o-script.js"></script>
	</head>
	<body class="o-page p-blog">
		<div id="page">
			<div id="header">
				<div class="header-content">
					<a href="index.html" class="p-link-home"><i class="fa fa-home"></i></a>
					<a class="menu-btn" href="#menu"></a>
					<a href="javascript:history.back();" class="p-link-back"><i class="fa fa-arrow-left"></i></a>
				</div>
			</div>
			<div class="bannerPane banner-img3">
				<div class="overlay"></div>
				<div class="s-banner-content">
					<div><img  width="100" src="img/logo-pages.svg" /></div>
					<i class="fa fa-th-list"></i> 菜单列表
				</div>
			</div>
			<div id="content">
				<#if ( resMenuList?? && resMenuList?size > 0 ) >
				<#list resMenuList as menu >
				<article>
					<a href="food.html">
						<div class="article-img-pane">
							<img src="img/gallery/4.jpg" />
						</div>
						<h2>${menu.foodName}</h2>
						<h2>${menu.resShow.resAddr}</h2>
						<div class="prod-pricePane">
							<span class="last-price">${menu.oriPrice}</span>
							<span class="currency">￥</span>
							<span class="current-price">${menu.costPrice}</span>
						</div>
					</a>
					<div class="a-meta">
					</div>
				</article>
				</#list>
				</#if>
			</div>
			<div class="subFooter">Copyright 2015. All rights reserved.</div>
				
			<#include "/common/nav.ftl" >		
		</div>
	</body>
</html>