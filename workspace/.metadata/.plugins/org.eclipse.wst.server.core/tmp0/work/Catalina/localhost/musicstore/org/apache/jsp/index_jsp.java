/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.35
 * Generated at: 2016-06-08 07:28:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title> </title>\r\n");
      out.write("<meta name=\"description\" content=\" \" >\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/css/bootstrap.min.css\" >\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/css/style.css\" >\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<script src=\"js/js/jquery-1.12.4.min.js\"></script>\r\n");
      out.write("<script src=\"js/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"js/js/script.js\"></script>\r\n");
      out.write("<div class=\"container\" id=\"main\">\r\n");
      out.write("\r\n");
      out.write("\t<div class= \"navbar navbar-fixed-top\" id= \"mynavbar\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"#\"> <img src=\" hi.jpg \" alt=\"LOGO\"> </a>\r\n");
      out.write("\t\t <!--   <div class=\"nav-collapse collapse navbar-responsive-collapse \"> -->  \r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav pull-left\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t<a href=\"#\">Home</a>\t\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t<a href=\"#\">Contact Us</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav pull-right\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\"> Login </a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\"> Sign Up </a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t<!-- \t</div> -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"carousel slide\" id=\"mycarousel\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<ol class=\"carousel-indicators\">\r\n");
      out.write("\t\t\t<li class=\"active\" data-slide-to=\"0\" data-target=\"mycarousel\"></li>\r\n");
      out.write("\t\t\t<li data-slide-to=\"1\" data-target=\"mycarousel\"></li>\r\n");
      out.write("\t\t\t<li data-slide-to=\"2\" data-target=\"mycarousel\"></li>\r\n");
      out.write("\t\t</ol>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"carousel-inner\" >\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div class=\"item active\" id=\"slide1\">\r\n");
      out.write("\t\t\t\t<div class=\"carousel-caption\">\r\n");
      out.write("\t\t\t\t<h4>Welcome To Music World</h4>\r\n");
      out.write("\t\t\t\t<p> Know Everything about music and find @ anything </p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div class=\"item\" id=\"slide2\">\r\n");
      out.write("\t\t\t\t\t<div class=\"carousel-caption\">\r\n");
      out.write("\t\t\t\t\t<h4>Music World</h4>\r\n");
      out.write("\t\t\t\t\t<p> Know Everything about music and find @ anything </p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div class=\"item\" id=\"slide3\">\r\n");
      out.write("\t\t\t\t<div class=\"carousel-caption\">\r\n");
      out.write("\t\t\t\t<h4>Music Ki Duniya mein Aapka Swaagat hai</h4>\r\n");
      out.write("\t\t\t\t<p> Know Everything about music and find @ anything </p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<a class=\"left carousel-control\" data-slide=\"prev\" href=\"#mycarousel\"><span class=\"icon-prev\"></span></a>\r\n");
      out.write("\t\t<a class=\"right carousel-control\" data-slide=\"next\" href=\"#mycarousel\"><span class=\"icon-next\"></span></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"row\" id=\"myrow1\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"col-sm-4 feature\">\r\n");
      out.write("\t\t\t<div class=\" panel\" id=\"panel1\">\r\n");
      out.write("\t\t\t\t<div class=\"panel-heading\" >\r\n");
      out.write("\t\t\t\t\t<h3 class=\"panel-title\"> Hi Download Songs Here</h3>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<p>This is the place you can download music from</p>\r\n");
      out.write("\t\t\t\t<a href= \"#\" target=\"blank\" class=\"btn btn-warning btn-block\"> Download Music </a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"col-sm-4 feature\" >\r\n");
      out.write("\t\t\t<div class=\" panel\" id= \"panel2\">\r\n");
      out.write("\t\t\t\t<div class=\"panel-heading\" >\r\n");
      out.write("\t\t\t\t\t<h3 class=\"panel-title\"> Listen to Songs here</h3>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<p>This is the place you can listen to your music from</p>\r\n");
      out.write("\t\t\t\t<a href= \"#\" target=\"blank\" class=\"btn btn-warning btn-block\"> Listen To Music </a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"col-sm-4 feature\">\r\n");
      out.write("\t\t\t<div class=\" panel\" id=\"panel3\">\r\n");
      out.write("\t\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t<h3 class=\"panel-title\"> Watch Movies Here</h3>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<p>This is the place you can Watch Movies From</p>\r\n");
      out.write("\t\t\t\t<a href= \"#\" target=\"blank\" class=\"btn btn-warning btn-block\"> Watch Movies </a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<footer id= \"footer\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\" id=\"myrow2\">\r\n");
      out.write("\t\t\t<div class=\"col-sm-4 feature\">\r\n");
      out.write("\t\t\t\t<p> &copy; All Rights Reserved </p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-sm-6 feature\">\r\n");
      out.write("\t\t\t\t<p></p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-sm-2 feature\">\r\n");
      out.write("\t\t\t\t<a href=\"#\"> Privacy Terms </a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\t\t\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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