/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-07-27 04:29:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index7_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\r\n");
      out.write("    <STYLE>\r\n");
      out.write("         form {\r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=select], input[type=password],input[type=text] {\r\n");
      out.write("    width: 20%;\r\n");
      out.write("    padding: 12px 20px;\r\n");
      out.write("    margin: 8px 0;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    border: 1px solid #ccc;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button {\r\n");
      out.write("    background-color: #4CAF50;\r\n");
      out.write("    color: white;\r\n");
      out.write("    padding: 14px 20px;\r\n");
      out.write("    margin: 8px 0;\r\n");
      out.write("    border: none;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    width: 10%;\r\n");
      out.write("    align:center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button:hover {\r\n");
      out.write("    opacity: 0.8;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".cancelbtn {\r\n");
      out.write("    width: auto;\r\n");
      out.write("    padding: 10px 18px;\r\n");
      out.write("    background-color: #f44336;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".imgcontainer {\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    margin: 12px 0 12px 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("img.avatar {\r\n");
      out.write("    width: 30%;\r\n");
      out.write("    border-radius:20%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container {\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("span.psw {\r\n");
      out.write("    float: right;\r\n");
      out.write("    padding-top: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("@media screen and (max-width: 300px) {\r\n");
      out.write("    span.psw {\r\n");
      out.write("       display: block;\r\n");
      out.write("       float: none;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write(".jumbotron{\r\n");
      out.write("      \r\n");
      out.write("       \r\n");
      out.write("        margin-bottom: 0px;\r\n");
      out.write("        \r\n");
      out.write("        background-position: 50% 50%;\r\n");
      out.write("        background-size:cover;\r\n");
      out.write("        background-repeat: no-repeat;\r\n");
      out.write("        height: 600px;\r\n");
      out.write("        width:1350px;\r\n");
      out.write("        background-image: url(\"data:image/jpeg;base64,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\");\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("    <body class=\"jumbotron\">\r\n");
      out.write("<center><b><h1></h1></b></center>\r\n");
      out.write("<center>\r\n");
      out.write("<form action=\"servlet1\" method=\"post\">\r\n");
      out.write("    \r\n");
      out.write("   <div class=\"container\">\r\n");
      out.write("       <center>\r\n");
      out.write("\r\n");
      out.write("  <label> Select Type:</label>\r\n");
      out.write("   <select name=\"admin\" id=\"admin\">\r\n");
      out.write("      \r\n");
      out.write("       <option  value=\"view\">View authendication</option>\r\n");
      out.write("        <option  name=\"edit\" value=\"edit\">Edit authendication</option>\r\n");
      out.write("       </select><br/>\r\n");
      out.write("  \r\n");
      out.write(" <label>Name:</label><input type=\"text\" name=\"name\"/><br/>  \r\n");
      out.write("<label>Password:</label><input type=\"password\" name=\"password\"/><br/>  \r\n");
      out.write("  \r\n");
      out.write("<input type=\"submit\" value=\"login\">  \r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("</center>\r\n");
      out.write("    </body>\r\n");
      out.write("  \r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
