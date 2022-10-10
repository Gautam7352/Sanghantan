package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Playerinfo_1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<link rel=\"stylesheet\" href=\"Player_info.css\">\n");
      out.write("<title>Player</title>\n");
      out.write("\n");
      out.write("<!-- External Styles -->\n");
      out.write("<link rel=\"stylesheet\" href=\"styles/page_elements.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"styles/form_elements.css\">\n");
      out.write("\n");
      out.write("<!-- External Scripts --> \n");
      out.write("<script src=\"scripts/somefile.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body background=\"football.jpeg\">\n");
      out.write("    <center>\n");
      out.write("        <input type=\"button\" value=\"PLAYER INFO FEMALE PLAYING IN SANGATHAN\">\n");
      out.write("    </center>\n");
      out.write("    <h2></h2>\n");
      out.write("    <hr class=\"one\">\n");
      out.write("    <div id=\"container\">\n");
      out.write("        <button  id=\"button1\" name=\"B.TECH\"><a href=\"B.Tech1.jsp\">B.TECH</a></button>\n");
      out.write("        <button  id=\"button1\" name=\"B.COM\"><a href=\"B.Com1.jsp\">B.COM</a></button>\n");
      out.write("        <button  id=\"button1\" name=\"BBA\"><a href=\"BBA1.jsp\">BBA</a></button>\n");
      out.write("      </div>\n");
      out.write("      <br>\n");
      out.write("      <br>\n");
      out.write("      <br>\n");
      out.write("      \n");
      out.write("      <h2></h2>\n");
      out.write("    <hr class=\"one\">\n");
      out.write("    <div id=\"container\">\n");
      out.write("        <button  id=\"button1\" name=\"BA\"><a href=\"BA1.jsp\">BA</a></button>\n");
      out.write("        <button  id=\"button1\" name=\"MBA\"><a href=\"MBA1.jsp\">MBA</a></button>\n");
      out.write("        <button  id=\"button1\" name=\"BCA\"><a href=\"Btech.jsp\">BCA</a></button>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("</body>    \n");
      out.write("</html>");
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
