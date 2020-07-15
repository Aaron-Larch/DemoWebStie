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
	display: flex;
	flex-direction: column;
	justify-content: center;
	transition: all 1s;
	border-radius: 2px;
	
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
	transition: right .2s ease-out;
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

.clear { clear:both; }
#CenterLine{
  display: block;
  margin-left: auto;
  margin-right: auto;
}
#SubImage{
	position: relative;
    margin-left: auto;
    margin-right: auto; 
    width: 80%;
}
</style>
</head>
<body>
    <h2>Insert into here a fancy page to sell the compony and what it dose</h2>
    <div id="mySidenav" class="sidenav">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  <a onclick="switchStateBtn('Step1')" href="javascript:void(0)">About</a>
  <a onclick="switchStateBtn('Step2')" href="javascript:void(0)">Services</a>
  <a onclick="switchStateBtn('Step3')" href="javascript:void(0)">Clients</a>
  <a href="#">Contact</a>
  <spring:url value="${contextPath}/login" var="StartURL" />
  <a id="LoadFile" href="${StartURL }" >Login</a>.
</div>
	
	<span style="font-size:30px; cursor:pointer;" onclick="openNav()">&#9776; Welcome to the JBA Food Shipping & Tracking</span>
	
	<div id="Placeholder" class="slideshow">${test}
		<div id="slider" class="Site_Features_List">
			<c:forEach var="img" items="${imageUrlList}">  
				<div id="silde" class="ProductSlides">
					<img id="pic" src="${contextPath}/ImageAssets/${img}" alt="MissingImg" width="800" height="400"/>
					<p class="SlideText"><span>${fn:substringBefore(img, ".")}</span></p>
				</div>
			</c:forEach>
			<canvas class="ProductSlides" id="chartContainer"></canvas>
		</div>
	</div>
	
	<div Class="AboutSite">
		<img id="CenterLine" src="${contextPath}/FixedAssets/ComponyLogo.png" alt="Logo" width="300" height="200"/>
		<br><br>
		<img id="CenterLine" src="${contextPath}/FixedAssets/AaronLarch.jpg" alt="Founder" width="800" height="900"/>
		<p style="text-align:center;">This is our Co-founder and CEO. Aaron Larch Is a GCE Trainee built this website from scratch and designed
		 All of the features, testing, and Page displays<br>
		He then added an exsternal email server, added an exsternal SQL database, made a data tracker and analyser, 
		and with the help from his co founder Built a Reports page.<br>
		Click Here to see what the sight has to offer:</p>
		<br>
		insert button here.
		<br><br>
		<div id="SubImage">
			<img id="Cofounder" src="${contextPath}/FixedAssets/BrianRodewald1.jpg" 
				style="float: left; margin-right: 15px;" alt="Co-Founder" width="350" height="450"/>
			<h2><br><br>
			This is our Sites co-founder</h2>
			<p style="text-align:center;"> Co-founder Brian built 2 web pages for this sight. He 
			Desinged part of the logic behind the Graphing software as well as cleaned up chart data generating subrutines.
			He also created the basic layouts for the table display page where the reports are displayed</p>
		</div>
		<div class="clear"></div><br><br><br>
		<div id="SubImage">
			<img id="Add" src="${contextPath}/FixedAssets/ShopingInterface.PNG" 
				style="float: right; margin-left: 15px;" alt="SamplePage" width="650" height="325"/>
			<p style="text-align:Center;"><br>
			This project started in march 2019 and went through several 
			interations and redesigns as features were added and the sight exspanded to include more content and features. Throghout the
			evolution of this project many chalenges were overcome giving way to new code techniques and improving user security and interface.
			With each challenge the code improved in quility not just for the curent product but for futuer changes as well<br>
			Added Features include: <br>
			implamenting password tokens<br>
			conversion from JerseyAP to spring boot<br>
			outomated Creation of a Large number data generator<br>
			a .Zip conversion/compression system<br>
			Blob Data storage of java objects<br>
		</div>
		<div class="clear"></div><br><br>
		<p  style="text-align:Center;">To contact us for an interview please call us at 111-222-3333 or go to a place that dose not exist</p>
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
	chartslide(${Arrays.toString(Data)});
	AnimateSlide();
	
	function openNav() {
		document.getElementById("mySidenav").style.width = "250px";
	}

	function closeNav() {
		document.getElementById("mySidenav").style.width = "0";
	}
		
	function switchStateBtn(input){
		closeNav()
		if(input=="Step1"){
			[].forEach.call(document.querySelectorAll(".page"), function (i) {i.style.display="none";});
			[].forEach.call(document.querySelectorAll(".slideshow"), function (i) {i.style.display="none";});
			[].forEach.call(document.querySelectorAll(".AboutSite"), function (i) {i.style.display="block";});
		}else if(input=="Step2"){
			[].forEach.call(document.querySelectorAll(".page"), function (i) {i.style.display="none";});
			[].forEach.call(document.querySelectorAll(".AboutSite"), function (i) {i.style.display="none";});
			[].forEach.call(document.querySelectorAll(".slideshow"), function (i) {i.style.display="block";});
		}else if(input=="Step3"){
			[].forEach.call(document.querySelectorAll(".slideshow"), function (i) {i.style.display="none";});
			[].forEach.call(document.querySelectorAll(".AboutSite"), function (i) {i.style.display="none";});
			[].forEach.call(document.querySelectorAll(".page"), function (i) {i.style.display="block";});
		}
	}
  </script>
  
</body>
</html>
