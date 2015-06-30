<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="content-type" content="text/html;charset=utf-8" />
		<meta name="author" content="www.frebsite.nl" />
		<meta name="viewport" content="width=device-width initial-scale=1.0 maximum-scale=1.0 user-scalable=yes" />

		<title>商品详情</title>
		<link href="img/favicon.ico" rel="shortcut icon" type="image/x-icon">

		<link type="text/css" rel="stylesheet" href="css/jquery.mmenu.all.css" />
		<link type="text/css" rel="stylesheet" href="css/jquery.mobile-1.0rc2.min.css" >
		<link type="text/css" rel="stylesheet" href="css/style.css" />
		<link type="text/css" rel="stylesheet" href="css/photoswipe/photoswipe.css" />
		
		<link rel="apple-touch-icon" href="img/apple-touch-icon.png">
		<link rel="apple-touch-startup-image" href="img/apple-touch-startup-image.png">
		
		<script type="text/javascript" src="js/jquery.min.js"></script>
		<script type="text/javascript" src="js/photoswipe/klass.min.js"></script>
		<script type="text/javascript" src="js/jquery.mmenu.min.all.js"></script>
		<script type="text/javascript" src="js/jquery.mobile-1.0rc2.min.js"></script>
		<script type="text/javascript" src="js/photoswipe/code.photoswipe.jquery-3.0.4.min.js"></script>
		<script type="text/javascript" src="js/o-script.js"></script>

	</head>
	<body class="o-page">
		<div id="page">
			<div id="header">
				<div class="header-content">
					<a href="index.html" class="p-link-home"><i class="fa fa-home"></i></a>
					<a class="menu-btn" href="#menu"></a>
					<a href="javascript:history.back();" class="p-link-back"><i class="fa fa-arrow-left"></i></a>
				</div>
			</div>
			<div class="bannerPane">
				<div class="overlay"></div>
				<div class="s-banner-content">
					<div><img  width="100" src="img/logo-pages.svg" /></div>
					<i class="fa fa-picture-o"></i> 商品详情
				</div>
			</div>
			
			<div class="content">
			<#if goodsDetail?? >
				<div id="Gallery">
					<div class="gallery-row">
						
						<div id="PGalleryTwoC" class="row">
							<br/>
							<h3 class="title"><i class="fa fa-picture-o"></i>${goodsDetail.goodsDetail.goodsName}</h3>
							<#list goodsDetail.goodsImgList as goodsImg >
							<div class="mobile-two">
								<div class="gallery-item">
									<#if ( goodsImg.type == 2 ) >
									<img src="${goodsImg.imgUri}" alt="美食" />
									</#if>
								</div>
							</div>
							</#list>
						</div>		
						
					</div>
				</div>
				<div class="prod-pricePane">
					<span class="last-price">${goodsDetail.goodsDetail.oriPrice}</span>
					<span class="currency">￥</span>
					<span class="current-price">${goodsDetail.goodsDetail.costPrice}</span>
				</div>
			</#if>
			</div>
			
			
			<div class="subFooter">Copyright 2015. All rights reserved.</div>
			
			<!-- Menu navigation -->
			<#include "/common/nav.ftl">
			
		</div>
	</body>
</html>