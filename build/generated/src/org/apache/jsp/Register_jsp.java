package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.swing.text.Position;
import java.sql.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    
    if (request.getParameter ("submit") !=null)
    {
        String Name=request.getParameter("Name");
   String Enrollment= request.getParameter ("Enrollment");
String Sex= request.getParameter ("Sex"); 
String Event= request.getParameter ("Event");
String Stream=request.getParameter("Stream");
String Position=request.getParameter("Position");
String Year=request.getParameter("Year");


Connection con;
PreparedStatement pst;
ResultSet rs;
Class.forName("oracle.jdbc.driver.OracleDriver");
con = DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-ONDH6FL6:1521:XE","M1","M1");
pst=con.prepareStatement("insert into Sang values(?,?,?,?,?,?,?)");
pst.setString(1,Name);
pst.setString (2, Enrollment);
pst.setString (3,Sex );
pst.setString (4,Event);
pst.setString(5,Stream);
pst.setString(6,Position);
pst.setString(7,Year);

pst.executeUpdate();
response.sendRedirect("category.jsp");


      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    \n");
      out.write("    alert(\"Record Added\");\n");
      out.write("    \n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    ");


    }



      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registration Page</title>\n");
      out.write("        <link href=\"bootstrap-5.1.3-dist/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"bootstrap-5.1.3-dist/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <body background=\"1.jpg\">\n");
      out.write("        \n");
      out.write("        <h1><center>Player Registration Form</center></h1>\n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-5\">\n");
      out.write("                <form style=\"justify-content: center\" class=\"\" method=\"POST\" action=\"#\">\n");
      out.write("                    <div alight=\"left\">\n");
      out.write("            <label class=\"form-label\">Enrollment</label>\n");
      out.write("<input type=\"text\" class=\"form-control\" placeholder=\"Enrollment\" name=\"Enrollment\" id=\"Enrollment\" required > \n");
      out.write("                    </div>\n");
      out.write("                    <div align=\"left\">\n");
      out.write("                      <label class=\"form-label\">Student Name</label>\n");
      out.write("                     <input type=\"text\" class=\"form-control\" placeholder=\" Student Name\" name=\"Name\" id=\"Name\" required >\n");
      out.write("                      </div>\n");
      out.write("                          \n");
      out.write("                       <div alight=\"left\">\n");
      out.write("            <label class=\"form-label\">Stream</label>\n");
      out.write("<input type=\"text\" class=\"form-control\" placeholder=\"Stream\" name=\"Stream\" id=\"Stream\" required > \n");
      out.write("\n");
      out.write("                      </div>\n");
      out.write("    \n");
      out.write("                    <div alight=\"left\">\n");
      out.write("\n");
      out.write("<label class=\"form-label\">Position</label>\n");
      out.write("<input type=\"text\" class=\"form-control\" placeholder=\"Position\" name=\"Position\" id=\"Position\" required >\n");
      out.write("\n");
      out.write(" </div>\n");
      out.write("    \n");
      out.write("                    <div alight=\"left\">\n");
      out.write("\n");
      out.write("<label class=\"form-label\">Event</label>\n");
      out.write("<input type=\"text\" class=\"form-control\" placeholder=\"Event\" name=\"Event\" id=\"Event\" required >\n");
      out.write("               </div>\n");
      out.write("    \n");
      out.write("                    <div alight=\"left\">\n");
      out.write("\n");
      out.write("<label class=\"form-label\">Sex</label>\n");
      out.write("<input type=\"text\" class=\"form-control\" placeholder=\"Sex\" name=\"Sex\" id=\"Sex\" required >\n");
      out.write("                    </div>\n");
      out.write("    \n");
      out.write("                    <div alight=\"left\">\n");
      out.write("\n");
      out.write("<label class=\"form-label\">Year</label>\n");
      out.write("<input type=\"numer\" class=\"form-control\" placeholder=\"Year\" name=\"Year\" id=\"Year\" required >\n");
      out.write("            \n");
      out.write("    <div alight=\"center\">\n");
      out.write("         </br>\n");
      out.write("<input type=\"submit\" id=\"submit\" value=\"Submit\" name=\"submit\" class=\"btn btn-info\">\n");
      out.write("        <input type=\"reset\" id=\"reset\" value=\"Reset\" name=\"reset\" class=\"btn btn-warning\">\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("                </form>                                      \n");
      out.write("            </div>\n");
      out.write("                    <h4>To view Registered Student List <a href=\"category.jsp\" target=\"blank\" class=\"btn1\">Click Here</a></h4>\n");
      out.write("                </body>\n");
      out.write("    </html>\n");
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
