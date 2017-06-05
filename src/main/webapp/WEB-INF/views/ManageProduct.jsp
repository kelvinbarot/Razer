<%@ include file="Aheader.jsp"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<script>
	var productlist = ${prodlist}
	var categorylist = ${catobj}
	var supplierlist = ${suppobj}
	var app = angular.module('myApp', []);
	app.controller('myCtrl', function($scope) {
		$scope.products = productlist;
		$scope.category = categorylist;
		$scope.supplier = supplierlist;
	});
</script>
<div ng-app="myApp">
<div class="container">
	<c:choose>
		<c:when test="${userClickedUpdateProduct == true}">
			<form:form ng-app="myApp" ng-controller="myCtrl" class="jumbotron"
				action="validp" method="POST" commandName="mp" enctype="multipart/form-data" style="background-image: url('./res/cbg.jpg');">
				<div class="row" style="padding-bottom: 5px">
					<div class="col-sm-4">
						<div class="form-group">
							<form:label path="product_id">ID: </form:label>
							<form:input path="product_id" class="form-control disabledfield"
								readonly="true" placeholder="Enter Product ID"
								required="required"></form:input>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="form-group">
							<form:label path="product_name">Name: </form:label>
							<form:input path="product_name"
								class="form-control disabledfield"
								placeholder="Enter Product name" required="required"></form:input>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="form-group">
							<form:label path="product_des">Description: </form:label>
							<form:input path="product_des" class="form-control disabledfield"
								placeholder="Enter Product ID" required="required"></form:input>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="form-group">
							<form:label path="product_price">Price: </form:label>
							<form:input path="product_price"
								class="form-control disabledfield"
								placeholder="Enter Product ID" required="required"></form:input>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="form-group">
							<form:label path="product_qty">Quantity: </form:label>
							<form:input path="product_qty" class="form-control disabledfield"
								placeholder="Enter Product ID" required="required"></form:input>
						</div>
					</div>
					<div class="col-sm-4">
				<div class="form-group">
					<form:label path="category_id">Category:</form:label><br>
					<form:select path="category_id" class="form-control">
						<option  ng-repeat="category in category" value="{{category.category_id}}">{{category.category_name}}</option>
					</form:select>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="supplier_id">Supplier:</form:label><br>
					<form:select path="supplier_id" class="form-control">
						<option  ng-repeat="supplier in supplier" value="{{supplier.supplier_id}}">{{supplier.supplier_name}}</option>
					</form:select>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="product_image">Product Image:</form:label>
					<form:input path="product_image" class="form-control" type="file"></form:input>
				</div>
			</div>



					<div class="row" style="padding-bottom: 5px">
						<div class="col-sm-4 col-sm-offset-4">
							<input type="submit" class="btn btn-primary btn-block"
								value="Update Product" />
						</div>

					</div>
				</div>

			</form:form>
		</c:when>
		<c:otherwise>
			<form:form ng-app="myApp" ng-controller="myCtrl" class="jumbotron" action="addproduct" commandName="mp"
				method="POST" enctype="multipart/form-data" style="background-image: url('./res/cbg.jpg');">
				<div class="row" style="padding-bottom: 5px">
					<div class="col-sm-4">
						<div class="form-group">
							<form:label path="product_id">ID: </form:label>
							<form:input path="product_id" class="form-control disabledfield"
								readonly="true" placeholder="Enter Product ID"
								required="required"></form:input>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="form-group">
							<form:label path="product_name">Name: </form:label>
							<form:input path="product_name"
								class="form-control disabledfield"
								placeholder="Enter Product name" required="required"></form:input>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="form-group">
							<form:label path="product_des">Description: </form:label>
							<form:input path="product_des" class="form-control disabledfield"
								placeholder="Enter Product ID" required="required"></form:input>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="form-group">
							<form:label path="product_price">Price: </form:label>
							<form:input path="product_price"
								class="form-control disabledfield"
								placeholder="Enter Product ID" required="required"></form:input>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="form-group">
							<form:label path="product_qty">Qty: </form:label>
							<form:input path="product_qty" class="form-control disabledfield"
								placeholder="Enter Product ID" required="required"></form:input>
						</div>
					</div>
					<div class="col-sm-4">
				<div class="form-group">
					<form:label path="category_id">Category:</form:label><br>
					<form:select path="category_id" class="form-control">
						<option  ng-repeat="category in category" value="{{category.category_id}}">{{category.category_name}}</option>
					</form:select>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="supplier_id">Supplier:</form:label><br>
					<form:select path="supplier_id" class="form-control">
						<option  ng-repeat="supplier in supplier" value="{{supplier.supplier_id}}">{{supplier.supplier_name}}</option>
					</form:select>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="product_image">Product Image:</form:label>
					<form:input path="product_image" class="form-control" type="file" required="required"></form:input>
				</div>
			</div>
		
					<div class="row" style="padding-bottom: 5px">
						<div class="col-sm-4 col-sm-offset-4">
							<input type="submit" class="btn btn-primary btn-block"
								value="Add Product" />
						</div>

					</div>
				</div>
			</form:form>
		</c:otherwise>
	</c:choose>
</div>
<div ng-app="myApp" ng-controller="myCtrl">

		<h4 align="center">Manage Products</h4>
		<div id="custom-search-input">
			<div class="input-group col-md-12">
				<input type="text" class="search-query form-control"
					placeholder="Search" ng-model="seachproduct" /></span>
			</div>
		</div>

	
			<table id="mytable"
				class="table table-bordred table-striped table-hover table-responsive">
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Description</th>
					<th>Price</th>
					<th>Image</th>
					<th>Quantity</th>
					<th>Category ID</th>
					<th>Supplier ID</th>
					<th>Status</th>           
					<th>Edit/Delete</th>
					<th>Enable/Disable</th>

				</tr>
				<tr class="success" ng-repeat="prod in products|filter:seachproduct">
					<td>{{prod.product_id}}</td>
					<td>{{prod.product_name}}</td>
					<td>{{prod.product_des}}</td>
					<td>{{prod.product_price}}</td>
					<td><img ng-src="./res/prod_images/{{prod.product_id}}.jpg" height="50px" width="50px"/></td>
					<td>{{prod.product_qty}}</td>
					<td>{{prod.category_id}}</td>
					<td>{{prod.supplier_id}}</td>
					<td>{{prod.product_status}}</td>
					<td><a href="updateprod?product_id={{prod.product_id}}"><button  title="Edit"
						class="btn btn-success btn-xs" ><span
							class="glyphicon glyphicon-edit"></span></button></a>
							<a href="deletep?product_id={{prod.product_id}}"><button title="Delete"class="btn btn-danger btn-xs">
							<span class="glyphicon glyphicon-trash"></span></button></a>
				 </td>
							<td><a data-placement="top" data-toggle="tooltip" title="Enable" class="btn btn-success btn-xs" href="status_enable_product?product_id={{prod.product_id}}"><span class="glyphicon glyphicon-check"></span></a>
					<a data-placement="top" data-toggle="tooltip" title="Disable" class="btn btn-danger btn-xs" href="status_disable_product?product_id={{prod.product_id}}"><span class="glyphicon glyphicon-unchecked"></span></a>
					</td>


				</tr>
			</table>
	
	</div>


</div>




<%@ include file="Footer.jsp"%>