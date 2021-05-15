package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \r\n");
      out.write("    <div>\r\n");
      out.write("<iframe width=\"100%\" height=\"80\" scrolling=\"no\" src=\"interface.jsp\" title=\"Interface\"></iframe>\r\n");
      out.write("</div>\r\n");
      out.write("    \r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6\" crossorigin=\"anonymous\">\r\n");
      out.write("        <title>Home Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"mx-auto\" style=\"width: 900px;\">\r\n");
      out.write("        \r\n");
      out.write("           <section class=\"jumbotron text-center\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("          <h1 class=\"jumbotron-heading\">Welcome top IoT bay!</h1>\r\n");
      out.write("          <p class=\"lead\">IoTBay is  a  small  company  based  in  Sydney,  Australia. This site is an  online  IoT  devices  ordering  application  to  allow  their customers  to  purchase  IoT  devices </p>\r\n");
      out.write("          <p>\r\n");
      out.write("            <a href=\"register.jsp\" class=\"btn btn-primary my-2\">New member</a>\r\n");
      out.write("            <a href=\"login.jsp\" class=\"btn btn-secondary my-2\">Existing member</a>\r\n");
      out.write("          </p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </section>\r\n");
      out.write("      </main>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/ConnServlet", out, true);
      out.write("\r\n");
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
