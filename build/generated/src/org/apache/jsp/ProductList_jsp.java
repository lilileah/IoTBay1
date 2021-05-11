package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import uts.isd.model.User;

public final class ProductList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"/docs/5.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <title>Products</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
User user = (User) session.getAttribute("user");
      out.write("\n");
      out.write("\n");
      out.write("        <h1 class=\"fw-light\">Products</h1>\n");
      out.write("\n");
      out.write("        ");
if (user != null && user.getUser_type().equals("S")) {
      out.write("\n");
      out.write("        <button>Add Product</button>\n");
      out.write("        ");
} else if (user == null) {
      out.write("\n");
      out.write("        <p>please log in to make an order</p>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"album py-5 bg-light\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                <div class=\"row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3\">\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <div class=\"card shadow-sm\">\n");
      out.write("                            <svg class=\"bd-placeholder-img card-img-top\" width=\"100%\" height=\"225\" xmlns=\"http://www.w3.org/2000/svg\" role=\"img\" aria-label=\"Placeholder: Thumbnail\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\"><title>Placeholder</title><rect width=\"100%\" height=\"100%\" fill=\"#55595c\"></rect><text x=\"50%\" y=\"50%\" fill=\"#eceeef\" dy=\".3em\">Thumbnail</text></svg>\n");
      out.write("\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\n");
      out.write("                                <div class=\"d-flex justify-content-between align-items-center\">\n");
      out.write("                                    <div class=\"btn-group\">\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">View</button>\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Edit</button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <small class=\"text-muted\">9 mins</small>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <div class=\"card shadow-sm\">\n");
      out.write("                            <svg class=\"bd-placeholder-img card-img-top\" width=\"100%\" height=\"225\" xmlns=\"http://www.w3.org/2000/svg\" role=\"img\" aria-label=\"Placeholder: Thumbnail\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\"><title>Placeholder</title><rect width=\"100%\" height=\"100%\" fill=\"#55595c\"></rect><text x=\"50%\" y=\"50%\" fill=\"#eceeef\" dy=\".3em\">Thumbnail</text></svg>\n");
      out.write("\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\n");
      out.write("                                <div class=\"d-flex justify-content-between align-items-center\">\n");
      out.write("                                    <div class=\"btn-group\">\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">View</button>\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Edit</button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <small class=\"text-muted\">9 mins</small>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <div class=\"card shadow-sm\">\n");
      out.write("                            <svg class=\"bd-placeholder-img card-img-top\" width=\"100%\" height=\"225\" xmlns=\"http://www.w3.org/2000/svg\" role=\"img\" aria-label=\"Placeholder: Thumbnail\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\"><title>Placeholder</title><rect width=\"100%\" height=\"100%\" fill=\"#55595c\"></rect><text x=\"50%\" y=\"50%\" fill=\"#eceeef\" dy=\".3em\">Thumbnail</text></svg>\n");
      out.write("\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\n");
      out.write("                                <div class=\"d-flex justify-content-between align-items-center\">\n");
      out.write("                                    <div class=\"btn-group\">\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">View</button>\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Edit</button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <small class=\"text-muted\">9 mins</small>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <div class=\"card shadow-sm\">\n");
      out.write("                            <svg class=\"bd-placeholder-img card-img-top\" width=\"100%\" height=\"225\" xmlns=\"http://www.w3.org/2000/svg\" role=\"img\" aria-label=\"Placeholder: Thumbnail\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\"><title>Placeholder</title><rect width=\"100%\" height=\"100%\" fill=\"#55595c\"></rect><text x=\"50%\" y=\"50%\" fill=\"#eceeef\" dy=\".3em\">Thumbnail</text></svg>\n");
      out.write("\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\n");
      out.write("                                <div class=\"d-flex justify-content-between align-items-center\">\n");
      out.write("                                    <div class=\"btn-group\">\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">View</button>\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Edit</button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <small class=\"text-muted\">9 mins</small>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <div class=\"card shadow-sm\">\n");
      out.write("                            <svg class=\"bd-placeholder-img card-img-top\" width=\"100%\" height=\"225\" xmlns=\"http://www.w3.org/2000/svg\" role=\"img\" aria-label=\"Placeholder: Thumbnail\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\"><title>Placeholder</title><rect width=\"100%\" height=\"100%\" fill=\"#55595c\"></rect><text x=\"50%\" y=\"50%\" fill=\"#eceeef\" dy=\".3em\">Thumbnail</text></svg>\n");
      out.write("\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\n");
      out.write("                                <div class=\"d-flex justify-content-between align-items-center\">\n");
      out.write("                                    <div class=\"btn-group\">\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">View</button>\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Edit</button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <small class=\"text-muted\">9 mins</small>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <div class=\"card shadow-sm\">\n");
      out.write("                            <svg class=\"bd-placeholder-img card-img-top\" width=\"100%\" height=\"225\" xmlns=\"http://www.w3.org/2000/svg\" role=\"img\" aria-label=\"Placeholder: Thumbnail\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\"><title>Placeholder</title><rect width=\"100%\" height=\"100%\" fill=\"#55595c\"></rect><text x=\"50%\" y=\"50%\" fill=\"#eceeef\" dy=\".3em\">Thumbnail</text></svg>\n");
      out.write("\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\n");
      out.write("                                <div class=\"d-flex justify-content-between align-items-center\">\n");
      out.write("                                    <div class=\"btn-group\">\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">View</button>\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Edit</button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <small class=\"text-muted\">9 mins</small>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <div class=\"card shadow-sm\">\n");
      out.write("                            <svg class=\"bd-placeholder-img card-img-top\" width=\"100%\" height=\"225\" xmlns=\"http://www.w3.org/2000/svg\" role=\"img\" aria-label=\"Placeholder: Thumbnail\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\"><title>Placeholder</title><rect width=\"100%\" height=\"100%\" fill=\"#55595c\"></rect><text x=\"50%\" y=\"50%\" fill=\"#eceeef\" dy=\".3em\">Thumbnail</text></svg>\n");
      out.write("\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\n");
      out.write("                                <div class=\"d-flex justify-content-between align-items-center\">\n");
      out.write("                                    <div class=\"btn-group\">\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">View</button>\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Edit</button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <small class=\"text-muted\">9 mins</small>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <div class=\"card shadow-sm\">\n");
      out.write("                            <svg class=\"bd-placeholder-img card-img-top\" width=\"100%\" height=\"225\" xmlns=\"http://www.w3.org/2000/svg\" role=\"img\" aria-label=\"Placeholder: Thumbnail\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\"><title>Placeholder</title><rect width=\"100%\" height=\"100%\" fill=\"#55595c\"></rect><text x=\"50%\" y=\"50%\" fill=\"#eceeef\" dy=\".3em\">Thumbnail</text></svg>\n");
      out.write("\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\n");
      out.write("                                <div class=\"d-flex justify-content-between align-items-center\">\n");
      out.write("                                    <div class=\"btn-group\">\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">View</button>\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Edit</button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <small class=\"text-muted\">9 mins</small>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <div class=\"card shadow-sm\">\n");
      out.write("                            <svg class=\"bd-placeholder-img card-img-top\" width=\"100%\" height=\"225\" xmlns=\"http://www.w3.org/2000/svg\" role=\"img\" aria-label=\"Placeholder: Thumbnail\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\"><title>Placeholder</title><rect width=\"100%\" height=\"100%\" fill=\"#55595c\"></rect><text x=\"50%\" y=\"50%\" fill=\"#eceeef\" dy=\".3em\">Thumbnail</text></svg>\n");
      out.write("\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\n");
      out.write("                                <div class=\"d-flex justify-content-between align-items-center\">\n");
      out.write("                                    <div class=\"btn-group\">\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">View</button>\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Edit</button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <small class=\"text-muted\">9 mins</small>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
