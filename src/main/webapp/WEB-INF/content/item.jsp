<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>商品详情</title>
<link href="css/bootstrap.min1.css" rel="stylesheet">
<link href="css/datepicker3.css" rel="stylesheet">
<link href="css/styles1.css" rel="stylesheet">
<link href="css/styles.css" rel="stylesheet">
<link href="css/bootstrap-table.css" rel="stylesheet">

<!--[if lt IE 9]>
<script src="js/html5shiv.js"></script>
<script src="js/respond.min.js"></script>
<![endif]-->

</head>
<body>
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">各“书”己见</a>
				<ul class="user-menu">
					<li class="dropdown pull-right">
					<p>${sessionScope.user.user_name }</p>
					</li>
					
				</ul>
			</div>
		</div><!-- /.container-fluid -->
	</nav>
	<div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
		<form role="search">
			<div class="form-group">
				<input type="text" class="form-control" placeholder="商品详情">
			</div>
		</form>
		<ul class="nav menu">
			<li><a href="index">首页</a></li>
			<li class="active"><a href="showuser">商品展示</a></li>
			<li><a href="#">商品详情</a></li>
			<li><a href="comment">商品评论</a></li>
			<li><a href="index#contact">联系我们</a></li>
		</ul>
		
	</div><!--/.sidebar-->
	
		
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">
		<div class="row">
			<div class="col-md-8">
			
				<div class="panel panel-default chat" >
                    <div class="panel-heading" id="accordion"><span class="glyphicon glyphicon-comment"></span>图片</div>
					<div class="panel-body"style="height: 500px;">
						<ul>
							<li class="left clearfix">
								<div class="gtco-tab-content-wrap">
									<form action="intocart" method="get">
										<div class="gtco-tab-content tab-content active" data-tab-content="1">
											<div class="col-md-6">
												<div class="gtco-video gtco-bg" >
													<img src="images/${item1.good_image }"style="width:320px;height:300px;" />
												</div>
											</div>
											<div class="col-md-6" >
												<div class="chat-body clearfix">
													<div class="header">
														<strong class="primary-font">${item1.good_name}</strong> <br/><small class="text-muted">author</small>
													</div>
													<p>
														${item1.good_remark } 
													</p>
													<div><hr></div>
	                                    			<div class="header">
														<strong class="primary-font">价格：</strong><span style="color: red;font-size: 20px;">${item1.good_price}<span style="color: grey;font-size: 16px">元</span></span>
													</div>
	                                    			<div><hr></div>
	                                   				
	                                   				<div>
	                                        				<input type="hidden" name="good_id" value="${item1.good_id}"/>
	                                            			<label for="number">数量:</label>
	                                            			 <input type="number" value="1"  class="form-control" style="width:200px" name="good_number" id="number">
	                                            			 <!-- <input type="text" name="good_number" placeholder="请输入购买数量" id="number" style="border: 1px solid #eee;"/> -->
	                                        			
	                                    			</div>
	                                    			<br/>
	                                    			<div>
	                                        			<center>
	                                        			<%-- <a href="intocart?good_id=${item1.good_id}">购买</a> --%>
	                                        			<button type="submit" class="btn btn-primary">立即购买</button>
	                                        			</center>
	                                    			</div>
	                           					</div>
	                                    	</div>
	                                    </div>
                                    </form>
                                 </div>
							</li>
						</ul>
					</div>	
				</div>
				
			</div><!--/.col-->
			
			<div class="col-md-4">
			
				<div class="panel panel-blue" style="background: #ececff;height: 500px;">
					<div class="panel-heading dark-overlay">
						<p style="font-family:华文新魏;color:black;font-size:25px;">用户操作</p>
					</div>
					<div class="panel-body">
						<div class="input-group">
											<hr>
									</div>
									<div class="input-group">
											<hr>
									</div>
								<div class="panel-footer">
									<div class="input-group">
										<span class="input-group-btn">
											<a href="comment?gid=${item1.good_id}"><button class="btn btn-success btn-md form-control" id="btn-chat">查看评论</button></a>
										</span>
									</div>
								</div>
							
							
									<div class="input-group">
											<hr>
									</div>
									<div class="input-group">
											<hr>
									</div>
								
							
								<div class="panel-footer">
									<div class="input-group">
										
										<span class="input-group-btn">
											<a href="#"><button class="btn btn-success btn-md form-control" id="btn-chat">添加到收藏</button></a>
										</span>
									</div>
								</div>
							
							<!--  <li class="left clearfix">
								<span class="chat-img pull-left">
									<img src="http://placehold.it/80/30a5ff/fff" alt="User Avatar" class="img-circle" />
								</span>
								<div class="chat-body clearfix">
									<div class="header">
										<strong class="primary-font">John Doe</strong> <small class="text-muted">32 mins ago</small>
									</div>
									<p>
										Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla ante turpis, rutrum ut ullamcorper sed, dapibus ac nunc. Vivamus luctus convallis mauris, eu gravida tortor aliquam ultricies. 
									</p>
								</div>
							</li>-->
						
					</div>
					</div>
			</div><!--/.col-->
		</div><!--/.row-->
        
        
	</div>
		

	<script src="js/jquery-1.11.1.min.js"></script>
	<script src="js/bootstrap.min1.js"></script>
	<script src="js/chart.min.js"></script>
	<script src="js/chart-data.js"></script>
	<script src="js/easypiechart.js"></script>
	<script src="js/easypiechart-data.js"></script>
	<script src="js/bootstrap-datepicker.js"></script>
	<script>
		$('#calendar').datepicker({
		});

		!function ($) {
		    $(document).on("click","ul.nav li.parent > a > span.icon", function(){          
		        $(this).find('em:first').toggleClass("glyphicon-minus");      
		    }); 
		    $(".sidebar span.icon").find('em:first').addClass("glyphicon-plus");
		}(window.jQuery);

		$(window).on('resize', function () {
		  if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')
		})
		$(window).on('resize', function () {
		  if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')
		})
	</script>
</body>
</html>