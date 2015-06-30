<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="content-type" content="text/html;charset=utf-8" />
		<meta name="author" content="www.frebsite.nl" />
		<meta name="viewport" content="width=device-width initial-scale=1.0 maximum-scale=1.0 user-scalable=yes" />

		<title>商品列表</title>
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
					<i class="fa fa-th-list"></i> 商品列表
				</div>
			</div>
			<div id="content">
				<#if ( goodsList?? && goodsList?size > 0 ) >
				<#list goodsList as goods >
				<article>
					<a href="goodsDetail.html?id=${goods.goodsDetail.id}">
						<div class="article-img-pane">
							<#list goods.goodsImgList as goodsImg >
							<#if ( goodsImg.type == 2 ) >
							<img src="${goodsImg.imgUri}" />
							</#if>
							</#list>
						</div>
						<h2>${goods.goodsDetail.goodsName}</h2>
						<h2>${goods.goodsDetail.goodsDesc}</h2>
						<div class="prod-pricePane">
							<span class="last-price">${goods.goodsDetail.oriPrice}</span>
							<span class="currency">￥</span>
							<span class="current-price">${goods.goodsDetail.costPrice}</span>
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