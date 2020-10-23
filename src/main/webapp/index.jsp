<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Countries of the world</title>
	<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<link rel="stylesheet" href="css/styles.css">
	<script src="js/main.js"></script> 
</head>
<body>
	<h1>Country Explorer</h1>

	<div class="container">
		<div class="leftpane">
			<form action="getCountries" method="get">
				<div class="panel-heading">Countries</div>
				<div class="panel-body scrollable">
					<ul>
						<c:forEach var="country" items="${countries}">
							<span onclick="clic(${country})">${country.name}</span><br>
						</c:forEach>
					</ul>
				</div>
			</form>
		</div>

		<div class="rightpane">
			<div class="panel-heading">History</div>
			<div class="panel-body scrollable">
				Selected countries
			</div>
		</div>

		<div class="middlepane">
			<div class="panel-heading">Selection</div>
				<div class="panel-body">
					<!-- 			{flagUrl} -->
					<img src="https://www.countryflags.io/be/shiny/64.png">
					
					<span id="countryName"> {country.name} </span><br>
					<span id="countryCapital"> {country.capital} </span><br>
					<span id="countryRegion"> {country.region} </span><br>
					<span id="countrySubregion"> {country.subregion} </span><br>
					<span id="countryLangs"> {country.languages} </span><br> <!--it's an array-->
				</div>
		</div>
	</div>
</body>
</html>