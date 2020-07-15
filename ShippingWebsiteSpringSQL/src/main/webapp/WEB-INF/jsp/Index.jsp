<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import= "java.util.Arrays"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/> 
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>JBA Shipping inc.</title>
	<script><%@include file="../resources/js/reportfunctions.js"%></script>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js"></script>
	<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
<style>

.Site_Features_List {
  width: 1100px;
  height: 350px;
  left: 8px;
  overflow: hidden;
  border: 1px solid black;
  position: relative;
  }
.ProductSlides{
	width: 1100px;
	object-fit: cover;
  }
.SlideText {
	position: absolute;
	top: 89%;
	left: 8px;
	width: 210px;
	height: 30px;
	font-size:20px;
	color:white;
	background: black;
	text-indent: 20px;
  }
#pic{width: 100%;}

.ProductSlides.shifting {
    right: 0;
	transition: right .2s ease-out;
    opacity:1;
	
}

.sidenav {
  height: 100%;
  width: 0;
  position: fixed;
  z-index: 1;
  top: 0;
  left: 0;
  background-color: #111;
  overflow-x: hidden;
  transition: 0.5s;
  padding-top: 60px;
}

.sidenav a {
  padding: 8px 8px 8px 32px;
  text-decoration: none;
  font-size: 25px;
  color: #818181;
  display: block;
  transition: 0.3s;
}

.sidenav a:hover {
  color: #f1f1f1;
}

.sidenav .closebtn {
  position: absolute;
  top: 0;
  right: 25px;
  font-size: 36px;
  margin-left: 50px;
}

@media screen and (max-height: 450px) {
  .sidenav {padding-top: 15px;}
  .sidenav a {font-size: 18px;}
}

#CenterLine{
  display: block;
  margin-left: auto;
  margin-right: auto;
  width: 50%;
}

</style>
</head>
<body>
    <h2 class="hello-title">Welcome to the JBA Food Shipping service How may we serve you today</h2>
    <p>Insert into here a fancy page to sell the compony and what it dose</p>
    <div id="mySidenav" class="sidenav">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  <a href="#">About</a>
  <a href="#">Services</a>
  <a href="#">Clients</a>
  <a href="#">Contact</a>
  <spring:url value="${contextPath}/login" var="StartURL" />
  <a id="LoadFile" href="${StartURL }" >Login</a>.
</div>
<span style="font-size:30px; cursor:pointer;" onclick="openNav()">&#9776; open</span>
    
    
    <div id="Placeholder">${test}</div>
    <div id="slider" class="Site_Features_List">
		<c:forEach var="img" items="${imageUrlList}">  
			<div id="silde" class="ProductSlides">
				<img id="pic" src="${contextPath}/ImageAssets/${img}" alt="MissingImg" width="800" height="400"/>
				<p class="SlideText"><span>${fn:substringBefore(img, ".")}</span></p>
			</div>
		</c:forEach>
		<canvas class="ProductSlides" id="chartContainer"></canvas>
	</div>
	
	<div Class="AboutSite">
	<img id="CenterLine" src="${contextPath}/FixedAssets/ComponyLogo.png" alt="Logo" width="400" height="200"/>
	<br>
	<br>
	<img id="CenterLine" src="${contextPath}/FixedAssets/AaronLarch.jpg" alt="Founder" width="800" height="400"/>
	<p>This is our Co-founder and CEO. Aaron Larch Is a GCE Trainee built this website from scratch and designed All of
	the features, testing, displays, and added a exsternal database with the help from co founder.
	This project started in march 2019 and went through several interations and redesigns as features were added and the sight exspanded.
	Click Here to see what the sight has to offer.</p>
	<br>
	<div style="float: center;">
	<h2>this is our co-founder and guy who built 2 web pages</h2>
	<img id="Cofounder" src="${contextPath}/FixedAssets/BrianRodewald.jpg" style="float: left;" alt="Co-Founder" width="800" height="400"/>
	<p>Desinged Some the chart tables for anilitic display page and added some style changes to the report page</p>
	</div>
	To contact us for an interview please call us at 111-222-3333 or go to a place that dose not exist
	</div>
	
		<spring:url value="/TestPage" var="invoice" />
		<form:form ModelAttribute="testVal" method="post" action="${invoice}" id="my_form">
		<label>Amount Purchased</label>
		<input type="text" name="testVal" form="my_form" />
		<button type="submit" class="btn btn-primary" form="my_form">Save</button> 
		</form:form>
		
		
<div class="page">
    <header>
      <h1>LOLCAT CLOCK</h1>
    </header>

    <h4>
      I CAN HAZ TIME?? <br>
      <span id="clock">Clock goes here</span>
    </h4>

    <img id="lolcatImage" src="https://s3.amazonaws.com/media.skillcrush.com/skillcrush/wp-content/uploads/2016/08/normalTime.jpg" alt="lolcat">

    <blockquote id="timeEvent">This is where time events are reported</blockquote>


    set Wake Up Time
    <select id="wakeUpTimeSelector">
      <option value="1">1 AM - 2AM</option>
      <option value="2">2 AM - 3AM</option>
      <option value="3">3 AM - 4AM</option>
      <option value="4">4 AM - 5AM</option>
      <option value="5">5 AM - 6AM</option>
      <option value="6">6 AM - 7AM</option>
      <option value="7">7 AM - 8AM</option>
      <option value="8" selected>8 AM - 9AM</option>
      <option value="9">9 AM - 10AM</option>
      <option value="10">10 AM - 11AM</option>
      <option value="11">11 AM - 12PM</option>
      <option value="12">12 PM - 1PM</option>
      <option value="13">1 PM - 2PM</option>
      <option value="14">2 PM - 3PM</option>
      <option value="15">3 PM - 4PM</option>
      <option value="16">4 PM - 5PM</option>
      <option value="17">5 PM - 6PM</option>
      <option value="18">6 PM - 7PM</option>
      <option value="19">7 PM - 8PM</option>
      <option value="20">8 PM - 9PM</option>
      <option value="21">9 PM - 10PM</option>
      <option value="22">10 PM - 11PM</option>
      <option value="23">11 PM - 12AM</option>
      <option value="24">12 AM - 1AM</option>
    </select>
    <br>
    set Lunch Time
      <select id="lunchTimeSelector">
        <option value="1">1 AM - 2AM</option>
        <option value="2">2 AM - 3AM</option>
        <option value="3">3 AM - 4AM</option>
        <option value="4">4 AM - 5AM</option>
        <option value="5">5 AM - 6AM</option>
        <option value="6">6 AM - 7AM</option>
        <option value="7">7 AM - 8AM</option>
        <option value="8">8 AM - 9AM</option>
        <option value="9">9 AM - 10AM</option>
        <option value="10">10 AM - 11AM</option>
        <option value="11">11 AM - 12PM</option>
        <option value="12" selected>12 PM - 1PM</option>
        <option value="13">1 PM - 2PM</option>
        <option value="14">2 PM - 3PM</option>
        <option value="15">3 PM - 4PM</option>
        <option value="16">4 PM - 5PM</option>
        <option value="17">5 PM - 6PM</option>
        <option value="18">6 PM - 7PM</option>
        <option value="19">7 PM - 8PM</option>
        <option value="20">8 PM - 9PM</option>
        <option value="21">9 PM - 10PM</option>
        <option value="22">10 PM - 11PM</option>
        <option value="23">11 PM - 12AM</option>
        <option value="24">12 AM - 1AM</option>
      </select>
    <br>
    set Nap Time
    <select id="napTimeSelector">
      <option value="1">1 AM - 2AM</option>
      <option value="2">2 AM - 3AM</option>
      <option value="3">3 AM - 4AM</option>
      <option value="4">4 AM - 5AM</option>
      <option value="5">5 AM - 6AM</option>
      <option value="6">6 AM - 7AM</option>
      <option value="7">7 AM - 8AM</option>
      <option value="8">8 AM - 9AM</option>
      <option value="9">9 AM - 10AM</option>
      <option value="10">10 AM - 11AM</option>
      <option value="11">11 AM - 12PM</option>
      <option value="12">12 PM - 1PM</option>
      <option value="13">1 PM - 2PM</option>
      <option value="14">2 PM - 3PM</option>
      <option value="15" selected>3 PM - 4PM</option>
      <option value="16">4 PM - 5PM</option>
      <option value="17">5 PM - 6PM</option>
      <option value="18">6 PM - 7PM</option>
      <option value="19">7 PM - 8PM</option>
      <option value="20">8 PM - 9PM</option>
      <option value="21">9 PM - 10PM</option>
      <option value="22">10 PM - 11PM</option>
      <option value="23">11 PM - 12AM</option>
      <option value="24">12 AM - 1AM</option>
      </select>
    <br>
    <button id="partyTimeButton">Party!</button>

    <footer>
      <p>&copy; Skillcrush 2016</p>
    </footer>
  </div>
  <script>
  <%@include file="../resources/js/SystemClock.js"%>
	$(document).ready(function(){
		renderChart(${Arrays.toString(Data)});
	});
	
	var myIndex = 0;
	
	carousel();

	
	function carousel() {
	  var i;
	  var x = document.getElementsByClassName("ProductSlides");
	  for (i = 0; i < x.length; i++) {
	    x[i].style.display = "none";  
	  }
	  myIndex++;
	  if (myIndex > x.length) {myIndex = 1}    
	  x[myIndex-1].style.display = "block";  
	  setTimeout(carousel, 4000); // Change image every 4 seconds
	}
	
	var canvas = document.querySelector('canvas');
	fitToContainer(canvas);

	function fitToContainer(canvas){
	  // Make it visually fill the positioned parent
	  canvas.style.width ='100%';
	  canvas.style.height='100%';
	  // ...then set the internal size to match
	  canvas.width  = canvas.offsetWidth;
	  canvas.height = canvas.offsetHeight;
	}
	
	function openNav() {
		  document.getElementById("mySidenav").style.width = "250px";
		}

		function closeNav() {
		  document.getElementById("mySidenav").style.width = "0";
		}
  </script>
  
</body>
</html>
