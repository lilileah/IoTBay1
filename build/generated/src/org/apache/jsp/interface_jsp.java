package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class interface_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" rossorigin=\"anonymous\">\r\n");
      out.write("        <link href=\"css/Adjustment.css\" rel=\"stylesheet\">\r\n");
      out.write("        <title>IOTBay Interface</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <nav class=\"navbar navbar-expand-md navbar-dark fixed-top bg-dark\">\r\n");
      out.write("            <!--Center-->\r\n");
      out.write("            \r\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">IoT Bay</a>\r\n");
      out.write("            \r\n");
      out.write("            <!--Right side buttons-->\r\n");
      out.write("            <ul class=\"navbar-nav ms-auto\">\r\n");
      out.write("                <li class=\"nav-item\"><a class=\"btn btn-sm btn-outline-secondary\"\" href=\"login.jsp\">Login</a></li>\r\n");
      out.write("                <a>x</a>\r\n");
      out.write("                <li class=\"nav-item\"><a class=\"btn btn-sm btn-outline-secondary\" href=\"register.jsp\"> Register</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("        \r\n");
      out.write("        <main role=\"main\" class=\"container\">\r\n");
      out.write("      <h1 class=\"mt-5\">Welcome to IoT Bay!</h1>\r\n");
      out.write("    </main>\r\n");
      out.write("        \r\n");
      out.write("   \r\n");
      out.write("        \r\n");
      out.write("     \r\n");
      out.write("        \r\n");
      out.write("        >>\r\n");
      out.write("\r\n");
      out.write("        <!--temp-->\r\n");
      out.write("        <!--<h1>IOTBay</h1>\r\n");
      out.write("        <p>Welcome to IOT Bay!</p>\r\n");
      out.write("        <table>\r\n");
      out.write("            <tr><td><a href=\"register.jsp\"> Register</a></td></tr>\r\n");
      out.write("            <tr><td><a href=\"login.jsp\"> Login</a></td></tr>\r\n");
      out.write("        </table>-->\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
