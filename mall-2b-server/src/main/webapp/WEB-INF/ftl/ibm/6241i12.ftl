<!doctype html>
<html>
<head>
<meta charset="utf-8">
<link href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">
<!--font-awesome 核心我CSS 文件-->
<link href="http://cdn.bootcss.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">

<link rel="stylesheet" type="text/css" href="${IncPath}/css/common.css" />
<link rel="stylesheet" type="text/css" href="${IncPath}/css/ibm.css" />
<link rel="stylesheet" type="text/css" href="${IncPath}/css/fuwuqi.css" />

<!-- 在bootstrap.min.js 之前引入 -->
<script src="${IncPath}/assets/plugins/jquery-1.10.2.min.js" type="text/javascript"></script>
<!-- Bootstrap 核心 JavaScript 文件 -->
<script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${IncPath}/js/IBM6241i12.js"></script>
<script type="text/javascript" src="${IncPath}/js/fuwuqi.js"></script>

<title>x3250 M5 5458i21</title>


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
	
		<input type="hidden" name="goodsId" value="26">
		<input type="hidden" name="pay" id="pay">
		<input type="hidden" name="config" id="config">
		<input type="hidden" name="idlink" id="id">
	
		<div class="M_box">
			<div class="T_tit">iBM订购</div>
			<div class="M_left_box">
				<ul class="P_control">
					<li>
						<span class="P_m">产品系列 :</span>
						<select class="form-control selectpicker" id="select">
							<option>X3250 M5 5458I21</option>
							<option>X3250 M5 5458I23</option>
							<option>X3550 M5 5463I01</option>
							<option>X3550 M5 5463I35</option>
							<option>X3650 M5 5462I05</option>
							<option>X3650 M5 5462I45</option>
							<option>X3850 X6 6241I11</option>
							<option selected="selected">X3850 X6 6241I12</option>
						</select>
					</li>
				</ul>
				
				<ul class="U_control">
					<li>
						<ul class="P_box0">
							<li>
								<span class="P_m">机型型号 :</span>
								<select class="form-control selectpicker" >
									<option selected value="61050" id="163">System x3850 X6 6241I12</option>
								</select>
							</li>
							 <li>
								<span class="P_m">处理器 :</span>
								<a style="color:blue">提示：System x3850 X6 6241I12属于四路4U机架服务器，支持2-4颗CPU</a>
								<select class="form-control selectpicker">
									<option selected="selected" value="0" id="164">2颗英特尔® 至强十核® 处理器E7-4820 v3 1.9GHz 25MB缓存 6.4GT/s DMI（包含价格中）</option> 
									<option value="30380" id="104">2颗 英特尔® 至强® 十二核处理器 E7-4830v3 30M缓存,2.10 GHz  8GT/s QPI [RMB30,380.00]</option>
									<option value="42042" id="105">2颗 英特尔® 至强® 十四核处理器 E7-4850v3 35M缓存,2.20 GHz  8GT/s QPI [RMB42,042.00]</option>
									<option value="56854" id="106">2颗 英特尔® 至强® 十六核处理器 E7-8860v3 40M缓存,2.20 GHz  9.6GT/s QPI [RMB56,854.00]</option>
									<option value="65408" id="107">2颗 英特尔® 至强® 十八核处理器 E7-8870v3 45M缓存,2.10 GHz  9.6GT/s QPI [RMB65,408.00]</option> 
								</select>	
							</li>
						   <li>
								<span class="P_m">内存 :</span>
								<a style="color:blue">提示：96个RDIMM插槽，最大支持扩展6TB</a>
								<select class="form-control selectpicker">
									<option selected="selected" value="0" id="165">64GB DDR4 ECC 2133Mhz（包含价格中）</option>
									<option value="12000" id="75">128GB DDR4 ECC 2133Mhz [RMB12000.00]</option>
									<option value="24000" id="76">256GB DDR4 ECC 2133Mhz [RMB24000.00]</option>
									<option value="48000" id="93">512GB DDR4 ECC 2133Mhz [RMB48000.00]</option>
								</select>
							</li>
							 <li>
								<span class="P_m">硬盘 :</span>
								<select class="form-control selectpicker">
									<option selected="selected" value="0" id="162">标配1个8*2.5"热插拔硬盘模组，标配无硬盘</option>
									<option value="900" id="124">1TB 10K RPM SATA 6Gbps 3.5英寸硬盘 [RMB900.00]</option>
									<option value="1200" id="125">2TB 10K RPM SATA 6Gbps 3.5英寸硬盘 [RMB1200.00]</option>
									<option value="1500" id="126">4TB 10K RPM SATA 6Gbps 3.5英寸硬盘 [RMB1500.00]</option>
								</select>
							</li>
							 <li>
								<span class="P_m">网卡 :</span>
								<select class="form-control selectpicker" >
									<option selected="selected" value="0" id="156">板载ML2四端口千兆以太网卡，可选双口万兆夹层卡</option>
								</select>
							</li>
							 <li>
								<span class="P_m">RAID配置 :</span>
								<select class="form-control selectpicker" >
									<option selected="selected" value="0" id="157">标配一个ServerRAID M5210支持SATA/SAS 0/1/10，可选Raid5/50/6/60升级密钥</option>
								</select>
							</li>
							 <li>
								<span class="P_m">PCIe插槽 :</span>
								<select class="form-control selectpicker">
									<option selected="selected" value="0" id="158">2*PCI-e 3.0 半长全高 x16插槽(x16信号)</option>
									<option value="0" id="159">1*PCI-e 3.0 半长全高 x16插槽(x8信号)</option>
									<option value="0" id="160">1*ML2 专用网络夹层卡插槽(x8信号)</option>
								</select>
							</li>
							  <li>
								<span class="P_m">电源 :</span>
								<select class="form-control selectpicker" >
									<option selected="selected" value="0" id="161">标配两个900W铂金电源，可选900W/1400W冗余电源</option>
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
				</ul>
				<br>
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
<div class="box_center">
    <div class="L_box bac_f ">
        <div class="M_box">
        
            <div class="M_box_R tiyan_3 R730_1 ">
                <ul class="M_box_R ">
                    <li class="H_t">
                        <span class="tit_1 fon_24 hui_3 ">联想（iBM）x3850 X6 6241i12</span>
                        <div class="tit_xian"></div>
                    </li>
                    <li class="H_wen">
                        <span class="w_1">x3850X66241i12作为一款性能至强并且高端4U机架式服务器，拥有澎湃的性能和诸多人性化的设计，代表了X86领域诸多研发成果和领先技术的完美结合。搭载八核处理器E7-4820 v3，可获得更高计算能力，性能强劲优越。具有灵活的超凡存储容量和存储选择。具备了“极速、灵动、弹性”三大特点，拥有顶级的性能表现，是企业用户组建多业务综合承载的最佳平台之一，对于高需求的企业来说，可以满足各种业务变化需求。
                        </span>
                    </li>

                </ul>
            </div>
                <div class="M_box_L_2  R730_2 ">
                    <ul class="R930_2">
                        <li class="R730_w_1 R230_1"><img src="${IncPath}/images/6241i11_1.png" alt="" /></li>
                         <li class="R730_w_1 R230_1"  style="padding-left:5px;"><img src="${IncPath}/images/6241i11_2.png" alt="" /></li>
                          <li class="R730_w_1 R230_1" style="margin-left:10px"><img src="${IncPath}/images/6241i11_3.png" alt="" /></li>
                            <li class="R730_w_1 R230_1"><img src="${IncPath}/images/6241i11_1.png" alt="" /></li>
                    </ul>
                          <a href="javascript:;" class="R730_btn1"><img src="${IncPath}/images/R730_btn1.png" alt="" /></a> <a href="javascript:;" class="R730_btn2"><img src="${IncPath}/images/R730_btn2.png" alt="" /></a>
                </div>

        </div>
    </div>
    <div class="tedian_box">
        <div class="R730_xian">
            <span class="fon_24 fon_w hui_f bac_3 R730_sp">联想（iBM）x3850 X6 6241i12 特点</span>
        </div>
         <div class="L_box  ">
        <div class="M_box">
        
            <div class="M_box_R tiyan_3 R730_1 ">
                <ul class="M_box_R ">
                    <li class="H_t">
                        <span class="tit_1 fon_24 hui_3 ">极速运载支持</span>
                        <div class="tit_xian"></div>
                    </li>
                    <li class="H_wen">
                        <span class="w_1">采用eXFlash内存通道存储，提供12.8TB的极速闪存容量，从而最大限度缩短延迟，还可以通过减少或取消所需的外部SAN/NAS 存储单元而减少存储资源。可以为企业提供高效、稳健、灵活的运载支持。</span>
                    </li>

                </ul>
            </div>

                         <div class="M_box_L_2 R730_3"><img src="${IncPath}/images/6241i12_1.png"></div>
        </div>
    </div>

     <div class="L_box ">
    <div class="M_box">
     <div class="M_box_L_2 tiyan_6" style="margin-top:36px;"><img src="${IncPath}/images/5463i01_t_1.png"></div>
      <ul class="M_box_R">
            <li class="H_t">
                <span class="tit_1 fon_24 hui_3 ">满足高性能需求</span>
                <div class="tit_xian"></div>
            </li>
            <li class="H_wen">
                <span class="w_1">机型内存独立，加速扩展技术、弹性节点技术、高IOPS固态磁盘存储子系统、系统内存架构调优等。凭借先进的服务器管理功能，全面系统管理工具，可帮助实现更长的正常运行时间、降低成本和提高生产效率。</span>
            </li>                
        </ul>
       
    </div>
</div>

    <div class="L_box">
        <div class="M_box">
        
            <div class="M_box_R tiyan_3 R730_1 ">
                <ul class="M_box_R ">
                    <li class="H_t">
                        <span class="tit_1 fon_24 hui_3 ">为企业提供数据级安全</span>
                        <div class="tit_xian"></div>
                    </li>
                    <li class="H_wen">
                        <span class="w_1">内置了专属安全Trusted Platform Assurance，拥有独有的安全特性与实践方法，Trusted Platform Assurance旨在保护系统远离底层恶意软件攻击。与此同时，帮助客户将企业级应用迁移到云环境中并且提高总体效率、可靠性和性能。</span>
                    </li>

                </ul>
            </div>

                         <div class="M_box_L_2 R730_4"><img src="${IncPath}/images/6241i12_2.png"></div>
        </div>
    </div>
         <div class="L_box ">
    <div class="M_box">
     <div class="M_box_L_2 tiyan_6" style="margin-top:36px;"><img src="${IncPath}/images/62i05_t_2.png"></div>
      <ul class="M_box_R">
            <li class="H_t">
                <span class="tit_1 fon_24 hui_3 ">强大硬件支持</span>
                <div class="tit_xian"></div>
            </li>
            <li class="H_wen">
                <span class="w_1">服务器配备4U大型机箱，内部空间充足能够为硬件扩展和散热提供便利，增加7条PCLe槽位让整机的硬件支持能力得到保障。超大硬盘和内存提升空间便于提供高效的业务成果。 </span>
            </li>                
        </ul>
       
    </div>
</div>
    </div>

   <!--  配置参数 -->
   <div class="R730_pz_t fon_24 bac_3 hui_f fon_w">配置参数</div>
   <dl class="R730_dl">
       <dt class="red fon_16 fon_w">基本资料</dt>
       <dd >产品型号：x3850 X6 6241I11 8x2.5"热插拔硬盘型号<br />
            产品类型：机架/4U <br />
             产品尺寸：高度：173mm（6.81英寸）x宽度：482mm（18.97英寸）x深度：804mm（31.65英寸）<br />


        </dd>
   </dl>
   <dl class="R730_dl">
       <dt class="red fon_16 fon_w">处理器</dt>
       <dd >   处理器型号：英特尔® 至强® 处理器E7-4809 v3 八核 2.0GHz 20MB 115W*2，模块化计算模组设计<br />
              标配数量/最大支持数量： 4颗 <br />
               处理器主频/缓存： 2.4Ghz/25M <br />
             I/O插槽： 2*PCI-e 3.0 半长全高 x16插槽(x16信号)<br />
                       &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp;1*PCI-e 3.0 半长全高 x16插槽(x8信号) <br />
                         &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;1*ML2 专用网络夹层卡插槽(x8信号) 
        </dd>
   </dl>
<!--          <dl class="R730_dl">
       <dt class="red fon_16 fon_w">芯片组</dt>
       <dd > 芯片组：     Intel C236 
        </dd>
   </dl> -->
   <dl class="R730_dl">
       <dt class="red fon_16 fon_w">内存</dt>
       <dd >标配容量/最大支持： 8G/32G <br />
      内存类型/工作频率： ECC DDR3/2133MHz<br />
        内存插槽数量：48个 <br />



        </dd>
   </dl>
         <dl class="R730_dl">
       <dt class="red fon_16 fon_w">硬盘</dt>
       <dd >   标配容量/最大支持：标配1个8*2.5"热插拔硬盘模组，标配无硬盘
        </dd>
   </dl>
   <dl class="R730_dl">
       <dt class="red fon_16 fon_w">RAID支持</dt>
       <dd > 标配一个ServerRAID M5210支持SATA/SAS 0/1/10，可选Raid5/50/6/60升级密钥，可选1GB缓存或1GB/2GB/4GB闪存
        </dd>
   </dl>
         <dl class="R730_dl">
       <dt class="red fon_16 fon_w">网卡</dt>
       <dd > 板载ML2四端口千兆以太网卡，可选双口万兆夹层卡，兼容RHEL 7.1环境下Solarflare SFN7122F低延迟网卡
        </dd>
   </dl>
   <dl class="R730_dl">
       <dt class="red fon_16 fon_w">光驱装置</dt>
       <dd >类型：可选USB外置DVD光驱
        </dd>
   </dl>
         <dl class="R730_dl bd_last">
       <dt class="red fon_16 fon_w">电源</dt>
       <dd > 标配两个900W铂金电源，可选900W/1400W冗余电源
        </dd>
   </dl>
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
         <dl class="R730_dl no_bdc">
     <dt class="red fon_16 fon_w fuwu_zixun10 fuwu_zixun2">增值运维服务</dt>
       <dd>  九河互联拥有一支专业的技术工程师团队，可以为客户提供数据中心级运维增值服务，如日常服务器代维、服务器集群、负载均衡、内网组建等，客户仅需支付较少的费用，即可实现业务技术上的突飞猛进，详情请咨询客服人员）。
        </dd>
   </dl>
</div>
<#include "../footer.ftl" >
</body>
<script src="${BasePath}/scripts/custom/ex.js"></script>
</html>
