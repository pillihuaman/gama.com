/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.14
 * Generated at: 2019-01-15 11:30:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.tiles.template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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

      out.write("\n");
      out.write("<div class=\"header\" id=\"home\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t    <li> <a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\"><i class=\"fa fa-unlock-alt\" aria-hidden=\"true\"></i> Sign In </a></li>\n");
      out.write("\t\t\t<li> <a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal2\"><i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i> Sign Up </a></li>\n");
      out.write("\t\t\t<li><i class=\"fa fa-phone\" aria-hidden=\"true\"></i> Call : 01234567898</li>\n");
      out.write("\t\t\t<li><i class=\"fa fa-envelope-o\" aria-hidden=\"true\"></i> <a href=\"mailto:info@example.com\">info@example.com</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"header-bot\">\n");
      out.write("\t<div class=\"header-bot_inner_wthreeinfo_header_mid\">\n");
      out.write("\t\t<div class=\"col-md-4 header-middle\">\n");
      out.write("\t\t\t<form action=\"#\" method=\"post\">\n");
      out.write("\t\t\t\t\t<input type=\"search\" name=\"search\" placeholder=\"Search here...\" required=\"\">\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\" \">\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"col-md-4 logo_agile\">\n");
      out.write("\t\t\t\t<h1><a href=\"index.html\"><span>G</span>gamachicas.com <i class=\"fa fa-shopping-bag top_logo_agile_bag\" aria-hidden=\"true\"></i></a></h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"col-md-4 agileits-social top_content\">\n");
      out.write("\t\t\t\t\t\t<ul class=\"social-nav model-3d-0 footer-social w3_agile_social\">\n");
      out.write("\t\t\t\t\t\t                                   <li class=\"share\"> Share On: </li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"facebook\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <div class=\"front\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <div class=\"back\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></div></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"twitter\"> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <div class=\"front\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <div class=\"back\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></div></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"instagram\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <div class=\"front\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <div class=\"back\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></div></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"pinterest\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <div class=\"front\"><i class=\"fa fa-linkedin\" aria-hidden=\"true\"></i></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <div class=\"back\"><i class=\"fa fa-linkedin\" aria-hidden=\"true\"></i></div></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"ban-top\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"top_nav_left\">\n");
      out.write("\t\t\t<nav class=\"navbar navbar-default\">\n");
      out.write("\t\t\t  <div class=\"container-fluid\">\n");
      out.write("\t\t\t\t<!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("\t\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t  <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t  </button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse menu--shylock\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t  <ul class=\"nav navbar-nav menu__list\">\n");
      out.write("\t\t\t\t\t<li class=\"active menu__item menu__item--current\"><a class=\"menu__link\" href=\"index.html\">Home <span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("\t\t\t\t\t<li class=\" menu__item\"><a class=\"menu__link\" href=\"about.html\">About</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"dropdown menu__item\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle menu__link\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Men's wear <span class=\"caret\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu multi-column columns-3\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"agile_inner_drop_nav_info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-6 multi-gd-img1 multi-gd-text \">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"mens.html\"><img src=\"/resources/images/top2.jpg\" alt=\" \"/></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-3 multi-gd-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"mens.html\">Clothing</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"mens.html\">Wallets</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"mens.html\">Footwear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"mens.html\">Watches</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"mens.html\">Accessories</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"mens.html\">Bags</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"mens.html\">Caps & Hats</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-3 multi-gd-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"mens.html\">Jewellery</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"mens.html\">Sunglasses</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"mens.html\">Perfumes</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"mens.html\">Beauty</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"mens.html\">Shirts</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"mens.html\">Sunglasses</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"mens.html\">Swimwear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"dropdown menu__item\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle menu__link\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Women's wear <span class=\"caret\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu multi-column columns-3\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"agile_inner_drop_nav_info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-3 multi-gd-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"womens.html\">Clothing</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"womens.html\">Wallets</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"womens.html\">Footwear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"womens.html\">Watches</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"womens.html\">Accessories</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"womens.html\">Bags</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"womens.html\">Caps & Hats</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-3 multi-gd-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"womens.html\">Jewellery</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"womens.html\">Sunglasses</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"womens.html\">Perfumes</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"womens.html\">Beauty</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"womens.html\">Shirts</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"womens.html\">Sunglasses</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"womens.html\">Swimwear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-6 multi-gd-img multi-gd-text \">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"womens.html\"><img src=\"/resources/images/top1.jpg\" alt=\" \"/></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"menu__item dropdown\">\n");
      out.write("\t\t\t\t\t   <a class=\"menu__link\" href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Short Codes <b class=\"caret\"></b></a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu agile_short_dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"icons.html\">Web Icons</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"typography.html\">Typography</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\" menu__item\"><a class=\"menu__link\" href=\"contact.html\">Contact</a></li>\n");
      out.write("\t\t\t\t  </ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t</nav>\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"top_nav_right\">\n");
      out.write("\t\t\t<div class=\"wthreecartaits wthreecartaits2 cart cart box_1\"> \n");
      out.write("\t\t\t\t\t\t<form action=\"#\" method=\"post\" class=\"last\"> \n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"cmd\" value=\"_cart\">\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"display\" value=\"1\">\n");
      out.write("\t\t\t\t\t\t<button class=\"w3view-cart\" type=\"submit\" name=\"submit\" value=\"\"><i class=\"fa fa-cart-arrow-down\" aria-hidden=\"true\"></i></button>\n");
      out.write("\t\t\t\t\t</form>  \n");
      out.write("  \n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- //banner-top -->\n");
      out.write("<!-- Modal1 -->\n");
      out.write("\t\t<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\">\n");
      out.write("\t\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t\t\t<!-- Modal content-->\n");
      out.write("\t\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-body modal-body-sub_agile\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-8 modal_body_left modal_body_left1\">\n");
      out.write("\t\t\t\t\t\t<h3 class=\"agileinfo_sign\">Sign In <span>Now</span></h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t<form action=\"#\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"styled-input agile-styled-input-top\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"Name\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>Name</label>\n");
      out.write("\t\t\t\t\t\t\t\t<span></span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"styled-input\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"email\" name=\"Email\" required=\"\"> \n");
      out.write("\t\t\t\t\t\t\t\t<label>Email</label>\n");
      out.write("\t\t\t\t\t\t\t\t<span></span>\n");
      out.write("\t\t\t\t\t\t\t</div> \n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"Sign In\">\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t  <ul class=\"social-nav model-3d-0 footer-social w3_agile_social top_agile_third\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"facebook\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <div class=\"front\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <div class=\"back\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></div></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"twitter\"> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <div class=\"front\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <div class=\"back\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></div></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"instagram\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <div class=\"front\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <div class=\"back\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></div></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"pinterest\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <div class=\"front\"><i class=\"fa fa-linkedin\" aria-hidden=\"true\"></i></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <div class=\"back\"><i class=\"fa fa-linkedin\" aria-hidden=\"true\"></i></div></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p><a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal2\" > Don't have an account?</a></p>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4 modal_body_right modal_body_right1\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"/resources/images/log_pic.jpg\" alt=\" \"/>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- //Modal content-->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("<!-- //Modal1 -->\n");
      out.write("<!-- Modal2 -->\n");
      out.write("\t\t<div class=\"modal fade\" id=\"myModal2\" tabindex=\"-1\" role=\"dialog\">\n");
      out.write("\t\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t\t\t<!-- Modal content-->\n");
      out.write("\t\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-body modal-body-sub_agile\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-8 modal_body_left modal_body_left1\">\n");
      out.write("\t\t\t\t\t\t<h3 class=\"agileinfo_sign\">Sign Up <span>Now</span></h3>\n");
      out.write("\t\t\t\t\t\t <form action=\"#\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"styled-input agile-styled-input-top\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"Name\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>Name</label>\n");
      out.write("\t\t\t\t\t\t\t\t<span></span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"styled-input\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"email\" name=\"Email\" required=\"\"> \n");
      out.write("\t\t\t\t\t\t\t\t<label>Email</label>\n");
      out.write("\t\t\t\t\t\t\t\t<span></span>\n");
      out.write("\t\t\t\t\t\t\t</div> \n");
      out.write("\t\t\t\t\t\t\t<div class=\"styled-input\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" name=\"password\" required=\"\"> \n");
      out.write("\t\t\t\t\t\t\t\t<label>Password</label>\n");
      out.write("\t\t\t\t\t\t\t\t<span></span>\n");
      out.write("\t\t\t\t\t\t\t</div> \n");
      out.write("\t\t\t\t\t\t\t<div class=\"styled-input\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" name=\"Confirm Password\" required=\"\"> \n");
      out.write("\t\t\t\t\t\t\t\t<label>Confirm Password</label>\n");
      out.write("\t\t\t\t\t\t\t\t<span></span>\n");
      out.write("\t\t\t\t\t\t\t</div> \n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"Sign Up\">\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t  <ul class=\"social-nav model-3d-0 footer-social w3_agile_social top_agile_third\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"facebook\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <div class=\"front\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <div class=\"back\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></div></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"twitter\"> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <div class=\"front\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <div class=\"back\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></div></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"instagram\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <div class=\"front\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <div class=\"back\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></div></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"pinterest\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <div class=\"front\"><i class=\"fa fa-linkedin\" aria-hidden=\"true\"></i></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <div class=\"back\"><i class=\"fa fa-linkedin\" aria-hidden=\"true\"></i></div></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p><a href=\"#\">By clicking register, I agree to your terms</a></p>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4 modal_body_right modal_body_right1\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"/resources/images/log_pic.jpg\" alt=\" \"/>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- //Modal content-->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("<!-- //Modal2 -->\n");
      out.write("\n");
      out.write("<!-- banner -->\n");
      out.write("\t<div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("\t\t<!-- Indicators -->\n");
      out.write("\t\t<ol class=\"carousel-indicators\">\n");
      out.write("\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"1\" class=\"\"></li>\n");
      out.write("\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"2\" class=\"\"></li>\n");
      out.write("\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"3\" class=\"\"></li>\n");
      out.write("\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"4\" class=\"\"></li> \n");
      out.write("\t\t</ol>\n");
      out.write("\t\t<div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("\t\t\t<div class=\"item active\"> \n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"carousel-caption\">\n");
      out.write("\t\t\t\t\t\t<h3>The Biggest <span>Sale</span></h3>\n");
      out.write("\t\t\t\t\t\t<p>Special for today</p>\n");
      out.write("\t\t\t\t\t\t<a class=\"hvr-outline-out button2\" href=\"mens.html\">Shop Now </a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"item item2\"> \n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"carousel-caption\">\n");
      out.write("\t\t\t\t\t\t<h3>Summer <span>Collection</span></h3>\n");
      out.write("\t\t\t\t\t\t<p>New Arrivals On Sale</p>\n");
      out.write("\t\t\t\t\t\t<a class=\"hvr-outline-out button2\" href=\"mens.html\">Shop Now </a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"item item3\"> \n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"carousel-caption\">\n");
      out.write("\t\t\t\t\t\t<h3>The Biggest <span>Sale</span></h3>\n");
      out.write("\t\t\t\t\t\t<p>Special for today</p>\n");
      out.write("\t\t\t\t\t\t<a class=\"hvr-outline-out button2\" href=\"mens.html\">Shop Now </a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"item item4\"> \n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"carousel-caption\">\n");
      out.write("\t\t\t\t\t\t<h3>Summer <span>Collection</span></h3>\n");
      out.write("\t\t\t\t\t\t<p>New Arrivals On Sale</p>\n");
      out.write("\t\t\t\t\t\t<a class=\"hvr-outline-out button2\" href=\"mens.html\">Shop Now </a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"item item5\"> \n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"carousel-caption\">\n");
      out.write("\t\t\t\t\t\t<h3>The Biggest <span>Sale</span></h3>\n");
      out.write("\t\t\t\t\t\t<p>Special for today</p>\n");
      out.write("\t\t\t\t\t\t<a class=\"hvr-outline-out button2\" href=\"mens.html\">Shop Now </a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div> \n");
      out.write("\t\t</div>\n");
      out.write("\t\t<a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("\t\t\t<span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("\t\t\t<span class=\"sr-only\">Previous</span>\n");
      out.write("\t\t</a>\n");
      out.write("\t\t<a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("\t\t\t<span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("\t\t\t<span class=\"sr-only\">Next</span>\n");
      out.write("\t\t</a>\n");
      out.write("\t\t<!-- The Modal -->\n");
      out.write("    </div> ");
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