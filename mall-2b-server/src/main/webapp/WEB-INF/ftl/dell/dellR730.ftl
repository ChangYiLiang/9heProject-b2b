<!doctype html>
<html>
<head>
<title>九河-戴尔服务器订购</title>
<meta charset="utf-8">
<!--用百度的静态资源库的cdn安装bootstrap环境-->
<!-- Bootstrap 核心 CSS 文件 -->
<link href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">
<!--font-awesome 核心我CSS 文件-->
<link href="http://cdn.bootcss.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">

<link rel="stylesheet" type="text/css" href="${IncPath}/css/common.css" />
<link rel="stylesheet" type="text/css" href="${IncPath}/css/dell.css" />
<link rel="stylesheet" type="text/css" href="${IncPath}/css/fuwuqi.css" />

<!-- 在bootstrap.min.js 之前引入 -->
<script src="${IncPath}/assets/plugins/jquery-1.10.2.min.js" type="text/javascript"></script>
<!-- Bootstrap 核心 JavaScript 文件 -->
<script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${IncPath}/js/DellR730.js"></script>
<script type="text/javascript" src="${IncPath}/js/fuwuqi.js"></script>

<!--[if lt IE 9]>
  <link rel="stylesheet" href="${BasePath}/css/bsie.css" />
  <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
  <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
<script src="${BasePath}/css/IE8.js"></script>
<![endif]-->
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<!--[if IE 7]><body class="ie7"><![endif]-->
<!--[if IE 8]><body class="ie8"><![endif]-->
<!--[if IE 9]><body class="ie9"><![endif]-->
<!--[if !IE]>-->
<body>
<!--<![endif]-->
<#include "../header.ftl" >
<!--订购UI-->
<div class="Large_box">
	<#if user ??>
		<form action="${BasePath}/controller/product/addHardware.do"  method="post"  autocomplete="off">
	<#else>
		<form action="${url}"method="post"  autocomplete="off" onsubmit="location='${CasPath}/login?service=${url}';return false;">
	</#if>
		<input type="hidden" name="orderCycle" id="orderCycle" value="0">
 		<input type="hidden" name="number" id="number" value="1">
	
		<input type="hidden" name="goodsId" value="16">
		<input type="hidden" name="pay" id="pay">
		<input type="hidden" name="config" id="config">
		<input type="hidden" name="idlink" id="id">
	
		<div class="M_box">
			<div class="T_tit">戴尔服务器整机订购</div>
			<div class="M_left_box">
				<ul class="P_control">
					<li>
						<span class="P_m">型号 :</span>
						<select class="form-control selectpicker" id="select" onblur="getindex()">
							<option>PowerEdge R230</option>
							<option>PowerEdge R330</option>
							<option>PowerEdge R430</option>
							<option>PowerEdge R530</option>
							<option>PowerEdge R630</option>
							<option selected="selected">PowerEdge R730</option>
							<option>PowerEdge R730XD</option>
							<option>PowerEdge R930</option>
						</select>
					</li>
				</ul>
				
				<ul class="U_control">
					
					<li>
						<ul class="P_box0">
							<li>
								<span class="P_m">机架类型 :</span>
								<select class="form-control selectpicker" >
									<option selected value="11880" id="96">2U机架式</option>
								</select>
							</li>
							 <li>
								<span class="P_m">处理器 :</span>
								<a style="color:blue">提示：R730属于双路机架服务器，支持1-2颗CPU</a>
								<select class="form-control selectpicker">
									<option selected="selected" value="0" id="61">1颗英特尔至强六核 E5-2603 v4 1.70GHz,15M缓存,6.4GT/s QPI（包含价格中）</option>
									<option value="4340" id="62">2颗英特尔®至强八核® E5-2609 v4 1.70GHz,20M 缓存,6.4GT/s QPI [RMB4,340.00]</option>
									<option value="5838" id="63">2颗英特尔®至强八核® E5-2620 v4 2.10GHz,20M 缓存,8GT/s QPI [RMB5,838.00] </option>
									<option value="6216" id="64">2颗英特尔®至强四核® E5-2623 v4 2.60GHz,10M 缓存,8GT/s QPI [RMB6,216.00]</option>
									<option value="9338" id="65">2颗英特尔®至强十核® E5-2630 v4 2.20GHz,25M 缓存,8GT/s QPI [RMB9,338.00]</option>
									<option value="13146" id="66">2颗英特尔®至强十核® E5-2640 v4 2.40GHz,25M 缓存,8GT/s QPI [RMB13,146.00]</option> 
									<option value="20230" id="67">2颗英特尔®至强十四核® E5-2660 v4 2.0GHz,35M 缓存,9.6GT/s QPI [RMB20,230.00]</option>
									<option value="24430" id="68">2颗英特尔®至强十四核® E5-2680 v4 2.40GHz,35M 缓存,9.6GT/s QPI [RMB24,430.00]</option>
									<option value="25844" id="69">2颗英特尔®至强十六核® E5-2683 v4 2.10GHz,40M 缓存,9.6GT/s QPI [RMB25,844.00] </option>
								    <option value="33936" id="70">2颗英特尔®至强十八核® E5-2695 v4 2.10GHz,45M 缓存,9.6GT/s QPI [RMB33,936.00]</option>
								</select>								
							</li>
						   <li>
								<span class="P_m">内存 :</span>
								<a style="color:blue">提示：24个RDIMM插槽，最大支持扩展768GB</a>
								<select class="form-control selectpicker">
									<option selected="selected" value="0" id="71">4GB DDR4 ECC 2133Mhz（包含价格中</option>
									<option value="1500" id="72">16GB DDR4 ECC 2133Mhz [RMB1500.00]</option>
									<option value="3000" id="73">32GB DDR4 ECC 2133Mhz [RMB3000.00]</option>
									<option value="6000" id="74">64GB DDR4 ECC 2133Mhz [RMB6000.00]</option>
									<option value="12000" id="75">128GB DDR4 ECC 2133Mhz [RMB12000.00]</option>
									<option value="24000" id="76">256GB DDR4 ECC 2133Mhz [RMB24000.00]</option>
									<option value="48000" id="93">512GB DDR4 ECC 2133Mhz [RMB48000.00]</option>  
								</select>
							</li>
							 <li>
								<span class="P_m">硬盘 :</span>
								<a style="color:blue">备注：硬盘最大支持8个3.5英寸或8个2.5英寸</a>
								<select class="form-control selectpicker">
									<option selected="selected" value="0" id="77">300GB 10K RPM SAS 6Gbps 2.5英寸热插拔硬盘*1块（包含价格中</option>
									<option value="1900" id="79">1.2TB 10K RPM SAS 6Gbps 2.5英寸硬盘  [RMB1900.00]</option>
									<option value="2700" id="80">2TB 7.2K RPM SAS 6Gbps 2.5英寸硬盘 [RMB2700.00]</option> 
									<option value="1750" id="81">600GB 15K RPM SAS 6Gbps 3.5英寸硬盘  [RMB1750.00]</option> 
									<option value="1150" id="82">1TB 7.2K RPM SAS 6Gbps 3.5英寸硬盘  [RMB1150.00]</option> 
									<option value="1700" id="83">4TB 7.2K RPM SAS 6Gbps 3.5英寸硬盘  [RMB1700.00]</option>
								</select>
							</li>
							 <li>
								<span class="P_m">芯片组 :</span>
								<select class="form-control selectpicker" >
									<option selected="selected" value="0" id="84">英特尔®C610</option>
								</select>
							</li>
							 <li>
								<span class="P_m">网卡 :</span>
								<select class="form-control selectpicker" >
									<option selected="selected" value="0" id="97">集成Broadcom 5720四端口千兆网卡</option>
								</select>
							</li>
							 <li>
								<span class="P_m">RAID配置 :</span>
								<select class="form-control selectpicker" >
									<option selected="selected" value="0" id="86">内置PERC H330 阵列控制器</option>
								</select>
							</li>
							 <li>
								<span class="P_m">PCIe插槽 :</span>
								<select class="form-control selectpicker" >
									<option selected="selected" value="0" id="98">7个PCIe 3.0</option>
								</select>
							</li>
							  <li>
								<span class="P_m">电源 :</span>
								<select class="form-control selectpicker" >
									<option selected="selected" value="0" id="95">热插拔495w单电源（1+0)（包含价格中）</option>
								</select>
							</li>
						</ul>
					</li>
					
				</ul>
				
			</div>
			<div class="M_right_box">
				<div class="t_tit">当前配置</div>
				<p id="P_other"></p>
				<ul class="P_link M_wen">
					<li></li>
					<li></li>
					<li></li>
					<li></li>
					<li></li>
					<li></li>
					<li></li>
					<li></li>
					<li></li>
					<li></li>
				</ul>
				<br/>
				<div class="buy-num" style="width:100%">
				<p class="left-p" style="float:left">购买数量：</p>
					<ul class="ul-num" style="position:relative;top:-10px"> 
						<li>
							<button type="button" class="btn" style="width:40px" onclick="goods_cut()" id="left-cut">
								<span class="glyphicon glyphicon-arrow-down other-span"></span>
							</button>
							<div class="form-group" style="display:inline-block">
								<input type="text" class="form-control" style="width:50px;position:relative;top:4px;text-align:center" value="1" disabled id="num">
							</div>
							<button type="button" class="btn" style="width:40px" onclick="goods_add()" id="right-add">
								<span class="glyphicon glyphicon-arrow-up other-span"></span>
							</button>
						</li>
					</ul>
				</div>
				<br/>
				<div class="M_wen" style="margin-left:-25px"><span class="P_m2"> 总价  ：</span><span class="M_pay">0.00</span></div>
				<br/>
				<input type="submit" name="submit" class="btn btn-primary"  value="立即购买" style="width:150px"/>
				<input type="reset" id="ask_me" class="btn btn-primary" value="询问客服" style="margin-left:50px;width:150px"/>
			</div>
		</div>
		
	</form>
	<ul class="P_price" style="display:none">
		<li>0</li>
		<li>0</li>
		<li>0</li>
		<li>0</li>
		<li>0</li>
		<li>0</li>
		<li>0</li>
		<li>0</li>
		<li>0</li>
		<li>0</li>
	</ul>
	<ul class="P_id" style="display:none">
		<li>0</li>
		<li>0</li>
		<li>0</li>
		<li>0</li>
		<li>0</li>
		<li>0</li>
		<li>0</li>
		<li>0</li>
		<li>0</li>
	</ul>
</div>



<div class="nav_3">
    <ul class="gun_qian">
        <li ><a href="javascript:;">产品介绍</a></li>
        <li ><a href="javascript:;">配置参数</a></li>
        <li ><a href="javascript:;">用户评价</a></li>
        <li ><a href="javascript:;">服务保障</a></li>
    </ul>
</div>
<ul class="nb_flag">
	
	<li>
	
		<div class="box_center" >
    <div class="L_box bac_f ">
        <div class="M_box">
        
            <div class="M_box_R tiyan_3 R730_1 ">
                <ul class="M_box_R ">
                    <li class="H_t">
                        <span class="tit_1 fon_24 hui_3 ">戴尔PowerEdge R730</span>
                        <div class="tit_xian"></div>
                    </li>
                    <li class="H_wen">
                        <span class="w_1">这是一款用途极其广泛的双路2U机架式服务器，相比上一代PowerEdge R720产品，R730实现了内存、存储、处理能力和GPU的资源整合，具备更超凡的处理器性能、超大的内存容量和众多的I/O选项，在处理大中型企业各种要求极为苛刻的工作负载，如数据仓库、电子商务、虚拟桌面基础架构（VDI）、数据库以及作为数据节点的高性能计算（HPC）等方面， PowerEdgeR730的表现非常出色。</span>
                    </li>

                </ul>
            </div>
                <div class="M_box_L_2  R730_2">
                    <ul>
                        <li class="R730_w_1"><img src="${IncPath}/images/R730_1_03.png" alt="" /></li>
                         <li class="R730_w_1" ><img src="${IncPath}/images/R730_2_03.png" alt="" /></li>
                          <li class="R730_w_1"><img src="${IncPath}/images/R730_3_03.png" alt="" /></li>
                    </ul>
                          <a href="javascript:;" class="R730_btn1"><img src="${IncPath}/images/R730_btn1.png" alt="" /></a> <a href="javascript:;" class="R730_btn2"><img src="${IncPath}/images/R730_btn2.png" alt="" /></a>
                </div>

        </div>
    </div>
    <div class="tedian_box">
        <div class="R730_xian">
            <span class="fon_24 fon_w hui_f bac_3 R730_sp">PowerEdge R730 特点</span>
        </div>
         <div class="L_box  ">
        <div class="M_box">
        
            <div class="M_box_R tiyan_3 R730_1 ">
                <ul class="M_box_R ">
                    <li class="H_t">
                        <span class="tit_1 fon_24 hui_3 ">强劲的运算性能</span>
                        <div class="tit_xian"></div>
                    </li>
                    <li class="H_wen">
                        <span class="w_1">R730采用英特尔®至强®处理器E5-2600 v4产品系列，最多可配24个DIMM插槽的DDR4 RAM，16个12 Gb SAS硬盘和12 Gb高性能PowerEdge RAID控制器(PERC9)，从而实现高度可扩展的存储，可针对您的虚拟化环境大大加快数据访问速度。具有处理周期、线程和超大内存容量，为数据中心和云平台交付更多、更大和更高性能的虚拟服务。</span>
                    </li>

                </ul>
            </div>

                         <div class="M_box_L_2 R730_3"><img src="${IncPath}/images/R73_1.png"></div>
        </div>
    </div>

     <div class="L_box ">
    <div class="M_box">
     <div class="M_box_L_2 tiyan_6" style="margin-top:76px;"><img src="${IncPath}/images/R73_2.png"></div>
      <ul class="M_box_R">
            <li class="H_t">
                <span class="tit_1 fon_24 hui_3 ">灵活的高扩展性</span>
                <div class="tit_xian"></div>
            </li>
            <li class="H_wen">
                <span class="w_1">凭借高性能处理、大容量内存和创新的本地存储选项，新一代PowerEdge服务器可在整个产品组合中提供更高的可扩展性，根据您的工作负载需求灵活调整硬件、预留空间并简化管理，从而全面满足您当前及未来发展的需求。 </span>
            </li>                
        </ul>
       
    </div>
</div>


             <div class="L_box  ">
        <div class="M_box">
        
            <div class="M_box_R tiyan_3 R730_1 ">
                <ul class="M_box_R ">
                    <li class="H_t">
                        <span class="tit_1 fon_24 hui_3 ">自动化IT管理部署</span>
                        <div class="tit_xian"></div>
                    </li>
                    <li class="H_wen">
                        <span class="w_1"> 通过使用存储在内部网络上的指定位置中的配置文件来发现和自动配置戴尔服务器，从而减少设置时间和人工录入错误，用户可以自主PC远程操作，或者使用智能手机来进行统一操作，从而确保PowerEdge服务器的无缝管理。同时可以通过智能手机、电脑远程监控服务器工作状况及接收告警信息。</span>
                    </li>

                </ul>
            </div>

                         <div class="M_box_L_2 R730_4"><img src="${IncPath}/images/R73_3.png"></div>
        </div>
    </div>
         <div class="L_box ">
    <div class="M_box">
     <div class="M_box_L_2 tiyan_6" style="margin-top:76px;"><img src="${IncPath}/images/R73_4.png"></div>
      <ul class="M_box_R">
            <li class="H_t">
                <span class="tit_1 fon_24 hui_3 ">服务器整机托管生态服务</span>
                <div class="tit_xian"></div>
            </li>
            <li class="H_wen">
                <span class="w_1">凭九河互联构建了全球首个亚太数据中心集群，您购买服务器整机后，可根据业务发展需求，将服务器托管至九河互联自营香港、美国、深圳、韩国、新加坡等地的数据中心，现在选购硬件可免费享受托管服务，详情请咨询在线客服人员。 </span>
            </li>                
        </ul>
       
    </div>
</div>


             <div class="L_box  ">
        <div class="M_box">
        
            <div class="M_box_R tiyan_3 R730_1 ">
                <ul class="M_box_R ">
                    <li class="H_t">
                        <span class="tit_1 fon_24 hui_3 ">专业的售后支持</span>
                        <div class="tit_xian"></div>
                    </li>
                    <li class="H_wen">
                        <span class="w_1"> 选择戴尔服务器，选择九河互联专业售后技术支持，30位高级技术工程师7x24小时全天候在线，提供远程协助及上门技术服务，确保您的业务持续安全稳定运行；另外戴尔服务器提供三年质保服务，解决您的后顾之忧。</span>
                    </li>

                </ul>
            </div>

                         <div class="M_box_L_2 R730_4"><img src="${IncPath}/images/R73_5.png"></div>
        </div>
    </div>
    </div>

   <!--  配置参数 -->
   <div class="R730_pz_t fon_24 bac_3 hui_f fon_w">配置参数</div>
   <dl class="R730_dl">
       <dt class="red fon_16 fon_w">基本资料</dt>
       <dd > 产品型号：PowerEdge R730  <br />
            产品类型：双路六核志强2U机架式服务器 <br />
            产品尺寸：高度：8.73cm（3.44英寸）x宽度：44.4cm（17.49英寸）x深度：68.4cm（26.92英寸）
        </dd>
   </dl>
   <dl class="R730_dl">
       <dt class="red fon_16 fon_w">处理器</dt>
       <dd >    处理器型号：Intel至强六核 E5-2603 v3 <br />
                标配数量/最大支持数量：  1颗/2颗 <br />
                处理器主频/缓存： 1060Ghz/15M <br />
                插槽数量/QPI：   2个/6.4GT/s <br />

        </dd>
   </dl>
         <dl class="R730_dl">
       <dt class="red fon_16 fon_w">芯片组</dt>
       <dd > 芯片组：    Intel C610系列
        </dd>
   </dl>
   <dl class="R730_dl">
       <dt class="red fon_16 fon_w">内存</dt>
       <dd >   标配容量/最大支持： 1x4GB/758GB
      内存类型/工作频率： ECC自动纠错/2133Mhz
      内存插槽数量：24个DIMM插槽、支持DDR4

        </dd>
   </dl>
         <dl class="R730_dl">
       <dt class="red fon_16 fon_w">硬盘</dt>
       <dd > 标配容量/最大支持：300GB 10K RPM SAS 6Gbps 2.5英寸热插拔硬盘*1块/最大支持8块盘
        </dd>
   </dl>
   <dl class="R730_dl">
       <dt class="red fon_16 fon_w">RAID控制器</dt>
       <dd > 内置PERC H330 阵列控制器（支持raid0,1,5,10,50）
        </dd>
   </dl>
         <dl class="R730_dl">
       <dt class="red fon_16 fon_w">网卡</dt>
       <dd > 网卡控制器：集成Broadcom 5720四端口千兆网卡，iDRAC8 Express管理卡
        </dd>
   </dl>
   <dl class="R730_dl">
       <dt class="red fon_16 fon_w">光驱装置</dt>
       <dd >类型：DVDRW
        </dd>
   </dl>
         <dl class="R730_dl bd_last">
       <dt class="red fon_16 fon_w ">电源</dt>
       <dd > 类型：热插拔495w单电源（1+0)
        </dd>
   </dl>

     <!--  服务保障 -->
   <div class="R730_pz_t fon_24 bac_3 hui_f fon_w">服务保障</div>
   <dl class="R730_dl">
       <dt class="red fon_16 fon_w fuwu_zixun2">全程服务</dt>
       <dd >作为国内专业的数据中心硬件服务商，九河互联提供覆盖服务器硬件完整生命周期的全程服务，从基础采购咨询到IT架构设计、业务运行部署、技术运维支持、行业解决方案等，全程服务体系带来高附加值服务，最大程度上降低用户TCO；九河互联拥有20多位资深硬件工程师团队，提供7x24小时全天候售前售后咨询服务：<br />
      <div class="fuwu_zixun1"><a href="javascript:;" class="red "> 售前咨询>>></a>   <a href="javascript:;" class="red"> 技术支持>>></a></div>
        </dd>
   </dl>
   <dl class="R730_dl">
       <dt class="red fon_16 fon_w fuwu_zixun3 fuwu_zixun2">预约上门</dt>
       <dd >   服务器采购完成投入使用过程中，遇到不会操作部署、技术难题等情况怎么办？不用着急，九河互联20余位资深硬件工程师团队24小时随时待命，为您提供线上远程和线下上门技术服务，为了更快的帮助您解决问题，请联系客服人员预约，以便我们及时安排专业技术人员上门。

        </dd>
   </dl>
         <dl class="R730_dl">
       <dt class="red fon_16 fon_w fuwu_zixun4 fuwu_zixun2">生态减免</dt>
       <dd > 九河互联构建了全球首个亚太数据中心集群，您购买服务器整机后，可根据业务发展需求，将服务器托管至九河互联自营香港、美国、深圳、韩国、新加坡等地的数据中心，现在选购硬件可免费享受托管服务，详情请咨询在线客服人员。
        </dd>
   </dl>
   <dl class="R730_dl">
       <dt class="red fon_16 fon_w fuwu_zixun5 fuwu_zixun2">自动化运维</dt>
       <dd >  告别服务器硬件运维管理人工时代，九河互联自主研发软件级服务器管理服务，以往依赖技术人员手动操作管理，而现在可以通过管理软件一键自动化实现服务器开关机、重启、系统安装、业务部署等，极大降低了运维人员管理服务器的时间成本，让IT运维更简单便捷！

        </dd>
   </dl>
         <dl class="R730_dl">
      <dt class="red fon_16 fon_w fuwu_zixun6 fuwu_zixun2">金融方案</dt>
       <dd > 中小企业运营初期，硬件的成本投入是一笔不小的开支，我们深知企业初期资金压力颇大，为了解决资金方面的痛点，九河互联全面推出生态金融方案，中小企业可以采用月结或分期付款的方式享受优质的产品和服务，目前我们正在着力引入第三方金融机构针对性的提供分期付款服务。
        </dd>
   </dl>
   <dl class="R730_dl">
      <dt class="red fon_16 fon_w fuwu_zixun7 fuwu_zixun2">价格保护</dt>
       <dd >  硬件市场鱼龙混杂，价格参差不齐，对于初次采购硬件的用户来说，可能会面临价格猫腻的风险，九河互联提供的硬件产品全国统一标价，公开透明价格细微到每一个组件；另外我们建立了完善的价格保护机制，购买服务器七天内价格如有下调变动，用户可以联系客服人员索取差价
        </dd>
   </dl>
         <dl class="R730_dl">
       <dt class="red fon_16 fon_w fuwu_zixun8 fuwu_zixun2">金牌物流</dt>
       <dd >为了确保硬件产品安全无损送达客户手中，九河互联所有硬件产品默认发顺丰、联邦等第三方金牌物流公司，当然您也可以根据实际需求，选择更便捷安全的物流方式。
        </dd>
   </dl>
   <dl class="R730_dl">
       <dt class="red fon_16 fon_w fuwu_zixun9 fuwu_zixun2">7天退换货</dt>
       <dd >九河互联提供的服务器硬件均是原厂原装，经过多重质量检测，确保质量合格率达到99.99%，客户采购服务器后，产品7天内无人为损坏，不影响二次销售前提下因质量问题产生的退换货，运费由卖家承担，无质量问题退换货运费由买家承担。
       <div class="fuwuliucheng">
           <p>退换货流程</p>
           <div><img src="${IncPath}/images/fuwuliucheng.png" height="78" width="948" alt="" /></div>
           <span>联系客服</span> <span>说明情况</span> <span>补拍运费款</span> <span>寄回产品</span> <span class="fuwusp1">收货</span><span>办理退换货</span>
       </div>
        </dd>
   </dl>
         <dl class="R730_dl">
     <dt class="red fon_16 fon_w fuwu_zixun10 fuwu_zixun2">增值运维服务</dt>
       <dd>  九河互联拥有一支专业的技术工程师团队，可以为客户提供数据中心级运维增值服务，如日常服务器代维、服务器集群、负载均衡、内网组建等，客户仅需支付较少的费用，即可实现业务技术上的突飞猛进，详情请咨询客服人员）。
        </dd>
   </dl>
</div>
	
	</li>
	
<ul>

<#include "../footer.ftl" >
</body>
<script src="${BasePath}/scripts/custom/ex.js"></script>
</html>
