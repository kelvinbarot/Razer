
<%@ include file="Header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<script type="text/javascript">
var pro = ${plist}
var app = angular.module('myApp',[]);
app.controller('myCtrl', function($scope){
	$scope.pro=pro;
});
</script>


<div  class="container-fluid" id="cur">

  <c:if test="${sucess == true}">
  <div class="alert alert-success alert-dismissible">
  <button type="button" class="close" data-dismiss="alert">&times;</button>
 <strong>Success!</strong>Registration Successful.  
  </div>
  </c:if>
  <c:if test="${sucess == false}">
  <div class="alert alert-success alert-dismissible">
  <button type="button" class="close" data-dismiss="alert">&times;</button>
 <strong>Error!</strong>The User Name Is already in use.  
  </div>
  </c:if>




	<div id="myCarousel" class="carousel slide" data-ride="carousel">

		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
			<li data-target="#myCarousel" data-slide-to="3"></li>


		</ol>


		<div class="carousel-inner">
			<div class="item active">
			<img src="./res/rslide.png">
			</div>

			<div class="item">
				<img src="./res/razer-ouroboros.png">
			</div>

			<div class="item">
				<img src="./res/940x573-purple.png">
			</div>
			<div class="item">
				<img src="./res/razer-anansi.png">
			</div>

		</div>


		<a class="left carousel-control" href="#myCarousel" data-slide="prev">
			<span class="glyphicon glyphicon-chevron-left"></span>

		</a> <a class="right carousel-control" href="#myCarousel"
			data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right"></span>

		</a>
	</div>




</div>
<!-- <div class="container-fluid" ng-app="myApp">
<div ng-controller="myCtrl">
<div class="panel panel-primary" ng-repeat="p in pro">
<div class="panel-heading text-center">{{p.product_name}}</div>
<div class="panel-body"><a href="#"><img ng-src="./res/prod_images/{{p.product_id}}.jpg" class="img-responsive" /></a></div>
<div class="panel-footer text-center"><i class="fa fa-inr" style="color:black"></i>{{p.product_price}}</div>

</div>
</div>

</div> -->


<%@ include file="Footer.jsp"%>
