/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.35
 * Generated at: 2020-08-14 14:28:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.UserInterFace;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("jar:file:/C:/Users/gce/.m2/repository/org/springframework/spring-webmvc/5.0.11.RELEASE/spring-webmvc-5.0.11.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1543325904000L));
    _jspx_dependants.put("jar:file:/C:/Users/gce/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153399482000L));
    _jspx_dependants.put("jar:file:/C:/Users/gce/.m2/repository/org/springframework/spring-webmvc/5.0.11.RELEASE/spring-webmvc-5.0.11.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1543325904000L));
    _jspx_dependants.put("file:/C:/Users/gce/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar", Long.valueOf(1571152422633L));
    _jspx_dependants.put("/WEB-INF/jsp/UserInterFace/../../resources/css/common.css", Long.valueOf(1596632272607L));
    _jspx_dependants.put("file:/C:/Users/gce/.m2/repository/org/springframework/spring-webmvc/5.0.11.RELEASE/spring-webmvc-5.0.11.RELEASE.jar", Long.valueOf(1595858777948L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("\t\t<title>Log in with your account</title>\r\n");
      out.write("   \t\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\r\n");
      out.write("  \t\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("  \t\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("  \t\t<style>");
      out.write("body {\r\n");
      out.write("    padding-bottom: 40px;\r\n");
      out.write("    background-color: #eee;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("hr {\r\n");
      out.write("  border: 0;\r\n");
      out.write("  clear:both;\r\n");
      out.write("  display:block;\r\n");
      out.write("  width: 96%;               \r\n");
      out.write("  height: 1px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Style the header */\r\n");
      out.write(".headder{\r\n");
      out.write("    padding-bottom: 5px;\r\n");
      out.write("    padding-left: 20px;\r\n");
      out.write("    padding-right: 10px;\r\n");
      out.write("\tbackground-color: #CE2B1C;\t\r\n");
      out.write("\tborder-style: outset;\r\n");
      out.write("\tborder-radius: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Style the corporate logo */\r\n");
      out.write("p.c {\r\n");
      out.write("\tcolor: gold;\r\n");
      out.write("  \tfont-style: oblique;\r\n");
      out.write("  \tpadding-left: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*Standard user input format */\r\n");
      out.write(".form-signin {\r\n");
      out.write("    max-width: 330px;\r\n");
      out.write("    padding: 15px;\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-signin .form-signin-heading,\r\n");
      out.write(".form-signin .checkbox {\r\n");
      out.write("    margin-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-signin .checkbox {\r\n");
      out.write("    font-weight: normal;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-signin .form-control {\r\n");
      out.write("    position: relative;\r\n");
      out.write("    height: auto;\r\n");
      out.write("    -webkit-box-sizing: border-box;\r\n");
      out.write("    -moz-box-sizing: border-box;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-signin .form-control:focus {\r\n");
      out.write("    z-index: 2;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-signin input {\r\n");
      out.write("    margin-top: 10px;\r\n");
      out.write("    border-bottom-right-radius: 0;\r\n");
      out.write("    border-bottom-left-radius: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-signin button {\r\n");
      out.write("    margin-top: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".has-error {\r\n");
      out.write("    color: red\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*Main Page Layout format*/\r\n");
      out.write("main{\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\twidth:950px;\r\n");
      out.write("\tpadding-top: 5px;\r\n");
      out.write("\tpadding-left: 30px;\r\n");
      out.write("\tpadding-right: 20px;\r\n");
      out.write("\t\r\n");
      out.write("\tborder-right: 1px solid black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("aside{\r\n");
      out.write("\tfloat:right;\r\n");
      out.write("\twidth:350px;\r\n");
      out.write("\tpadding-bottom:20px;\r\n");
      out.write("\tpadding-left: 4px;\r\n");
      out.write("\tpadding-right: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("footer{\r\n");
      out.write("\tclear:both;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("\tfont-size:.8em;\r\n");
      out.write("\tpadding-top:50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#container, footer{\r\n");
      out.write("\twidth:90%;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("\tmargin-bottom: 60px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("aside section {\r\n");
      out.write("\tdisplay:block;\r\n");
      out.write("\tpadding: 20px;\r\n");
      out.write("\tborder-bottom: 1px solid black;\r\n");
      out.write("\tcolor:black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*Display Data Page*/\r\n");
      out.write("/* To make the buttons look like hyperlink words in a normal sentence I modified a button style from the CSS style guide:\r\n");
      out.write("\thttps://www.w3schools.com/howto/howto_css_text_buttons.asp*/\r\n");
      out.write(".astext {\r\n");
      out.write("    background:none;\r\n");
      out.write("    border:none;\r\n");
      out.write("    margin:0;\r\n");
      out.write("    padding:0;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write(".astext:hover {background: #eee;}\r\n");
      out.write("\r\n");
      out.write(".Calculate {color: dodgerblue;}\r\n");
      out.write(".Restart {color: orange;}\r\n");
      out.write("\r\n");
      out.write("fieldset { position: relative; padding: 0.35em 0.625em 0.75em; }\r\n");
      out.write(".legend2 { position: absolute; bottom: -1.4ex; left: 10px; background: white  }\r\n");
      out.write("caption, .legend2 { padding: 0 2px }\r\n");
      out.write("\r\n");
      out.write("#message{\r\n");
      out.write("\tbackground: #eee;\r\n");
      out.write("\tfont-size: 12pt;\r\n");
      out.write("}\r\n");
      out.write("#tital1{\r\n");
      out.write("\tpadding-left: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".display{\r\n");
      out.write("\tpadding-left: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".Populate{\r\n");
      out.write("\tpadding-left: 20px\r\n");
      out.write("}\r\n");
      out.write("#intro{\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tfont-size: large;\r\n");
      out.write("}\r\n");
      out.write("#arrayDisply{\r\n");
      out.write("\tpadding-left: 90px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("fieldset\r\n");
      out.write("{\r\n");
      out.write("  background-color:#CCC;\r\n");
      out.write("  max-width:700px;\r\n");
      out.write("  padding:16px;\t\r\n");
      out.write("      border:2px black;\r\n");
      out.write("    -moz-border-radius:8px;\r\n");
      out.write("    -webkit-border-radius:8px;\t\r\n");
      out.write("    border-radius:8px;\t\r\n");
      out.write("}\r\n");
      out.write(".legend1\r\n");
      out.write("{\r\n");
      out.write("  margin-bottom:0px;\r\n");
      out.write("  margin-left:16px;\r\n");
      out.write("}\r\n");
      out.write(".legend2\r\n");
      out.write("{\r\n");
      out.write("\tbackground:transparent;\r\n");
      out.write("  margin-bottom:0px;\r\n");
      out.write("  margin-left:16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*Display record Page*/\r\n");
      out.write(".printResult{\r\n");
      out.write("\tpadding-top:5px;\r\n");
      out.write("\tpadding-left: 145px;\r\n");
      out.write("\tpadding-right: 145px;\r\n");
      out.write("}\r\n");
      out.write("#UserChoice1{\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("#sizecontroll{\r\n");
      out.write("\tpadding-right: 400px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*Display Table*/\r\n");
      out.write(".SearchStatement{\r\n");
      out.write("\tpadding-left: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#MasterTable {\r\n");
      out.write("  \t\tfont-family: arial, sans-serif;\r\n");
      out.write("  \t\tborder: 2px solid black;\r\n");
      out.write("  \t\twidth: 95%;\r\n");
      out.write("  \t\tmargin-left: 2.5%; \r\n");
      out.write("    \tmargin-right: 2.5%;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("#tital2{text-align: center;}\r\n");
      out.write("#FailedResult{\r\n");
      out.write("\t\twidth: 30%;\r\n");
      out.write("  \t\tmargin-left: 35%; \r\n");
      out.write("    \tmargin-right: 35%;\r\n");
      out.write("    \ttext-align: center; \r\n");
      out.write("    \tcolor: red;\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#Searchbar{\r\n");
      out.write("\t\twidth: 30%;\r\n");
      out.write("  \t\tmargin-left: 35%; \r\n");
      out.write("    \tmargin-right: 35%; \t\r\n");
      out.write("}\r\n");
      out.write("#searcline{width: 83%;}\r\n");
      out.write("\r\n");
      out.write(".BuildTepfile{\r\n");
      out.write("\tpadding-left: 15px;\r\n");
      out.write("\tpadding-right: 280px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*Modal format*/\r\n");
      out.write(".modal-content{background: #eee;}\r\n");
      out.write(".modal-title{float: left;}\r\n");
      out.write("#SearchParamiters{float: right}\r\n");
      out.write("  textarea.window {\r\n");
      out.write("  \tbackground: #eee;\r\n");
      out.write("    display: block;\r\n");
      out.write("    border: none;\r\n");
      out.write("    margin-left: auto;\r\n");
      out.write("    margin-right: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#saveandnew{\r\n");
      out.write("\tpadding-left: 260px;\r\n");
      out.write("}\r\n");
      out.write("#spacer{\r\n");
      out.write("\tpadding-left: 120px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*Chart format Display settings*/\r\n");
      out.write("/*To center an element vertically, I adopted a solution from the CSS style guide:\r\n");
      out.write("\thttps://www.w3.org/Style/Examples/007/center.en.html*/\r\n");
      out.write(".main-display {\r\n");
      out.write("\tjustify-content: center;\r\n");
      out.write("}\r\n");
      out.write(".column {\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tmargin: 10px 10px 10px 10px;\r\n");
      out.write("\twidth: 47%;\t\r\n");
      out.write("}\r\n");
      out.write(".item {\r\n");
      out.write("\twidth: 85%;\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tmargin-left: auto;\r\n");
      out.write("\tmargin-right: auto;\r\n");
      out.write("\tmin-height: 300px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Style the Report footer */\r\n");
      out.write("footer2{\t\r\n");
      out.write("\twidth: 98%;\r\n");
      out.write("\tbackground-color: Gray;\r\n");
      out.write("\tpadding: 15px;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tborder: solid 1px black;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write(".container button{display: inline-block;}\r\n");
      out.write("#btn1{ float:left;}\r\n");
      out.write("#btn3{ float:right;}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("   <!-- A stylish Header that contains all futuer user options -->\r\n");
      out.write("  <div class=\"headder\">\r\n");
      out.write("  <h2>JBA Shipping Inc.</h2>\r\n");
      out.write("  <p class=\"c\">We Deliver the Best to Deliver You Success</p>\r\n");
      out.write("   <hr style=\"background-color:white;\"/>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("     <div class=\"container\">\r\n");
      out.write("      <form method=\"POST\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/login\" class=\"form-signin\">\r\n");
      out.write("        <h2 class=\"form-heading\">Log in</h2>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"form-group ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${error != null ? 'has-error' : ''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("            <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("            <input name=\"username\" type=\"text\" class=\"form-control\" placeholder=\"Username\" autofocus=\"true\"/>\r\n");
      out.write("            <input name=\"password\" type=\"password\" class=\"form-control\" placeholder=\"Password\"/>\r\n");
      out.write("            \r\n");
      out.write("            <div id=\"errorSpace\">\r\n");
      out.write("            <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${error}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("             <input type=\"hidden\" name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.parameterName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("            <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Log In</button>\r\n");
      out.write("            <h4 class=\"text-center\"><p>Forgot your Password? Then call 555-555-5551</p></h4>\r\n");
      out.write("            <h4 class=\"text-center\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/registration\">Create an account</a></h4>\r\n");
      out.write("        </div>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <footer>\r\n");
      out.write("\t<hr style=\"background-color:black;\" />\r\n");
      out.write("\tCopyright &copy; 2020. All rights reserved\r\n");
      out.write("</footer>\r\n");
      out.write("  </body>\r\n");
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/jsp/UserInterFace/login.jsp(7,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("contextPath");
      // /WEB-INF/jsp/UserInterFace/login.jsp(7,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/UserInterFace/login.jsp(7,0) '${pageContext.request.contextPath}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }
}
