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
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
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
						 	<c:set var="name_selected" scope="session" value = "${country.name}"/>
						 	<c:set var="capital_selected" scope="session" value = "${country.capital}"/>
						 	<c:set var="region_selected" scope="session" value = "${country.region}"/>
						 	<c:set var="subregion_selected" scope="session" value = "${country.subregion}"/>
						 	<c:set var="alpha2Code_selected" scope="session" value = "${country.alpha2Code}"/>
						 	<c:set var="languages_selected" scope="session" value = "${country.languages}"/>
							<s:span onclick="clic('${name_selected}', 
												  '${capital_selected}', 
												  '${region_selected}',
												  '${subregion_selected}',
												  '${alpha2Code_selected}',
												  '${languages_selected}'
												  ) ">${country.name}</s:span><br>
						</c:forEach>
					</ul>
				</div>
			</form>
		</div>

		<div class="rightpane">
			<div class="panel-heading">History</div>
			<div id="countryCounterElement" class="panel-body scrollable">
				Selected countries
				 <dl id="dlCountryCounter">
				</dl> 
			</div>
		</div>

		<div class="middlepane">
			<div class="panel-heading">Selection</div>
				<div class="panel-body">
					<img id="flagElement" src="">
					
					<span>Name: </span><span id="countryName"> </span><br>
					<span>Capital City: </span><span id="countryCapital"> </span><br>
					<span>Region: </span><span id="countryRegion"> </span><br>
					<span>Sub-Region: </span><span id="countrySubregion">  </span><br>
					<span>Languages: </span><span id="countryLangs"> </span><br> <!--it's an array-->
				</div>
		</div>
	</div>
</body>
</html>