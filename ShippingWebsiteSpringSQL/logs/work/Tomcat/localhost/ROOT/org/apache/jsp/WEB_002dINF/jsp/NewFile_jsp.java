/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.35
 * Generated at: 2020-08-14 14:51:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class NewFile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/jsp/../resources/js/SystemClock.js", Long.valueOf(1596632272607L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js\"></script>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" <div class=\"page\">\r\n");
      out.write("    <header>\r\n");
      out.write("      <h1>LOLCAT CLOCK</h1>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <h4>\r\n");
      out.write("      I CAN HAZ TIME?? <br>\r\n");
      out.write("      <span id=\"clock\">Clock goes here</span>\r\n");
      out.write("    </h4>\r\n");
      out.write("\r\n");
      out.write("    <img id=\"lolcatImage\" src=\"https://s3.amazonaws.com/media.skillcrush.com/skillcrush/wp-content/uploads/2016/08/normalTime.jpg\" alt=\"lolcat\">\r\n");
      out.write("\r\n");
      out.write("    <blockquote id=\"timeEvent\">This is where time events are reported</blockquote>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    set Wake Up Time\r\n");
      out.write("    <select id=\"wakeUpTimeSelector\">\r\n");
      out.write("      <option value=\"1\">1 AM - 2AM</option>\r\n");
      out.write("      <option value=\"2\">2 AM - 3AM</option>\r\n");
      out.write("      <option value=\"3\">3 AM - 4AM</option>\r\n");
      out.write("      <option value=\"4\">4 AM - 5AM</option>\r\n");
      out.write("      <option value=\"5\">5 AM - 6AM</option>\r\n");
      out.write("      <option value=\"6\">6 AM - 7AM</option>\r\n");
      out.write("      <option value=\"7\">7 AM - 8AM</option>\r\n");
      out.write("      <option value=\"8\" selected>8 AM - 9AM</option>\r\n");
      out.write("      <option value=\"9\">9 AM - 10AM</option>\r\n");
      out.write("      <option value=\"10\">10 AM - 11AM</option>\r\n");
      out.write("      <option value=\"11\">11 AM - 12PM</option>\r\n");
      out.write("      <option value=\"12\">12 PM - 1PM</option>\r\n");
      out.write("      <option value=\"13\">1 PM - 2PM</option>\r\n");
      out.write("      <option value=\"14\">2 PM - 3PM</option>\r\n");
      out.write("      <option value=\"15\">3 PM - 4PM</option>\r\n");
      out.write("      <option value=\"16\">4 PM - 5PM</option>\r\n");
      out.write("      <option value=\"17\">5 PM - 6PM</option>\r\n");
      out.write("      <option value=\"18\">6 PM - 7PM</option>\r\n");
      out.write("      <option value=\"19\">7 PM - 8PM</option>\r\n");
      out.write("      <option value=\"20\">8 PM - 9PM</option>\r\n");
      out.write("      <option value=\"21\">9 PM - 10PM</option>\r\n");
      out.write("      <option value=\"22\">10 PM - 11PM</option>\r\n");
      out.write("      <option value=\"23\">11 PM - 12AM</option>\r\n");
      out.write("      <option value=\"24\">12 AM - 1AM</option>\r\n");
      out.write("    </select>\r\n");
      out.write("    <br>\r\n");
      out.write("    set Lunch Time\r\n");
      out.write("      <select id=\"lunchTimeSelector\">\r\n");
      out.write("        <option value=\"1\">1 AM - 2AM</option>\r\n");
      out.write("        <option value=\"2\">2 AM - 3AM</option>\r\n");
      out.write("        <option value=\"3\">3 AM - 4AM</option>\r\n");
      out.write("        <option value=\"4\">4 AM - 5AM</option>\r\n");
      out.write("        <option value=\"5\">5 AM - 6AM</option>\r\n");
      out.write("        <option value=\"6\">6 AM - 7AM</option>\r\n");
      out.write("        <option value=\"7\">7 AM - 8AM</option>\r\n");
      out.write("        <option value=\"8\">8 AM - 9AM</option>\r\n");
      out.write("        <option value=\"9\">9 AM - 10AM</option>\r\n");
      out.write("        <option value=\"10\">10 AM - 11AM</option>\r\n");
      out.write("        <option value=\"11\">11 AM - 12PM</option>\r\n");
      out.write("        <option value=\"12\" selected>12 PM - 1PM</option>\r\n");
      out.write("        <option value=\"13\">1 PM - 2PM</option>\r\n");
      out.write("        <option value=\"14\">2 PM - 3PM</option>\r\n");
      out.write("        <option value=\"15\">3 PM - 4PM</option>\r\n");
      out.write("        <option value=\"16\">4 PM - 5PM</option>\r\n");
      out.write("        <option value=\"17\">5 PM - 6PM</option>\r\n");
      out.write("        <option value=\"18\">6 PM - 7PM</option>\r\n");
      out.write("        <option value=\"19\">7 PM - 8PM</option>\r\n");
      out.write("        <option value=\"20\">8 PM - 9PM</option>\r\n");
      out.write("        <option value=\"21\">9 PM - 10PM</option>\r\n");
      out.write("        <option value=\"22\">10 PM - 11PM</option>\r\n");
      out.write("        <option value=\"23\">11 PM - 12AM</option>\r\n");
      out.write("        <option value=\"24\">12 AM - 1AM</option>\r\n");
      out.write("      </select>\r\n");
      out.write("    <br>\r\n");
      out.write("    set Nap Time\r\n");
      out.write("    <select id=\"napTimeSelector\">\r\n");
      out.write("      <option value=\"1\">1 AM - 2AM</option>\r\n");
      out.write("      <option value=\"2\">2 AM - 3AM</option>\r\n");
      out.write("      <option value=\"3\">3 AM - 4AM</option>\r\n");
      out.write("      <option value=\"4\">4 AM - 5AM</option>\r\n");
      out.write("      <option value=\"5\">5 AM - 6AM</option>\r\n");
      out.write("      <option value=\"6\">6 AM - 7AM</option>\r\n");
      out.write("      <option value=\"7\">7 AM - 8AM</option>\r\n");
      out.write("      <option value=\"8\">8 AM - 9AM</option>\r\n");
      out.write("      <option value=\"9\">9 AM - 10AM</option>\r\n");
      out.write("      <option value=\"10\">10 AM - 11AM</option>\r\n");
      out.write("      <option value=\"11\">11 AM - 12PM</option>\r\n");
      out.write("      <option value=\"12\">12 PM - 1PM</option>\r\n");
      out.write("      <option value=\"13\">1 PM - 2PM</option>\r\n");
      out.write("      <option value=\"14\">2 PM - 3PM</option>\r\n");
      out.write("      <option value=\"15\" selected>3 PM - 4PM</option>\r\n");
      out.write("      <option value=\"16\">4 PM - 5PM</option>\r\n");
      out.write("      <option value=\"17\">5 PM - 6PM</option>\r\n");
      out.write("      <option value=\"18\">6 PM - 7PM</option>\r\n");
      out.write("      <option value=\"19\">7 PM - 8PM</option>\r\n");
      out.write("      <option value=\"20\">8 PM - 9PM</option>\r\n");
      out.write("      <option value=\"21\">9 PM - 10PM</option>\r\n");
      out.write("      <option value=\"22\">10 PM - 11PM</option>\r\n");
      out.write("      <option value=\"23\">11 PM - 12AM</option>\r\n");
      out.write("      <option value=\"24\">12 AM - 1AM</option>\r\n");
      out.write("      </select>\r\n");
      out.write("    <br>\r\n");
      out.write("    <button id=\"partyTimeButton\">Party!</button>\r\n");
      out.write("\r\n");
      out.write("    <footer>\r\n");
      out.write("      <p>&copy; Skillcrush 2016</p>\r\n");
      out.write("    </footer>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <script> ");
      out.write("var wakeuptime = 7;\r\n");
      out.write("var noon = 12;\r\n");
      out.write("var lunchtime = 12;\r\n");
      out.write("var naptime = lunchtime + 2;\r\n");
      out.write("var partytime;\r\n");
      out.write("var evening = 18;\r\n");
      out.write("var oneSecond = 1000; // Define a second\r\n");
      out.write("\r\n");
      out.write("// Getting it to show the current time on the page\r\n");
      out.write("var showCurrentTime = function()\r\n");
      out.write("{\r\n");
      out.write("    // display the string on the webpage\r\n");
      out.write("    var clock = document.getElementById('clock');\r\n");
      out.write(" \r\n");
      out.write("    var currentTime = new Date();\r\n");
      out.write(" \r\n");
      out.write("    var hours = currentTime.getHours();\r\n");
      out.write("    var minutes = currentTime.getMinutes();\r\n");
      out.write("    var seconds = currentTime.getSeconds();\r\n");
      out.write("    var meridian = \"AM\";\r\n");
      out.write(" \r\n");
      out.write("    // Set hours\r\n");
      out.write("\t  if (hours >= noon)\r\n");
      out.write("\t  {\r\n");
      out.write("\t\t  meridian = \"PM\";\r\n");
      out.write("\t  }\r\n");
      out.write("\r\n");
      out.write("\t  if (hours > noon)\r\n");
      out.write("\t  {\r\n");
      out.write("\t\t  hours = hours - 12;\r\n");
      out.write("\t  }\r\n");
      out.write(" \r\n");
      out.write("    // Set Minutes\r\n");
      out.write("    if (minutes < 10)\r\n");
      out.write("    {\r\n");
      out.write("        minutes = \"0\" + minutes;\r\n");
      out.write("    }\r\n");
      out.write(" \r\n");
      out.write("    // Set Seconds\r\n");
      out.write("    if (seconds < 10)\r\n");
      out.write("    {\r\n");
      out.write("        seconds = \"0\" + seconds;\r\n");
      out.write("    }\r\n");
      out.write(" \r\n");
      out.write("    // put together the string that displays the time\r\n");
      out.write("    var clockTime = hours + ':' + minutes + ':' + seconds + \" \" + meridian + \"!\";\r\n");
      out.write("    clock.innerText = clockTime;\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("// Getting the clock to increment on its own and change out messages and pictures\r\n");
      out.write("var updateClock = function() \r\n");
      out.write("{\r\n");
      out.write("  var time = new Date().getHours();\r\n");
      out.write("  var messageText;\r\n");
      out.write("  var image = \"https://s3.amazonaws.com/media.skillcrush.com/skillcrush/wp-content/uploads/2016/08/normalTime.jpg\";\r\n");
      out.write("\r\n");
      out.write("  var timeEventJS = document.getElementById(\"timeEvent\");\r\n");
      out.write("  var lolcatImageJS = document.getElementById('lolcatImage');\r\n");
      out.write("  \r\n");
      out.write("  if (time == partytime)\r\n");
      out.write("  {\r\n");
      out.write("    image = \"https://s3.amazonaws.com/media.skillcrush.com/skillcrush/wp-content/uploads/2016/08/partyTime.jpg\";\r\n");
      out.write("    messageText = \"Let's party!\";\r\n");
      out.write("  }\r\n");
      out.write("  else if (time == wakeuptime)\r\n");
      out.write("  {\r\n");
      out.write("    image = \"https://s3.amazonaws.com/media.skillcrush.com/skillcrush/wp-content/uploads/2016/09/cat1.jpg\";\r\n");
      out.write("    messageText = \"Wake up!\";\r\n");
      out.write("  }\r\n");
      out.write("  else if (time == lunchtime)\r\n");
      out.write("  {\r\n");
      out.write("    image = \"https://s3.amazonaws.com/media.skillcrush.com/skillcrush/wp-content/uploads/2016/09/cat2.jpg\";\r\n");
      out.write("    messageText = \"Let's have some lunch!\";\r\n");
      out.write("  }\r\n");
      out.write("  else if (time == naptime)\r\n");
      out.write("  {\r\n");
      out.write("    image = \"https://s3.amazonaws.com/media.skillcrush.com/skillcrush/wp-content/uploads/2016/09/cat3.jpg\";\r\n");
      out.write("    messageText = \"Sleep tight!\";\r\n");
      out.write("  }\r\n");
      out.write("  else if (time < noon)\r\n");
      out.write("  {\r\n");
      out.write("    image = \"https://pbs.twimg.com/profile_images/378800000532546226/dbe5f0727b69487016ffd67a6689e75a.jpeg\";\r\n");
      out.write("    messageText = \"Good morning!\";\r\n");
      out.write("  }\r\n");
      out.write("  else if (time >= evening)\r\n");
      out.write("  {\r\n");
      out.write("    image = \"https://upload.wikimedia.org/wikipedia/commons/8/8c/Cat_sleep.jpg\";\r\n");
      out.write("    messageText = \"Good evening!\";\r\n");
      out.write("  }\r\n");
      out.write("  else\r\n");
      out.write("  {\r\n");
      out.write("    image = \"https://s3.amazonaws.com/media.skillcrush.com/skillcrush/wp-content/uploads/2016/08/normalTime.jpg\";\r\n");
      out.write("    messageText = \"Good afternoon!\";\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  console.log(messageText); \r\n");
      out.write("  timeEventJS.innerText = messageText;\r\n");
      out.write("  lolcatImage.src = image;\r\n");
      out.write("  \r\n");
      out.write("  showCurrentTime();\r\n");
      out.write("};\r\n");
      out.write("updateClock();\r\n");
      out.write("\r\n");
      out.write("// Getting the clock to increment once a second\r\n");
      out.write("setInterval( updateClock, oneSecond);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("// Getting the Party Time Button To Work\r\n");
      out.write("var partyButton = document.getElementById(\"partyTimeButton\");\r\n");
      out.write("\r\n");
      out.write("var partyEvent = function()\r\n");
      out.write("{\r\n");
      out.write("    if (partytime < 0) \r\n");
      out.write("    {\r\n");
      out.write("        partytime = new Date().getHours();\r\n");
      out.write("        partyTimeButton.innerText = \"Party Over!\";\r\n");
      out.write("        partyTimeButton.style.backgroundColor = \"#0A8DAB\";\r\n");
      out.write("    }\r\n");
      out.write("    else\r\n");
      out.write("    {\r\n");
      out.write("        partytime = -1;\r\n");
      out.write("        partyTimeButton.innerText = \"Party Time!\";\r\n");
      out.write("        partyTimeButton.style.backgroundColor = \"#222\";\r\n");
      out.write("    }\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("partyButton.addEventListener(\"click\", partyEvent);\r\n");
      out.write("partyEvent(); \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("// Activates Wake-Up selector\r\n");
      out.write("var wakeUpTimeSelector =  document.getElementById(\"wakeUpTimeSelector\");\r\n");
      out.write("\r\n");
      out.write("var wakeUpEvent = function()\r\n");
      out.write("{\r\n");
      out.write("    wakeuptime = wakeUpTimeSelector.value;\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("wakeUpTimeSelector.addEventListener(\"change\", wakeUpEvent);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("// Activates Lunch selector\r\n");
      out.write("var lunchTimeSelector =  document.getElementById(\"lunchTimeSelector\");\r\n");
      out.write("\r\n");
      out.write("var lunchEvent = function()\r\n");
      out.write("{\r\n");
      out.write("    lunchtime = lunchTimeSelector.value;\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("lunchTimeSelector.addEventListener(\"change\", lunchEvent);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("// Activates Nap-Time selector\r\n");
      out.write("var napTimeSelector =  document.getElementById(\"napTimeSelector\");\r\n");
      out.write("\r\n");
      out.write("var napEvent = function()\r\n");
      out.write("{\r\n");
      out.write("    naptime = napTimeSelector.value;\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("napTimeSelector.addEventListener(\"change\", napEvent);\r\n");
      out.write("\r\n");
      out.write("function SlidShow() {\r\n");
      out.write("\t  var i;\r\n");
      out.write("\t  var x = document.getElementsByClassName(\"mySlides\");\r\n");
      out.write("\t  for (i = 0; i < x.length; i++) {\r\n");
      out.write("\t    x[i].style.display = \"none\";  \r\n");
      out.write("\t  }\r\n");
      out.write("\t  myIndex++;\r\n");
      out.write("\t  if (myIndex > x.length) {myIndex = 1}\r\n");
      out.write("\t  if (myIndex-2 > 0){\r\n");
      out.write("\t\t  x[myIndex-2].style.display = \"block\";\r\n");
      out.write("\t\t  trasision\r\n");
      out.write("\t\t  x[myIndex-1].style.display = \"block\";\r\n");
      out.write("\t  }else{\r\n");
      out.write("\t\t  transisition\r\n");
      out.write("\t\t  x[myIndex-1].style.display = \"block\";\r\n");
      out.write("\t  }  \r\n");
      out.write("\t  setTimeout(carousel, (oneSecond*2)); // Change image every 2 seconds\r\n");
      out.write("}");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
