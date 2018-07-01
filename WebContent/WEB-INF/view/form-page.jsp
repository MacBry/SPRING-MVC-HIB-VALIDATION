<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SPRING-MVC-HIB-VALIDATION FORM PAGE</title>

<style > .block { 
		 display: block;
		 margin-left: 30px;
		 }
		 .margin {margin-left: 50px}
		 .margin1 {margin-left: 30px}
		 .container{
		 width: 500px;
		 }
		 .left{
		 width: 250px;
		 display: table-cell;
		 float: left;
		 background-color: #ff751a;
		 }
		 .right{
		 width: 250px;
		 float: right;
		 display: table-cell;
		 background-color: #ffd1b3;
		 }
</style>

</head>

<body>

<h1>PERSON FORM</h1>
<hr>
<form:form action="processForm" modelAttribute="person"  modelAtribute="adress">
<div class="container">

	<div class="left">
	
		
		<h2 class="margin">Person Data</h2>
		<hr>
		<a class="margin1">First name</a> <form:input path="firstName" cssClass="block" />
		<br>
		
		<a class="margin1">Last name</a> <form:input path="lastName" cssClass="block"/>
		<br>
		
		<a class="margin1">PESEL number</a> <form:input path="pesel" cssClass="block"/>
		<br>
		
		<a class="margin1">Select sex</a> <form:select path="sex" cssClass="block">
			
			<form:option value="male"/>
			<form:option value="female"/>
			
		</form:select>
		<br>
		
		<a class="margin1">Age</a><form:input path="age" cssClass="block"/>
		<br>
		
		

	
	</div>
	<div class="right"> 
	
		<h2 class="margin">Adress Data</h2>
		<hr>
		<a class="margin1">Country</a> <form:select path="adress.country" cssClass="block" >
			<form:options items="${adress.countryOptions}"/>
		</form:select>
		<br>
		<a class="margin1">Street</a> <form:input path="adress.street" cssClass="block" />
		<br>
		<a class="margin1">House number</a> <form:input path="adress.houseNumber" cssClass="block" />
		<br>
		<a class="margin1">Local number</a> <form:input path="adress.localNumber" cssClass="block" />
		<br>
		<a class="margin1">Zipcode</a> <form:input path="adress.zipcode" cssClass="block" />
		<br>
	
	</div>
</div>
<input type="submit" value=" Enter Data">
</form:form>
</body>
</html>