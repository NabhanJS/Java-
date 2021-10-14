package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import studentmanagement2.util.DBConnection;
import java.sql.*;

public final class studentHome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
 
    
    





      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<img src=\"logo.png\"  align=\"left\"width=\"150\" height=\"150\">\r\n");
      out.write("<center><img src=\"dgi.png\" width=\"150\" height=\"150\">\r\n");
      out.write("<img src=\"apj sir.png\" align=\"right\"  width=\"150\" height=\"150\"></center>\r\n");
      out.write("    <a href=\"dgiOneView.html\">Back</a>\r\n");
      out.write("  <hr class=\"new1\">\r\n");
      out.write("<style>\r\n");
      out.write("table{\r\n");
      out.write("  width:100%;\r\n");
      out.write("  table-layout: fixed;\r\n");
      out.write("}\r\n");
      out.write("th{\r\n");
      out.write("  padding: 20px 15px;\r\n");
      out.write("  text-align: left;\r\n");
      out.write("  font-weight: 500;\r\n");
      out.write("  font-size: 12px;\r\n");
      out.write("  color: #fff;\r\n");
      out.write("  text-transform: uppercase;\r\n");
      out.write(" border: 2px solid rgba(255,255,255,0.3);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* demo styles */\r\n");
      out.write("\r\n");
      out.write("@import url(https://fonts.googleapis.com/css?family=Roboto:400,500,300,700);\r\n");
      out.write("body{\r\n");
      out.write("  background: -webkit-linear-gradient(left, #25c481, #25b7c4);\r\n");
      out.write("  background: linear-gradient(to right, #25c481, #25b7c4);\r\n");
      out.write("  font-family: 'Roboto', sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("  <!--for demo wrap-->\r\n");
      out.write("  <div class=\"tbl-header\">\r\n");
      out.write("    <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\r\n");
      out.write("      <thead>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <th>institution Name: DGI</th>\r\n");
      out.write("          <th>Course Name: B.Tech</th>\r\n");
      out.write("          <th>Branch Name: Computer Science</th>\r\n");
      out.write("          <th><center>RollNo: 10025</center></th>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </thead>\r\n");
      out.write("      <thead>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <th>Name: Gaurav kumar</th>\r\n");
      out.write("          <th>Father Name: Sunil kumar</th>\r\n");
      out.write("          <th>Gender: Male</th>\r\n");
      out.write("          <th><a titlt=\"print screen\" alt=\"print screen\" onclick=\"window.print();\" target=\"_blank\" style=\"cursor:pointer;\"><center><img src=\"print.png\"></center></a></th>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </thead>\r\n");
      out.write("    </table>\r\n");
      out.write("  </div>\r\n");
      out.write("<style>\r\n");
      out.write("html {\r\n");
      out.write("  font-family:arial;\r\n");
      out.write("  font-size: 25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td {\r\n");
      out.write("  border: 2px solid #726E6D;\r\n");
      out.write("  padding: 15px;\r\n");
      out.write("  color:black;\r\n");
      out.write("  text-align:center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("thead{\r\n");
      out.write("  font-weight:bold;\r\n");
      out.write("  text-align:center;\r\n");
      out.write("  background: #625D5D;\r\n");
      out.write("  color:white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table {\r\n");
      out.write("  border-collapse: collapse;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer {\r\n");
      out.write("  text-align:right;\r\n");
      out.write("  font-weight:bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("tbody >tr:nth-child(odd) {\r\n");
      out.write("  background: #D1D0CE;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<head>\r\n");
      out.write("  <hr class=\"new1\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <table>\r\n");
      out.write("    <thead>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td colspan=\"3\">Course</td>\r\n");
      out.write("        <td rowspan=\"2\">Type</td>\r\n");
      out.write("        <td rowspan=\"2\">Full Marks</td>\r\n");
      out.write("        <td rowspan=\"2\">Passing Marks</td>\r\n");
      out.write("        <td rowspan=\"2\">Obtained Marks</td>\r\n");
      out.write("        \r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>Code </td>\r\n");
      out.write("        <td colspan=\"2\"> Name </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("    <tbody>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>NAS101</td>\r\n");
      out.write("        <td colspan=\"2\">Engg. Physics-I </td>\r\n");
      out.write("        <td>Theory</td>\r\n");
      out.write("        <td>100</td>\r\n");
      out.write("        <td> 30 </td>\r\n");
      out.write("        <td>80</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>NAS102</td>\r\n");
      out.write("        <td colspan=\"2\">Engg. Chemistry</td>\r\n");
      out.write("        <td>Theory</td>\r\n");
      out.write("        <td>100</td>\r\n");
      out.write("        <td>30</td>\r\n");
      out.write("        <td>98 </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>NAS103</td>\r\n");
      out.write("        <td colspan=\"2\">Engg. Mathematics-I </td>\r\n");
      out.write("        <td>Theory</td>\r\n");
      out.write("        <td>100</td>\r\n");
      out.write("        <td> 30 </td>\r\n");
      out.write("        <td> 75</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>NEE101</td>\r\n");
      out.write("        <td colspan=\"2\">Basic Electrical Engg. </td>\r\n");
      out.write("        <td>Theory</td>\r\n");
      out.write("        <td>100</td>\r\n");
      out.write("        <td> 30 </td>\r\n");
      out.write("        <td> 85</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>NEC101</td>\r\n");
      out.write("        <td colspan=\"2\">Electronic Engg.</td>\r\n");
      out.write("        <td>Theory</td>\r\n");
      out.write("        <td>100</td>\r\n");
      out.write("        <td> 30 </td>\r\n");
      out.write("        <td> 99 </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>NAS152</td>\r\n");
      out.write("        <td colspan=\"2\">Engg. Chemistry Lab</td>\r\n");
      out.write("        <td>Practical</td>\r\n");
      out.write("        <td>30</td>\r\n");
      out.write("        <td>15</td>\r\n");
      out.write("        <td> 20 </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>NAS151</td>\r\n");
      out.write("        <td colspan=\"2\">Engg. Physics Lab</td>\r\n");
      out.write("        <td>Practical</td>\r\n");
      out.write("        <td>30</td>\r\n");
      out.write("        <td>15</td>\r\n");
      out.write("        <td> 21 </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </tbody>\r\n");
      out.write("    <tfoot>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td colspan=\"4\" class=\"footer\">Total Marks</td>\r\n");
      out.write("        <td>560</td>\r\n");
      out.write("        <td>180</td>\r\n");
      out.write("        <td>450 </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td colspan=\"4\" class=\"footer\">Percentage</td>\r\n");
      out.write("        <td colspan=\"3\">80%</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("    <hr class=\"new1\">\r\n");
      out.write("  <center><h6>Note: Institution doesn't own for the errors or omissions, if any, in this statement.\r\n");
      out.write("Designed & Developed by BTech Days Team</h6></center>\r\n");
      out.write("  <hr class=\"new1\">\r\n");
      out.write("<center><h6>All Right Reserved @ BTech Days :: 2015-2020</h6></center> \r\n");
      out.write("  <hr class=\"new1\">\r\n");
      out.write("</body>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
