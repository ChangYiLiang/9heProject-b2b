<!DOCTYPE html>
<!-- 
Template Name: Metronic - Responsive Admin Dashboard Template build with Twitter Bootstrap 3.1.1
Version: 2.0.2
Author: KeenThemes
Website: http://www.keenthemes.com/
Contact: support@keenthemes.com
Purchase: http://themeforest.net/item/metronic-responsive-admin-dashboard-template/4021469?ref=keenthemes
License: You must have a valid license purchased only from themeforest(the above link) in order to legally use the theme for your project.
-->
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en" class="no-js">
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
<meta charset="utf-8"/>
<title>九河 | 配置中心 - 商品管理</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1.0" name="viewport"/>
<meta content="" name="description"/>
<meta content="" name="author"/>
<link rel="SHORTCUT ICON" href="${BasePath}/scripts/custom/favicon.ico">
<!-- BEGIN GLOBAL MANDATORY STYLES -->
<link rel="stylesheet" type="text/css" href="${IncPath}/assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" type="text/css" href="${IncPath}/assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" type="text/css" href="${IncPath}/assets/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css"/>
<!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN GENERAL STYLES -->
<link rel="stylesheet" type="text/css" href="${IncPath}/assets/plugins/bootstrap-modal/css/bootstrap-modal-bs3patch.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" type="text/css" href="${IncPath}/assets/plugins/bootstrap-modal/css/bootstrap-modal.css" rel="stylesheet" type="text/css"/>
<!-- END GENERAL STYLES -->
<!-- BEGIN PAGE LEVEL STYLES -->
<link rel="stylesheet" type="text/css" href="${IncPath}/assets/plugins/select2/select2.css"/>
<link rel="stylesheet" type="text/css" href="${IncPath}/assets/plugins/select2/select2-metronic.css"/>
<link rel="stylesheet" type="text/css" href="${IncPath}/assets/plugins/data-tables/DT_bootstrap.css"/>
<link rel="stylesheet" type="text/css" href="${IncPath}/assets/plugins/jquery-multi-select/css/multi-select.css"/>
<!-- END PAGE LEVEL STYLES -->
<!-- BEGIN THEME STYLES -->
<link rel="stylesheet" type="text/css" href="${IncPath}/assets/css/style-metronic.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" type="text/css" href="${IncPath}/assets/css/style.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" type="text/css" href="${IncPath}/assets/css/style-responsive.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" type="text/css" href="${IncPath}/assets/css/plugins.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" type="text/css" href="${IncPath}/assets/css/themes/default.css" rel="stylesheet" type="text/css" id="style_color"/>
<link rel="stylesheet" type="text/css" href="${IncPath}/assets/css/custom.css" rel="stylesheet" type="text/css"/>
<!-- END THEME STYLES -->
<link rel="shortcut icon" href="favicon.ico"/>
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="page-header-fixed">

<#include "../mall-header.ftl" >

<div class="clearfix">
</div>

<!-- BEGIN CONTAINER -->
<div class="page-container">
	
	<#include "../sidebar.ftl" >

	<!-- BEGIN CONTENT -->
	<div class="page-content-wrapper">
		<div class="page-content">
			<!-- BEGIN PAGE HEADER-->
			<div class="row">
				<div class="col-md-12">
					<!-- BEGIN PAGE TITLE & BREADCRUMB-->
					<h3 class="page-title">
					商品管理
					</h3>
					<ul class="page-breadcrumb breadcrumb">
						<li>
							<i class="fa fa-home"></i>
							<a href="${BasePath}">
								主页
							</a>
							<i class="fa fa-angle-right"></i>
						</li>
						<li>
							<a href="${BasePath}">
								商品中心
							</a>
							<i class="fa fa-angle-right"></i>
						</li>
					</ul>
					<!-- END PAGE TITLE & BREADCRUMB-->
				</div>
			</div>
			<!-- END PAGE HEADER-->
			<!-- BEGIN PAGE CONTENT-->
			<div class="row">
				<div class="col-md-12">
					<!-- Begin: life time stats -->
					<div class="portlet">
						<div class="portlet-title">
							<div class="caption">
								<i class="fa fa-user"></i>商品添加
							</div>
							<!-- END PAGE HEADER-->
			<!-- BEGIN PAGE CONTENT-->
			<div class="row">
				<div class="col-md-12">
					<!-- Begin: life time stats -->
					<div class="portlet">
			<style>
			 .form-control{display:inline-block;width:400px}
			 #form_cll ul li input{width:163px}
			</style>		
			<form action="addgoods.do" id="form_cl" method="post" enctype="multipart/form-data">
		  	<ul class="list-group">
				<li class="list-group-item">
						<span>商品名称：</span>
						<input style="width:400px" type="text" class="form-control" name="goodsName" id="goodsName" value="" required>
				</li>
				<li class="list-group-item">
						<span>商品副标：</span>
						<input style="width:400px" type="text" class="form-control" name="secondTitle" id="secondTitle" value="" required>
				</li>
				<li class="list-group-item">
						<span>商品图片：</span>
						<input style="width:400px;display:inline-block" type="file" class="form-control" name="goodsImg" id="goodsImg" required>
				</li>
				<li class="list-group-item">
						<span>评测图片：</span>
						<input style="width:400px;display:inline-block" type="file" class="form-control" name="goodsTest" id="goodsTest" required>
				</li>
				<li class="list-group-item">
						<span>商品价格：</span>
						<input style="width:400px" type="text" class="form-control" name="goodsPrice" id="goodsPrice" value="" required required>
				</li>
				<li class="list-group-item">
						<span>商品分类：</span>
						<select class="form-control selectpicker" name="categoryId" id="categoryId">
							<#list cat as c>
							  	<#if c.catLV=1>
							  		<option value="${c.id}" style="padding-left:15px;">${c.name}【${c.catLV}级】</option>
							  	<#elseif c.catLV=2>
							  		<option value="${c.id}" style="padding-left:30px;">${c.name}【${c.catLV}级】</option>
							  	<#elseif c.catLV=3>
							  		<option value="${c.id}" style="padding-left:45px;">${c.name}【${c.catLV}级】</option>
							  	<#elseif c.catLV=4>
							  		<option value="${c.id}" style="padding-left:60px;">${c.name}【${c.catLV}级】</option>
							  	<#else>
							  		<option value="${c.id}" style="padding-left:75px;">${c.name}【${c.catLV}级】</option>
							  	</#if>
							</#list>
						</select>
				</li>
				<li class="list-group-item">
						<span>商品状态：</span>
						<select name="isBuy" id="isBuy" class="form-control selectpicker" style="width:139px">
							<option value="1" selected>---售卖中---</option>
							<option value="0">---下架中---</option>
						</select>
				</li>
				<li class="list-group-item">
						<span>商品类型：</span>
						<select name="ifIdc" id="ifIdc" class="form-control selectpicker" style="width:140px">
							<option value="0" selected>--IDC服务--</option>
							<option value="1">-服务器硬件-</option>
						</select>	
				</li>
				
				<li class="list-group-item">
						<span>售卖类型：</span>
						<select name="goodsType" id="goodsType" class="form-control selectpicker" style="width:140px">
							<option value="1" selected>--普通--</option>
							<option value="2">--新品--</option>
							<option value="3">--热卖--</option>
							<option value="4">--精品--</option>
						</select>	
				</li>
				
				<li class="list-group-item">
						<span style="position:relative;top:-108px">商品描述：</span>
						<textarea name="goodsDesc" id="goodsDesc" class="form-control" rows="10" placeholder="网页设计师请复制粘贴入自己设计好的DIY HTML代码^_^"></textarea>
				</li>
				<li class="list-group-item" style="display:none">
					<span>添加日期：</span>
					<input type="text" class="form-control" name="addDate" id="addDate" value="1" required >
				</li>
			</form>
				
				<li class="list-group-item">
						<button type="button" class="btn btn-primary" id="additem" onclick="javascript:$('#form_cl').submit();">添加</button>
				</li>
				
			</ul>
					
		</div>				
	</div>
	<!-- END CONTENT -->

<#include "../mall-footer.ftl" >

<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
<!-- BEGIN CORE PLUGINS -->
<!--[if lt IE 9]>
<script src="${IncPath}/assets/plugins/respond.min.js"></script>
<script src="${IncPath}/assets/plugins/excanvas.min.js"></script> 
<![endif]-->
<script src="${IncPath}/assets/plugins/jquery-1.10.2.min.js" type="text/javascript"></script>
<script src="${IncPath}/assets/plugins/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
<script src="${IncPath}/assets/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="${IncPath}/assets/plugins/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js" type="text/javascript"></script>
<script src="${IncPath}/assets/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
<script src="${IncPath}/assets/plugins/jquery.blockui.min.js" type="text/javascript"></script>
<script src="${IncPath}/assets/plugins/jquery.cokie.min.js" type="text/javascript"></script>
<script src="${IncPath}/assets/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>
<!-- END CORE PLUGINS -->
<!-- BEGIN GENERAL PLUGINS -->
<script src="${IncPath}/assets/plugins/bootstrap-modal/js/bootstrap-modalmanager.js" type="text/javascript"></script>
<script src="${IncPath}/assets/plugins/bootstrap-modal/js/bootstrap-modal.js" type="text/javascript"></script>
<script src="${IncPath}/assets/plugins/jquery-validation/dist/jquery.validate.min.js"></script>
<script src="${IncPath}/assets/plugins/jquery-validation/dist/additional-methods.min.js"></script>
<!-- END GENERAL PLUGINS -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script src="${IncPath}/assets/plugins/select2/select2.min.js"></script>
<script src="${IncPath}/assets/plugins/data-tables/jquery.dataTables.js"></script>
<script src="${IncPath}/assets/plugins/data-tables/DT_bootstrap.js"></script>
<script src="${IncPath}/assets/plugins/jstree/dist/jstree.js"></script>
<!-- END PAGE LEVEL PLUGINS -->
<script src="${IncPath}/assets/scripts/core/app.js"></script>
<script src="${IncPath}/assets/scripts/core/datatable.js"></script>
<script src="${BasePath}/scripts/custom/laydate.js"></script>
<script src="${BasePath}/scripts/custom/cl.js"></script>
<script src="${BasePath}/scripts/custom/common.js"></script>
<script src="${BasePath}/scripts/custom/goodstables.js"></script>
<script src="${BasePath}/scripts/custom/mallgoods.js"></script>
<script>
	jQuery(document).ready(function() {       
	   // initiate layout and plugins
	   App.init();
	   Cl.initModal();
	   //UnpaymentDt.init();
	   //Goods.init();
	   //Goods2.init();
	});
</script>

<!-- END JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>