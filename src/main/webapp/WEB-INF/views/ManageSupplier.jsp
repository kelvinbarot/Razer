<%@ include file="Aheader.jsp" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<script>
	var supplierlist = ${suppobj}
	var app = angular.module('myApp', []);
	app.controller('myCtrl', function($scope) {
		$scope.supplier = supplierlist;

	});
</script>


<div class="container">
<c:choose>
	<c:when test="${userClickedUpdateSupplier == true}" >
	<form:form class="jumbotron" action="updates"  commandName="ms" method="POST" style="background-image: url('./res/cbg.jpg');">
		<div class="row" style="padding-bottom: 5px">
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="supplier_id">ID: </form:label>
					<form:input path="supplier_id" class="form-control disabledfield" readonly="true" placeholder="Enter Supplier ID" required="required"></form:input>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="supplier_name">Name: </form:label>
					<form:input path="supplier_name" class="form-control" placeholder="Enter Supplier Name" required="required"></form:input>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="supplier_address">Address: </form:label>
					<form:textarea rows="2" path="supplier_address" class="form-control"
						placeholder="Enter Supplier Address" required="required"></form:textarea>
				</div>
			</div>
		</div>
		<div class="row" style="padding-bottom: 5px">
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="supplier_state">State: </form:label>
					<form:input path="supplier_state" class="form-control" placeholder="Enter Supplier State" required="required"></form:input>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="supplier_city">City: </form:label>
					<form:input path="supplier_city" class="form-control" placeholder="Enter Supplier City" required="required"></form:input>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="supplier_pincode">Pincode: </form:label>
					<form:input path="supplier_pincode" class="form-control"
						placeholder="Enter Supplier Pincode" required="required" pattern="^[1-9][0-9]{5}$" title="Please enter a valid pincode"></form:input>
				</div>
			</div>
		</div>
		<div class="row" style="padding-bottom: 5px">
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="supplier_contact">Contact Number: </form:label>
					<form:input path="supplier_contact" class="form-control" placeholder="Enter Supplier Contact Number" required="required" pattern="(^[1-8]\d{9}$)|(^[789]\d{9}$)" title="Please enter a valid contact number (including STD code for landlines) but excluding the zero at the start"></form:input>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="supplier_payment">Payment Method: </form:label><br>
					<form:select multiple="true" path="supplier_payment" class="form-control" required="required">
						<form:option value="Cash On Delivery">Cash On Delivery</form:option>
						<form:option value="Online Payment">Online Payment</form:option>
						<form:option value="Card Payment">Card Payment</form:option>
					</form:select>
				</div>
			</div>
		</div>
		<div class="row" style="padding-bottom: 5px">	
			<div class="col-sm-4 col-sm-offset-4">
				<input type="submit" class="btn btn-primary btn-block" value="Update Supplier" />
			</div>
		</div>
	</form:form>
	
	</c:when>
	<c:otherwise>
<form:form class="jumbotron" action="addSupplier"  commandName="ms" method="POST" style="background-image: url('./res/cbg.jpg');">
		<div class="row" style="padding-bottom: 5px" >
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="supplier_id">ID: </form:label>
					<form:input path="supplier_id" class="form-control disabledfield" readonly="true" placeholder="Enter Supplier ID" required="required"></form:input>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="supplier_name">Name: </form:label>
					<form:input path="supplier_name" class="form-control" placeholder="Enter Supplier Name" required="required"></form:input>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="supplier_address">Address: </form:label>
					<form:textarea rows="2" path="supplier_address" class="form-control"
						placeholder="Enter Supplier Address" required="required"></form:textarea>
				</div>
			</div>
		</div>
		<div class="row" style="padding-bottom: 5px">
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="supplier_state">State: </form:label>
					<form:input path="supplier_state" class="form-control" placeholder="Enter Supplier State" required="required"></form:input>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="supplier_city">City: </form:label>
					<form:input path="supplier_city" class="form-control" placeholder="Enter Supplier City" required="required"></form:input>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="supplier_pincode">Pincode: </form:label>
					<form:input path="supplier_pincode" class="form-control"
						placeholder="Enter Supplier Pincode" required="required" pattern="^[1-9][0-9]{5}$" title="Please enter a valid pincode"></form:input>
				</div>
			</div>
		</div>
		<div class="row" style="padding-bottom: 5px">
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="supplier_contact">Contact Number: </form:label>
					<form:input path="supplier_contact" class="form-control" placeholder="Enter Supplier Contact Number" required="required" pattern="(^[1-8]\d{9}$)|(^[789]\d{9}$)" title="Please enter a valid contact number (including STD code for landlines) but excluding the zero at the start"></form:input>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="supplier_payment">Payment Method: </form:label><br>
					<form:select multiple="true" path="supplier_payment" class="form-control" required="required">
						<form:option value="Cash On Delivery">Cash On Delivery</form:option>
						<form:option value="Online Payment">Online Payment</form:option>
						<form:option value="Card Payment">Card Payment</form:option>
					</form:select>
				</div>
			</div>
		</div>
		<div class="row" style="padding-bottom: 5px">	
			<div class="col-sm-4 col-sm-offset-4">
				<input type="submit" class="btn btn-primary btn-block" value="Add Supplier" />
			</div>
		</div>
	</form:form>
	</c:otherwise>
	</c:choose>
	</div>
	<div ng-app="myApp" ng-controller="myCtrl">
	
		<h4 align="center">Manage Supplier</h4>
		<div id="custom-search-input">
			<div class="input-group col-md-12">
				<input type="text" class="search-query form-control"
					placeholder="Search" ng-model="seachproduct" /></span>
			</div>
		</div>

		<div class="table-responsive">
			<table id="mytable"
				class="table table-bordred table-striped table-hover">
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Address</th>
					<th>State</th>
					<th>City</th>
					<th>Pincode</th>
					<th>Contact Number</th>
					<th>Payment Method</th>
					<th>Edit/Delete</th>

				</tr>
				<tr class="success" ng-repeat="prod in supplier|filter:seachproduct">
					<td>{{prod.supplier_id}}</td>
					<td>{{prod.supplier_name}}</td>
					<td>{{prod.supplier_address}}</td>
					<td>{{prod.supplier_state}}</td>
					<td>{{prod.supplier_city}}</td>
					<td>{{prod.supplier_pincode}}</td>
					<td>{{prod.supplier_contact}}</td>
					<td>{{prod.supplier_payment}}</td>
				    <td><a data-placement="top" data-toggle="tooltip" title="Edit" class="btn btn-success btn-xs" href="fetchs?supplier_id={{prod.supplier_id}}"><span class="glyphicon glyphicon-pencil"></span></a><a data-placement="top" data-toggle="tooltip" title="Delete" class="btn btn-danger btn-xs" href="deletes?supplier_id={{prod.supplier_id}}"><span class="glyphicon glyphicon-trash"></span></a></td>
					
					
					
				</tr>
			</table>
		</div>
	</div>

	
	
<%@ include file="Footer.jsp" %>