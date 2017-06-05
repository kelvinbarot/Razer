<%@ include file="Header.jsp"%>

<script type="text/javascript">
	var pro = ${plist}
	var app = angular.module('myApp', []);
	app.controller('myCtrl', function($scope) {
		$scope.pro = pro;
	});
</script>
<div ng-app="myApp" ng-controller="myCtrl" class="container">
	<div class="row">
		<div ng-repeat="p in pro" class="col-sm-3">
			<div class="panel panel-primary">
				<div class="panel-heading text-center">{{p.product_name}}</div>
				<div class="panel-body">
					<a href="#"><img
						ng-src="./res/prod_images/{{p.product_id}}.jpg"
						class="img-responsive" width="200px" height="200px" /></a>
				</div>
				<div class="panel-footer text-center fa fa-inr ">{{p.product_price}}</div>
			</div>
		</div>
	</div>
</div>


<%@ include file="Footer.jsp"%>