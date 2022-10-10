package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Connection;

public final class BBA_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Teamview BCA</title>\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"teamview (2).css\"  />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class='container'>\n");
      out.write("<table class=\"styled-table\">\n");
      out.write("<caption>Cricket</caption>\n");
      out.write("    <thead>\n");
      out.write("        <tr>\n");
      out.write("            <th>Enrollment</th>\n");
      out.write("\t\t\t<th>Name</th>\n");
      out.write("            <th>Position</th>\n");
      out.write("\t\t\t\n");
      out.write("        </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody>\n");
      out.write("        <tr>\n");
      out.write("            <td></td>\n");
      out.write("\t\t\t<td></td>\n");
      out.write("\t\t\t<td></td>\n");
      out.write("        </tr>\n");
      out.write("       ");

    
    Connection con;
PreparedStatement pst;
ResultSet rs;
Class.forName("oracle.jdbc.driver.OracleDriver");
con = DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-ONDH6FL6:1521:XE","M1","M1");

  String query="select * from Sang where Event='Cricket' and Stream='BBA' order by Enrollment";
  Statement st=con.createStatement();
  rs=st.executeQuery(query);
  
  
  while(rs.next())
  {
      String Enrollment=rs.getString("Enrollment");
 
      
      
      out.write("\n");
      out.write("      \n");
      out.write("  \n");
      out.write("    \n");
      out.write("<tr>\n");
      out.write("    <td>");
      out.print(rs.getString("Enrollment") );
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("Name") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(rs.getString("Position") );
      out.write("</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");

    
    
    }


      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </tbody>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<table class=\"styled-table\">\n");
      out.write("<caption>Football</caption>\n");
      out.write("    <thead>\n");
      out.write("\t\t <tr>\n");
      out.write("            <th>S.no</th>\n");
      out.write("\t\t\t<th>Name</th>\n");
      out.write("            <th>Position</th>\n");
      out.write("\t\t\t\n");
      out.write("        </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody>\n");
      out.write("        <tr>\n");
      out.write("            <td></td>\n");
      out.write("\t\t\t<td></td>\n");
      out.write("\t\t\t<td></td>\n");
      out.write("        </tr>\n");
      out.write("         ");

   
    Connection on;
PreparedStatement t;
ResultSet s;
Class.forName("oracle.jdbc.driver.OracleDriver");
on = DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-ONDH6FL6:1521:XE","M1","M1");

  String sql="select * from Sang where Event='Football' and Stream='BBA' and Sex='Male' order by Enrollment";
 Statement stt=con.createStatement();
  rs=st.executeQuery(sql);
  
  
  while(rs.next())
  {
      String Enrollment=rs.getString("Enrollment");
 
      
      
      out.write("\n");
      out.write("      \n");
      out.write("  \n");
      out.write("    \n");
      out.write("<tr>\n");
      out.write("    <td>");
      out.print(rs.getString("Enrollment") );
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("Name") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(rs.getString("Position") );
      out.write("</td>\n");

    
    
    }


      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </tbody>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<table class=\"styled-table\">\n");
      out.write("<caption>Volleyball</caption>\n");
      out.write("    <thead>\n");
      out.write("\t     <tr>\n");
      out.write("            <th>Enrollment</th>\n");
      out.write("\t\t\t<th>Name</th>\n");
      out.write("            <th>Position</th>\n");
      out.write("\t\t\t\n");
      out.write("        </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody>\n");
      out.write("        <tr>\n");
      out.write("            <td></td>\n");
      out.write("\t\t\t<td></td>\n");
      out.write("\t\t\t<td></td>\n");
      out.write("        </tr>\n");
      out.write("        ");

   
    Connection c;
PreparedStatement p;
ResultSet r;
Class.forName("oracle.jdbc.driver.OracleDriver");
c = DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-ONDH6FL6:1521:XE","M1","M1");

  String sq="select * from Sang where Event='VolleyBall' and Stream='BBA' and Sex='Male' order by Enrollment";
 Statement y=c.createStatement();
  rs=st.executeQuery(sq);
  
  
  while(rs.next())
  {
      String Enrollment=rs.getString("Enrollment");
 
      
      
      out.write("\n");
      out.write("      \n");
      out.write("  \n");
      out.write("    \n");
      out.write("<tr>\n");
      out.write("    <td>");
      out.print(rs.getString("Enrollment") );
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("Name") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(rs.getString("Position") );
      out.write("</td>\n");

    
    
    }


      out.write("\n");
      out.write("\n");
      out.write("    </tbody>\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("<div class='container2'>\n");
      out.write("<table class=\"styled-table\">\n");
      out.write("<caption>Kabbadi</caption>\n");
      out.write("    <thead>\n");
      out.write("        <tr>\n");
      out.write("            <th>Enrollment</th>\n");
      out.write("\t\t\t<th>Name</th>\n");
      out.write("            <th>Position</th>\n");
      out.write("\t\t\t\n");
      out.write("        </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody>\n");
      out.write("        <tr>\n");
      out.write("            <td></td>\n");
      out.write("\t\t\t<td></td>\n");
      out.write("\t\t\t<td></td>\n");
      out.write("        </tr>\n");
      out.write("       ");

   
    Connection cn;
PreparedStatement q;
ResultSet o;
Class.forName("oracle.jdbc.driver.OracleDriver");
cn = DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-ONDH6FL6:1521:XE","M1","M1");

  String ql="select * from Sang where Event='Kabaddi' and Stream='BBA' and Sex='Male' order by Enrollment";
 Statement yu=cn.createStatement();
  rs=st.executeQuery(ql);
  
  
  while(rs.next())
  {
      String Enrollment=rs.getString("Enrollment");
 
      
      
      out.write("\n");
      out.write("      \n");
      out.write("  \n");
      out.write("    \n");
      out.write("<tr>\n");
      out.write("    <td>");
      out.print(rs.getString("Enrollment") );
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("Name") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(rs.getString("Position") );
      out.write("</td>\n");

    
    
    }


      out.write("\n");
      out.write("\n");
      out.write("    </tbody>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<table class=\"styled-table\">\n");
      out.write("<caption>Individual Event</caption>\n");
      out.write("    <thead>\n");
      out.write("        <tr>\n");
      out.write("            <th>S.no</th>\n");
      out.write("\t\t\t<th>Name</th>\n");
      out.write("            <th>Event Name</th>\n");
      out.write("\t\t\t\n");
      out.write("        </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody>\n");
      out.write("        <tr>\n");
      out.write("            <td></td>\n");
      out.write("\t\t\t<td></td>\n");
      out.write("\t\t\t<td></td>\n");
      out.write("                       \n");
      out.write("        </tr>\n");
      out.write("        ");

   
    Connection co;
PreparedStatement a;
ResultSet re;
Class.forName("oracle.jdbc.driver.OracleDriver");
co = DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-ONDH6FL6:1521:XE","M1","M1");

  String l="select * from Sang where Event IN('Chess','TableTennis','Carrom','Badminton')  and Stream='BBA' and Sex='Male' order by Enrollment";
 Statement yun=co.createStatement();
  rs=st.executeQuery(l);
  
  
  while(rs.next())
  {
      String Enrollment=rs.getString("Enrollment");
 
      
      
      out.write("\n");
      out.write("      \n");
      out.write("  \n");
      out.write("    \n");
      out.write("<tr>\n");
      out.write("    <td>");
      out.print(rs.getString("Enrollment") );
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("Name") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(rs.getString("Event") );
      out.write("</td>\n");

    
    
    }


      out.write("\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("    </tbody>\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
