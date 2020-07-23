/*!
 * JavaScript Methods (https://github.com/Aaron-Larch/Websight-Protobuild)
 * Copyright 2020-2025 GCE, Inc.
 * Created by Aaron Larch
 */

$(document).ready(function () {
	// Get a modal
	this.loadModal = function(input){
		$("#AssineParamiters").modal().on('shown.bs.modal', function (e) {loadValues(".PopUpModal", ".CreateNewRecord", input)});
		load_page('/WEB-INF/ModelLibrary.jsp #container');
	};
	
	this.getModal = function(){
		$("#CreateNewRecord").modal().on('shown.bs.modal');
		load_page('/WEB-INF/ModelLibrary.jsp #container');
	};
	
	//function to call popup window
	this.loadPopUp =function (input){
		$("#PopUpModal").modal().on('shown.bs.modal', function (e) {loadContent(input);});
		load_page('/WEB-INF/ModelLibrary.jsp #container');
	};
	
	//Switch states button
	this.SwichLoadout= function(a){
		if(a==1){
			[].forEach.call(document.querySelectorAll(".Populate"), function (i) {i.style.display="block";});
			[].forEach.call(document.querySelectorAll(".display"), function (i) {i.style.display="none";});
		}else{
			[].forEach.call(document.querySelectorAll(".Populate"), function (i) {i.style.display="none";});
			[].forEach.call(document.querySelectorAll('.display'), function (i) {i.style.display="block";});
		}
	};

	//Check all function
	this.checkAll=function(source) {
		  checkboxes = document.getElementsByName('operation');
		  for(var i=0; i<checkboxes.length; i++) {
		    checkboxes[i].checked = source.checked;
		  }
		};
	
	this.renderChart();
})	

function load_page(url){$('modal-isi-body').load(url) ;}

//Display a combination of classes based of a given variabule
function loadValues(class1, class2, flag){
	if(flag=="page1"){
		[].forEach.call(document.querySelectorAll(class1), function (i) {i.style.display="block";});
		[].forEach.call(document.querySelectorAll(class2), function (i) {i.style.display="none";});
	}else if(flag=="page2"){
		[].forEach.call(document.querySelectorAll(class2), function (i) {i.style.display="block";});
		[].forEach.call(document.querySelectorAll(class1), function (i) {i.style.display="none";});
		}
}

//Select a string from an array of strings based on user input 
function loadContent(input) {
	document.getElementById("Display").value = "";
	//convert string into an array of strings
	var JsArray = document.getElementById('DisplayValue').innerHTML;
	var block = JsArray.substring(1, JsArray.length-1);
	var string = block.split("break");
	if(input > 0){ //Search array
		var quickfix=string[input].substring(2, string[input].length);
		document.getElementById('Display').value=quickfix;
	}else{document.getElementById('Display').value=string[input];}
}


function loadChannel(cl1, cl2, cl3, cl4, flag){
	if(flag=="Step1"){
		[].forEach.call(document.querySelectorAll(cl1), function (i) {i.style.display="none";});
		[].forEach.call(document.querySelectorAll(cl2), function (i) {i.style.display="none";});
		[].forEach.call(document.querySelectorAll(cl3), function (i) {i.style.display="none";});
		[].forEach.call(document.querySelectorAll(cl4), function (i) {i.style.display="block";});
	}else if(flag=="Step2"){
		[].forEach.call(document.querySelectorAll(cl4), function (i) {i.style.display="none";});
		[].forEach.call(document.querySelectorAll(cl2), function (i) {i.style.display="none";});
		[].forEach.call(document.querySelectorAll(cl3), function (i) {i.style.display="none";});
		[].forEach.call(document.querySelectorAll(cl1), function (i) {i.style.display="block";});
	}else if(flag=="Step3"){
		[].forEach.call(document.querySelectorAll(cl4), function (i) {i.style.display="none";});
		[].forEach.call(document.querySelectorAll(cl1), function (i) {i.style.display="none";});
		[].forEach.call(document.querySelectorAll(cl2), function (i) {i.style.display="none";});
		[].forEach.call(document.querySelectorAll(cl3), function (i) {i.style.display="block";});
	}else{
		[].forEach.call(document.querySelectorAll(cl4), function (i) {i.style.display="none";});
		[].forEach.call(document.querySelectorAll(cl1), function (i) {i.style.display="none";});
		[].forEach.call(document.querySelectorAll(cl3), function (i) {i.style.display="none";});
		[].forEach.call(document.querySelectorAll(cl2), function (i) {i.style.display="block";});
	}
}

function buildReport(
		xAxsis,
		bellData,
		highData,
		lowData,
		boxData,
		barXAxis,
		HistogramData) {
	/*Chart program layouts as found on https://www.chartjs.org/samples/latest/*/
	 new Chart("BellcurveChart", {
		  type: 'line',
		  data: {
		    labels: xAxsis,
		    datasets: [{ 
		        data: bellData,
		        label: document.getElementById("divName").innerHTML,
		        borderColor: "#3e95cd",
		        fill: false
		      }]
		  },
		  options: {
		    title: {
		      display: true,
		      text: 'Bell Curve Graph'
		    }
		  }
		});
	 
	 new Chart("HighLineGraph", {
		  type: 'line',
		  data: {
		    labels: xAxsis,
		    datasets: [{ 
		        data: highData,
		        label: document.getElementById("divName").innerHTML,
		        borderColor: "#3e95cd",
		        fill: false
		      }]
		  },
		  options: {
		    title: {
		      display: true,
		      text: 'Data Graph from high to low'
		    }
		  }
		});
	 
	 new Chart("LowLineGraph", {
		  type: 'line',
		  data: {
		    labels: xAxsis,
		    datasets: [{ 
		        data: lowData,
		        label: document.getElementById("divName").innerHTML,
		        borderColor: "#3e95cd",
		        fill: false
		      }]
		  },
		  options: {
		    title: {
		      display: true,
		      text: 'Data Graph from low to high'
		    }
		  }
		});
	 
	 new Chart("HistogramChart", {
		  type: 'bar',
		  data: {
		    labels: barXAxis,
		    datasets: [{ 
		        data: HistogramData,
		        label: document.getElementById("divName").innerHTML,
		        borderColor: "#3e95cd",
		        fill: false
		      }]
		  },
		  options: {
		    title: {
		      display: true,
		      text: 'Histogram Chart'
		    }
		  }
		});
	 
	 var chart = new CanvasJS.Chart("BoxandWhisker", {
			title:{
				text: "Box And Whisker Plot"
			},
			axisY: {
				interval: 40
			},
			data: [{
				type: "boxAndWhisker",
				upperBoxColor: "#FFC28D",
				lowerBoxColor: "#9ECCB8",
				color: "black",
				dataPoints: [
					
					{ label: document.getElementById("divName").innerHTML, y: boxData }
				]
			}]
		});
		chart.render();
}
//////////////////////////////////////////////////////
function chartslide(data, ChartId){
	$(document).ready(function(){renderChart(data, ChartId);});
	var canvas = document.querySelector('canvas');
	fitToContainer(canvas);

	function renderChart(input, picture) {
		/*Chart program layouts as found on https://www.chartjs.org/samples/latest/*/
		var chart = new Chart(picture, { 
			type: 'line',
				data: {
					labels: ['1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12'],
					datasets: [{ 
						data: input,
						label: 'My first dataset',
						borderColor: "#3e95cd",
						fill: false
					}]
				},
				options: {
					title: {
						display: true,
						text: 'This site can also track Large volumes of data over time and place them into graphs using CharJS software'
					}
				}
			});
		chart.render();
	}
	
	function fitToContainer(canvas){
		// Make it visually fill the positioned parent
		canvas.style.width ='100%';
		canvas.style.height='100%';
		// ...then set the internal size to match
		canvas.width  = canvas.offsetWidth;
		canvas.height = canvas.offsetHeight;
	}
}
function AnimateSlide(){
	var Index = 0;
	carousel();

	function carousel() {
		var i;
		var x = document.getElementsByClassName("ProductSlides");
		for (i = 0; i < x.length; i++) {
			x[i].style.display = "none";  
		}
		Index++;
		if (Index > x.length) {Index = 1}    
		x[Index-1].style.display = "block";  
		setTimeout(carousel, 4000); // Change image every 4 seconds
	}
}

function openNav() {
	document.getElementById("mySidenav").style.width = "250px";
}

function closeNav() {
	document.getElementById("mySidenav").style.width = "0";
}
	
function switchStateBtn(input){
	closeNav();
	loadChannel(".services", ".slideshow", ".partners", ".AboutSite", input);
}
function plusDivs(n) {
	closebox();
	setTimeout(function(){showDivs(slideIndex += n);}, 800);
}

function currentDiv(n) {
	closebox();
	setTimeout(function(){showDivs(slideIndex = n);}, 800);
}

function showDivs(n) {
	var i;
	var x = document.getElementsByClassName("mySlides");
	var dots = document.getElementsByClassName("demo");
	if (n > x.length) {slideIndex = 1}
	if (n < 1) {slideIndex = x.length}
	for (i = 0; i < x.length; i++) {
		x[i].style.display = "none";  
	}
  
  for (i = 0; i < dots.length; i++) {
	    dots[i].className = dots[i].className.replace(" dotFill", "");
	  }
  x[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " dotFill";
  openbox(slideIndex-1);
 
  function openbox(place) {
		document.getElementById("myDropdown").style.height = "200px";
		document.getElementById("message").innerHTML = document.getElementById("StoreData"+place).innerHTML;
	}
}

function closebox() {
	document.getElementById("myDropdown").style.height = "0";
}