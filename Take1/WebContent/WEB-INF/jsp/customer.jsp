<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Management</title>
</head>
<body>
<h1>Customer Data</h1>
<form:form action="customer.do" method="POST" commandName="customer">
	<table>
		<tr>
			<td>Customer ID</td>
			<td><form:input path="customerId" /></td>
		</tr>
		<tr>
			<td>Customer code</td>
			<td><form:input path="customerCode" /></td>
		</tr>
		<tr>
			<td>Customer name</td>
			<td><form:input path="customerName" /></td>
		</tr>
		<tr>
			<td>Customer Address 1</td>
			<td><form:input path="customerAddress1" /></td>
		</tr>
		<tr>
			<td>Customer Address 2</td>
			<td><form:input path="customerAddress2" /></td>
		</tr>
		<tr>
			<td>Customer Pincode</td>
			<td><form:input path="customerPinCode" /></td>
		</tr>
		<tr>
			<td>Customer Email</td>
			<td><form:input path="emailAddress" /></td>
		</tr>
		<tr>
			<td>Contact Number</td>
			<td><form:input path="contactNumber" /></td>
		</tr>
		<tr>
			<td>Primary Contact</td>
			<td><form:input path="primaryContactPerson" /></td>
		</tr>
		<tr>
			<td>Record Status</td>
			<td><form:input path="recordStatus" /></td>
		</tr>
		<tr>
			<td>activeInactiveFlag</td>
			<td><form:input path="activeInactiveFlag" /></td>
		</tr>
		<tr>
			<td>Create Date</td>
			<td><form:input path="createDate" /></td>
		</tr>
		<tr>
			<td>Create Date</td>
			<td><form:input path="createdBy" /></td>
		</tr>
		<tr>
			<td>Create By</td>
			<td><form:input path="createDate" /></td>
		</tr>
		<tr>
			<td>Modified Date</td>
			<td><form:input path="modifiedDate" /></td>
		</tr>
		<tr>
			<td>Modified By</td>
			<td><form:input path="modifiedBy" /></td>
		</tr>
		<tr>
			<td>Authorized Date</td>
			<td><form:input path="authorisedDate" /></td>
		</tr>
		<tr>
			<td>Authorized By</td>
			<td><form:input path="authorisedBy" /></td>
		</tr>
		
		<tr>
			<td colspan="2">
				<input type="submit" name="action" value="Add" />
				<input type="submit" name="action" value="Edit" />
				<input type="submit" name="action" value="Delete" />
				<input type="submit" name="action" value="Search" />
			</td>
		</tr>
	</table>
</form:form>
<br>
<table border="1">
	<th>Customer ID</th>
	<th>Customer name</th>
	<th>Customer Address 1</th>
	<th>Customer Address 2</th>
	<c:forEach items="${customerList}" var="customer">
		<tr>
			<td>${customer.customerId}</td>
			<td>${customer.customerName}</td>
			<td>${customer.customerAddress1}</td>
			<td>${customer.customerAddress2}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>