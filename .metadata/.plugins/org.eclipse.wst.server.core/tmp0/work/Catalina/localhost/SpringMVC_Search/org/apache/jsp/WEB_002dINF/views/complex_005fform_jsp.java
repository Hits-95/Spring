/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.44
 * Generated at: 2021-04-10 17:53:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class complex_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/link.jsp", Long.valueOf(1618036100764L));
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
      out.write("    ");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <!-- Required meta tags -->\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("    <!-- Optional JavaScript; choose one of the two! -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Option 1: Bootstrap Bundle with Popper -->\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Option 2: Separate Popper and Bootstrap JS -->\r\n");
      out.write("    <!--\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js\" integrity=\"sha384-SR1sx49pcuLnqZUnnPwx6FCym0wLsk5JZuNx2bPPENzswTNFaQU1RDvt3wT4gWFG\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.min.js\" integrity=\"sha384-j0CNLUeiqtyaRmlzUHCPZ+Gy5fQu0dQ6eZ/xAww941Ai1SxSY+0EQqNXNE6DZiVc\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    -->\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Complex-Form</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"bg-secondary bg-gradient \">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"card mx-auto mt-5 border border-info border border-4\" style=\"width: 40%;\">\r\n");
      out.write("      <div class=\"card-body bg-light\">\r\n");
      out.write("        <h4 class=\"card-title text-center text-primary \"><strong>Complex Form</strong></h4>\r\n");
      out.write("        <hr>\r\n");
      out.write("\r\n");
      out.write("        <form action=\"handleform\" method=\"post\">\r\n");
      out.write("          <div class=\"mb-3\">\r\n");
      out.write("            <label for=\"name\" class=\"form-label text-dark\"> <strong>Your Name</strong> </label>\r\n");
      out.write("            <input type=\"text\" name=\"name\" class=\"form-control\" placeholder=\"Enter your name\">\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"mb-3\">\r\n");
      out.write("            <label for=\"name\" class=\"form-label \"> <strong>Your Id</strong></label>\r\n");
      out.write("            <input type=\"text\" name=\"id\" class=\"form-control\" placeholder=\"Enter your Id\">\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"mb-3\">\r\n");
      out.write("            <label for=\"name\" class=\"form-label \"><strong>Date-of-Birth</strong></label>\r\n");
      out.write("            <input type=\"date\" name=\"bdate\" class=\"form-control\" placeholder=\"dd/mm/yyyy\">\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"mb-3\">\r\n");
      out.write("            <label for=\"name\" class=\"form-label\"><strong>Course</strong> </label>\r\n");
      out.write("           \r\n");
      out.write("            <select class=\"form-select\" name=\"course\" multiple aria-label=\"multiple select example\">\r\n");
      out.write("                  <option>Java</option>\r\n");
      out.write("              <option>Python</option>\r\n");
      out.write("              <option>Nodejs</option>\r\n");
      out.write("              <option>C++</option>\r\n");
      out.write("              <option>Php</option>\r\n");
      out.write("              <option>JavaScript</option>\r\n");
      out.write("              <option>C</option>\r\n");
      out.write("            </select>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"mb-3\">\r\n");
      out.write("            <label for=\"name\" class=\"form-label\"><strong>Select Gender : </strong> </label>\r\n");
      out.write("            <div class=\"form-check form-check-inline\">\r\n");
      out.write("              <input class=\"form-check-input\" type=\"radio\" name=\"gender\" id=\"inlineRadio1\" value=\"male\">\r\n");
      out.write("              <label class=\"form-check-label\" for=\"inlineRadio1\">Male</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-check form-check-inline\">\r\n");
      out.write("              <input class=\"form-check-input\" type=\"radio\" name=\"gender\" id=\"inlineRadio2\" value=\"female\">\r\n");
      out.write("              <label class=\"form-check-label\" for=\"inlineRadio2\">Female</label>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"mb-3\">\r\n");
      out.write("            <label class=\"form-check-label \" for=\"inlineRadio2\"><strong>Select Type</strong></label>\r\n");
      out.write("            <select class=\"form-select\" name=\"type\">\r\n");
      out.write("              <option>Old Student</option>\r\n");
      out.write("              <option>Normal Student</option>\r\n");
      out.write("            </select>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"container text-center py-2\">\r\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\r\n");
      out.write("          </div>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
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
