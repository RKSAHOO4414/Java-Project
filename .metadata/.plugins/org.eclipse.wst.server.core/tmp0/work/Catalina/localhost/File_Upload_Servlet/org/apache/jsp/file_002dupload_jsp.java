/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2021-11-16 03:14:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class file_002dupload_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>File Upload Servlet JSP JDBC MySQL Example</title>\n");
      out.write("<link\n");
      out.write("\thref=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\n");
      out.write("\trel=\"stylesheet\"\n");
      out.write("\tintegrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\"\n");
      out.write("\tcrossorigin=\"anonymous\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<div class=\"container col-lg-6\">\n");
      out.write("\t\t<h1 class=\"text-center\">File Upload to Database Example - Servlet JSP JDBC MySQL </h1>\n");
      out.write("\t\t<div class=\"card\">\n");
      out.write("\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t<form method=\"post\" class=\"form-group\" action=\"uploadServlet\"\n");
      out.write("\t\t\t\t\tenctype=\"multipart/form-data\">\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label for=\"first name\">First Name: </label> <input type=\"text\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" name=\"firstName\" size=\"50\" />\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label for=\"last name\">Last Name: </label> <input type=\"text\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" name=\"lastName\" size=\"50\" />\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label for=\"Profile Photo\">Profile Photo:</label> <input\n");
      out.write("\t\t\t\t\t\t\ttype=\"file\" name=\"photo\" size=\"50\" />\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"Save\" class=\"btn btn-success\">\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
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
