/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-07-27 04:27:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Mainpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("     <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("  <style>\r\n");
      out.write("    .well{\r\n");
      out.write("        text-align:center;\r\n");
      out.write("        font-size: 20px;\r\n");
      out.write("        color:White;\r\n");
      out.write("        background-color: #42f4f4;\r\n");
      out.write("         margin-bottom: 5px;\r\n");
      out.write("         background-image: url(https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ3-5m0NXIKVxLg0cLEPN2na0VxkRqyDXG02WMOvPQB6Jv-Urtp);\r\n");
      out.write("          background-position: 0% 25%;\r\n");
      out.write("        background-size:cover;\r\n");
      out.write("        background-repeat: no-repeat;\r\n");
      out.write("    }\r\n");
      out.write("   \r\n");
      out.write("    .jumbotron{\r\n");
      out.write("      \r\n");
      out.write("        background-color: #42f4f4;\r\n");
      out.write("        margin-bottom: 0px;\r\n");
      out.write("        background-image: url(https://d2gg9evh47fn9z.cloudfront.net/800px_COLOURBOX6129591.jpg);\r\n");
      out.write("        background-position: 50% 50%;\r\n");
      out.write("        background-size:cover;\r\n");
      out.write("        background-repeat: no-repeat;\r\n");
      out.write("        height: 600px;\r\n");
      out.write("        width:1350px;\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("    .red{\r\n");
      out.write("        color:#ff1000;\r\n");
      out.write("    }\r\n");
      out.write("    .green{\r\n");
      out.write("        color:green;\r\n");
      out.write("    }\r\n");
      out.write("    label{\r\n");
      out.write("        display:inline-block;\r\n");
      out.write("        width:80%;\r\n");
      out.write("        text-align: left;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("  </style>\r\n");
      out.write("    <body>\r\n");
      out.write("       <div class=\"jumbotron text-center\">\r\n");
      out.write("  <h1><b>KGISL EVENTS</b></h1>\r\n");
      out.write(" <address>KG Information Systems Private Limited<br>\r\n");
      out.write("</address><div>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("     <div class=\"row\">\r\n");
      out.write("    <div class=\"col-sm-10\">\r\n");
      out.write("        </div>\r\n");
      out.write("         <div class=\"col-sm-1\">\r\n");
      out.write(" <form action=\"Alreadylogin.jsp\">\r\n");
      out.write("<button type=\"submit\" class=\"btn btn-primary\" name=\"signin\">signin</button>\r\n");
      out.write(" </form>\r\n");
      out.write("         </div>\r\n");
      out.write("  <div class=\"col-sm-1\">\r\n");
      out.write("   <form action=\"login.jsp\">\r\n");
      out.write("<button type=\"submit\" class=\"btn btn-primary\" name=\"signup\">signup</button>\r\n");
      out.write("   </form>\r\n");
      out.write("   <br><br><Br><br><br><br><br><Br><br><br><br><Br><br><br>\r\n");
      out.write("   <form action=\"index7.jsp\" method=\"post\">\r\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary\" name=\"Adminpanel\" >Adminpanel</button>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("                                                               \r\n");
      out.write("    \r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}