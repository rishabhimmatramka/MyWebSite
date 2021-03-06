<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title> </title>
<meta name="description" content=" " >
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>">
<script src="<c:url value="https://code.angularjs.org/1.3.0-beta.5/angular.js"/>" />   
<script src="<c:url value="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js" />" /> 
</head>
<body>
<script src="<c:url value="/resources/js/jquery-1.12.4.min.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/resources/js/script.js"/>"></script>
<div class="container" id="main">

	<div class= "navbar navbar-fixed-top" id= "mynavbar">
		<div class="container">
		<a class="navbar-brand" href="#"> <img src="<c:url value="#"/>" alt="LOGO"> </a>
		 <!--   <div class="nav-collapse collapse navbar-responsive-collapse "> -->  
			<ul class="nav navbar-nav pull-left">
				<li>
				<a href="#">Home</a>	
				</li>
				
				<li>
				<a href="contactUs">Contact Us</a>
				</li>
			</ul>
			<ul class="nav navbar-nav pull-right">
				<li>
					<a href="#"> Login </a>
				</li>
				
				<li>
					<a href="#"> Sign Up </a>
				</li>
			</ul>
			
	<!-- 	</div> -->
		</div>
	</div>
	
	<div class="carousel slide" id="mycarousel">
		
		<ol class="carousel-indicators">
			<li class="active" data-slide-to="0" data-target="mycarousel"></li>
			<li data-slide-to="1" data-target="mycarousel"></li>
			<li data-slide-to="2" data-target="mycarousel"></li>
		</ol>
		
		<div class="carousel-inner" >
		
			<div class="item active" id="slide1">
				<div class="carousel-caption">
				<h4>Welcome To Music World</h4>
				<p> Know Everything about music and find @ anything </p>
				</div>
			</div>	
		
			<div class="item" id="slide2">
					<div class="carousel-caption">
					<h4>Music World</h4>
					<p> Know Everything about music and find @ anything </p>
					</div>
			</div>	
		
			<div class="item" id="slide3">
				<div class="carousel-caption">
				<h4>Music Ki Duniya mein Aapka Swaagat hai</h4>
				<p> Know Everything about music and find @ anything </p>
				</div>
			</div>	
			
		</div>
		<a class="left carousel-control" data-slide="prev" href="#mycarousel"><span class="icon-prev"></span></a>
		<a class="right carousel-control" data-slide="next" href="#mycarousel"><span class="icon-next"></span></a>
	</div>
	
	<div class="row" id="myrow1">
		
		<div class="col-sm-4 feature">
			<div class=" panel" id="panel1">
				<div class="panel-heading" >
					<h3 class="panel-title"> Hi Download Songs Here</h3>
				</div>
				<p>This is the place you can download music from</p>
				<a href= "#" target="blank" class="btn btn-warning btn-block"> Download Music </a>
			</div>
		</div>
		
		<div class="col-sm-4 feature" >
			<div class=" panel" id= "panel2">
				<div class="panel-heading" >
					<h3 class="panel-title"> Listen to Songs here</h3>
				</div>
				<p>This is the place you can listen to your music from</p>
				<a href= "#" target="blank" class="btn btn-warning btn-block"> Listen To Music </a>
			</div>
		
		</div>
		
		<div class="col-sm-4 feature">
			<div class=" panel" id="panel3">
				<div class="panel-heading">
					<h3 class="panel-title"> Watch Movies Here</h3>
				</div>
				<p>This is the place you can Watch Movies From</p>
				<a href= "#" target="blank" class="btn btn-warning btn-block"> Watch Movies </a>
			</div>
		
		</div>
		
	</div>
	
</div>
<div ng-app="myApp" ng-controller="customersCtrl"> 

<table>
  <tr ng-repeat="x in names">
    <td>{{ x.Name }}</td>
    <td>{{ x.Country }}</td>
  </tr>
</table>

</div>

<script>
var app = angular.module('myApp', []);
app.controller('customersCtrl', function($scope, $http) {
    $http.get("http://www.w3schools.com/angular/customers.php")
    .then(function (response) {$scope.names = response.data.records;});
});
</script>

<footer id= "footer">
	<div class="container">
		<div class="row" id="myrow2">
			<div class="col-sm-4 feature">
				<p> &copy; All Rights Reserved </p>
			</div>
			<div class="col-sm-6 feature">
				<p></p>
			</div>
			<div class="col-sm-2 feature">
				<a href="#"> Privacy Terms </a>
			</div>
		</div>
	</div>		
</footer>

</html>
