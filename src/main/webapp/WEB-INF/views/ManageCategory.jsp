<%@ include file="Aheader.jsp"%>

<script>
	var categorylist = ${catobj}
	var app = angular.module('myApp', []);
	app.controller('myCtrl', function($scope) {
		$scope.category = categorylist;

	});
</script>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div ng-app="myApp">
<div class="container">
<c:choose>
	<c:when test="${userClickedUpdateCategory == true}" >
<form:form  ng-app="myApp" ng-controller="myCtrl" class="jumbotron" action="adminupdatecat" method="POST"
	commandName="mcat" style="background-image: url('./res/cbg.jpg');" >
	<div class="row" style="padding-bottom: 5px">
		<div class="col-sm-4">
			<div class="form-group">
				<form:label path="category_id">ID: </form:label>
				<form:input path="category_id" class="form-control disabledfield"
					readonly="true" placeholder="Enter Product ID" required="required"></form:input>
			</div>
		</div>
		<div class="col-sm-4">
			<div class="form-group">
				<form:label path="category_name">Name: </form:label>
				<form:input path="category_name" class="form-control disabledfield"
					placeholder="Enter Category name" required="required"></form:input>
			</div>
		</div>
		<div class="col-sm-4">
			<div class="form-group">
				<form:label path="category_description">Description: </form:label>
				<form:input path="category_description" class="form-control disabledfield"
					placeholder="Enter Category Description" required="required"></form:input>
			</div>
		</div>
	</div>
	


	<div class="row" style="padding-bottom: 5px">
		<div class="col-sm-4 col-sm-offset-4">
			<input type="submit" class="btn btn-primary btn-block"
				value="Update Category" />
		</div>
		
	</div>
</form:form>
</c:when>
<c:otherwise>
<form:form  ng-app="myApp" ng-controller="myCtrl" class="jumbotron" action="adminaddcat" 
	commandName="mcat" method="POST" style="background-image: url('./res/cbg.jpg');">
	<div class="row" style="padding-bottom: 5px">
		<div class="col-sm-4">
			<div class="form-group">
				<form:label path="category_id">ID: </form:label>
				<form:input path="category_id" class="form-control disabledfield"
					readonly="true" placeholder="Enter Product ID" required="required"></form:input>
			</div>
		</div>
		<div class="col-sm-4">
			<div class="form-group">
				<form:label path="category_name">Name: </form:label>
				<form:input path="category_name" class="form-control disabledfield"
					placeholder="Enter Category name" required="required"></form:input>
			</div>
		</div>
		<div class="col-sm-4">
			<div class="form-group">
				<form:label path="category_description">Description: </form:label>
				<form:input path="category_description" class="form-control disabledfield"
					placeholder="Enter Category Description" required="required"></form:input>
			</div>
		</div>
	</div>
	
	
	<div class="row" style="padding-bottom: 5px">
		<div class="col-sm-4 col-sm-offset-4">
			<input type="submit" class="btn btn-primary btn-block"
				value="Add Category" />
		</div>
		
	</div>
</form:form>

</c:otherwise>
</c:choose>
</div>
<div ng-app="myApp" ng-controller="myCtrl">
	
		<h4 align="center">Manage Category</h4>
		<div id="custom-search-input">
			<div class="input-group col-md-12">
				<input type="text" class="search-query form-control"
					placeholder="Search" ng-model="seachproduct" /></span>
			</div>
		</div>

		
			<table id="mytable" class="table table-bordred table-striped table-hover table-responsive">
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Description</th>
					<th>Status</th>
					<th>Edit/Delete</th>
					<th>Enable/Disable</th>

				</tr>
				<tr class="success" ng-repeat="prod in category|filter:seachproduct">
					<td>{{prod.category_id}}</td>
					<td>{{prod.category_name}}</td>
					<td>{{prod.category_description}}</td>
					<td>{{prod.category_status}}</td>
				    <td><a href="adminfetchcat?category_id={{prod.category_id}}"><button  title="Edit"
						class="btn btn-success btn-xs" ><span
							class="glyphicon glyphicon-edit"></span></button></a>
							<a href="admindeletecategory?category_id={{prod.category_id}}"><button title="Delete"class="btn btn-danger btn-xs">
							<span class="glyphicon glyphicon-trash"></span></button></a>
				 </td>
					<td><a data-placement="top" data-toggle="tooltip" title="Enable" class="btn btn-success btn-xs" href="adminstatus_enable?category_id={{prod.category_id}}"><span class="glyphicon glyphicon-check"></span></a>
					<a data-placement="top" data-toggle="tooltip" title="Disable" class="btn btn-danger btn-xs" href="adminstatus_disable?category_id={{prod.category_id}}"><span class="glyphicon glyphicon-unchecked"></span></a></td>
					
					
				</tr>
			</table>
		
	</div>
</div>






<%@ include file="Footer.jsp"%>