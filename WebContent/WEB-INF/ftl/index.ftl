<!DOCTYPE html>
<html >
	<head>
		<meta http-equiv="content-type" content="text/html;charset=utf-8" />
		<meta name="author" content="www.lanrenmb.com" />
		<meta name="viewport" content="width=device-width initial-scale=1.0 maximum-scale=1.0 user-scalable=yes" />

		<title>广告联盟</title>
		<link href="img/favicon.ico" rel="shortcut icon" type="image/x-icon">

		<link type="text/css" rel="stylesheet" href="css/jquery.mmenu.all.css" />
		<link type="text/css" rel="stylesheet" href="css/style.css" />
		<link rel='stylesheet' id='camera-css'  href='css/camera.css' type='text/css' media='all'> 
		
		<link rel="apple-touch-icon" href="img/apple-touch-icon.png">
		<link rel="apple-touch-startup-image" href="img/apple-touch-startup-image.png">
		
		<script type="text/javascript" src="js/jquery.min.js"></script>
		<script type="text/javascript" src="js/jquery.mmenu.min.all.js"></script>
		<script type="text/javascript" src="js/o-script.js"></script>
		
		<script type='text/javascript' src='js/slider/jquery.mobile.customized.min.js'></script>
		<script type='text/javascript' src='js/slider/jquery.easing.1.3.js'></script> 
		<script type='text/javascript' src='js/slider/camera.min.js'></script> 
		
		<script>
			jQuery(function(){
				
				jQuery('#camera_wrap_4').camera({
					height: 'auto',
					loader: 'bar',
					pagination: false,
					thumbnails: false,
					hover: false,
					opacityOnGrid: false
				});

			});
		</script>
	</head>
	<body class="o-page p-home">
		<div id="page">
			<!-- Header -->
			<div id="header">
				<div class="header-content">
					<a class="menu-btn" href="#menu"></a>
					<a href="javascript:history.back();" class="p-link-back"><i class="fa fa-arrow-left"></i></a>
				</div>
			</div>
			<!-- Content -->
			<div id="content">
				<div class="home-content">
					<span id="Logo" class="svg">
						<img src="img/logo.svg" />
					</span>
				</div>
				<div class="fluid_container">
					<div class="camera_wrap camera_black_skin camera_emboss pattern_1" id="camera_wrap_4">
						<div data-thumb="img/gallery/1-th.jpg" data-src="img/linfen/food/qufan/01.jpg">
							<div class="bannerContent fadeFromBottom">
								<div class="b-c-textpane">
									<h1>9.95$</h1>
									<p><a href="fd/linfen">进入查看</a></p>
								</div>
							</div>
						</div>
						<div data-thumb="img/gallery/2-th.jpg"  data-src="img/linfen/food/qufan/02.jpg">
							<div class="bannerContent fadeFromBottom">
								<div class="b-c-textpane">
									<h1>3.95$</h1>
									<p><a href="fd/linfen">进入查看</a></p>
								</div>
							</div>
						</div>
						<div data-thumb="img/gallery/3-th.jpg"  data-src="img/linfen/food/qufan/03.jpg">
							<div class="bannerContent fadeFromBottom">
								<div class="b-c-textpane">
									<h1>19.95$</h1>
									<p><a href="fd/linfen">进入查看</a></p>
								</div>
							</div>
						</div>
					</div><!-- #camera_wrap_3 -->

				</div><!-- .fluid_container -->
				
				<!-- <a href="#" class="home-footer">
					About us
				</a> -->
			</div>
			<#include "common/nav.ftl" >
		</div>
	</body>
</html>