package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import uts.isd.model.Product;

public final class orderDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("     <<div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("     \n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6\" crossorigin=\"anonymous\">\n");
      out.write("        <title>Order summary</title>\n");
      out.write("    </head>\n");
      out.write("<body class=\"bg-light\" data-new-gr-c-s-check-loaded=\"14.1010.0\" data-gr-ext-installed=\"\">\n");
      out.write("\n");
      out.write("    ");

            ArrayList<Product> CartList = new ArrayList<Product>();
            CartList = (ArrayList<Product>)session.getAttribute("CartList");
            

                if(CartList == null){
                          
      out.write("\n");
      out.write("                          <p>Your cart is empty</p>\n");
      out.write("                          ");
}

                        else{
                      for (int i = 0; i < CartList.size(); i++) {
      out.write("\n");
      out.write("                      <tr>\n");
      out.write("                           <tr>\n");
      out.write("                        \n");
      out.write("                      ");
}

                        }



        
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"py-5 text-center\">\n");
      out.write("        <h2>Order details</h2>\n");
      out.write("      \n");
      out.write("      </div>\n");
      out.write("        \n");
      out.write("\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-4 order-md-2 mb-4\">\n");
      out.write("          <h4 class=\"d-flex justify-content-between align-items-center mb-3\">\n");
      out.write("            <span class=\"text-muted\">Your cart</span>\n");
      out.write("            <span class=\"badge badge-secondary badge-pill\">3</span>\n");
      out.write("          </h4>\n");
      out.write("          <ul class=\"list-group mb-3\">\n");
      out.write("\n");
      out.write("               ");

                   if(CartList == null){
                          
      out.write("\n");
      out.write("                          <p>Your cart is empty</p>\n");
      out.write("                          ");
}

                        else{
                             double a = 0;  
                      for (int i = 0; i < CartList.size(); i++) {
                      double b = CartList.get(i).getPrice();
                      a = a + b;
                      
      out.write("\n");
      out.write("                       <li class=\"list-group-item d-flex justify-content-between lh-condensed\">\n");
      out.write("              <div>\n");
      out.write("                <h6 class=\"my-0\">");
      out.print( CartList.get(i).getName() );
      out.write("</h6>\n");
      out.write("                <small class=\"text-muted\">Brief description</small>\n");
      out.write("              </div>\n");
      out.write("                \n");
      out.write(" \n");
      out.write("              <span class=\"text-muted\">$5</span>\n");
      out.write("            </li>\n");
      out.write("                        \n");
      out.write("                      ");
}}
      out.write("\n");
      out.write("              \n");
      out.write("              \n");
      out.write("            \n");
      out.write("            <li class=\"list-group-item d-flex justify-content-between bg-light\">\n");
      out.write("              <div class=\"text-success\">\n");
      out.write("                <h6 class=\"my-0\">Money saved</h6>\n");
      out.write("                <small>Your discount total</small>\n");
      out.write("              </div>\n");
      out.write("              <span class=\"text-success\">-$5</span>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"list-group-item d-flex justify-content-between\">\n");
      out.write("              <span>Total (AUD)</span>\n");
      out.write("              <strong>$20</strong>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-8 order-md-1\">\n");
      out.write("          <h4 class=\"mb-3\">My details</h4>\n");
      out.write("          <form class=\"needs-validation\" novalidate=\"\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-md-6 mb-3\">\n");
      out.write("                <label for=\"firstName\">First name</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"firstName\" placeholder=\"\" value=\"\" required=\"\">\n");
      out.write("                </div>\n");
      out.write("              <div class=\"col-md-6 mb-3\">\n");
      out.write("                <label for=\"lastName\">Last name</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"lastName\" placeholder=\"\" value=\"\" required=\"\">\n");
      out.write("                <div class=\"invalid-feedback\">\n");
      out.write("                  Valid last name is required.\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("              <label for=\"username\">Username</label>\n");
      out.write("              <div class=\"input-group\">\n");
      out.write("                <div class=\"input-group-prepend\">\n");
      out.write("                  <span class=\"input-group-text\">@</span>\n");
      out.write("                </div>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"username\" placeholder=\"Username\" required=\"\">\n");
      out.write("                <div class=\"invalid-feedback\" style=\"width: 100%;\">\n");
      out.write("                  Your username is required.\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("              <label for=\"email\">Email <span class=\"text-muted\">(Optional)</span></label>\n");
      out.write("              <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"you@example.com\">\n");
      out.write("             \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <h4 class=\"mb-3\">Shipment & payment</h4>\n");
      out.write("\n");
      out.write("           \n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-md-6 mb-3\">\n");
      out.write("                <label for=\"cc-name\">Address</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"cc-name\" placeholder=\"\" required=\"\">\n");
      out.write("                  <p>\n");
      out.write("            <a href=\"login.jsp\" class=\"btn btn-secondary my-2\">Add shipment details</a>\n");
      out.write("          </p>\n");
      out.write("              </div>\n");
      out.write("                          </div>\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-md-6 mb-3\">\n");
      out.write("                <label for=\"cc-name\">Name on card</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"cc-name\" placeholder=\"\" required=\"\">\n");
      out.write("                \n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-md-6 mb-3\">\n");
      out.write("                <label for=\"cc-number\">Credit card number</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"cc-number\" placeholder=\"\" required=\"\">\n");
      out.write("\n");
      out.write("              </div>\n");
      out.write("                 <p>\n");
      out.write("            <a href=\"login.jsp\" class=\"btn btn-secondary my-2\">Add payment details</a>\n");
      out.write("          </p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("            <hr class=\"mb-4\">\n");
      out.write("            <button class=\"btn btn-primary btn-lg btn-block\" type=\"submit\">Complete order</button>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <footer class=\"my-5 pt-5 text-muted text-center text-small\">\n");
      out.write("        <p class=\"mb-1\">© 2020 IoTBay</p>\n");
      out.write("       \n");
      out.write("      </footer>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript\n");
      out.write("    ================================================== -->\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("    \n");
      out.write(" \n");
      out.write("    <script src=\"../../assets/js/vendor/popper.min.js\"></script>\n");
      out.write("    <script src=\"../../dist/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"../../assets/js/vendor/holder.min.js\"></script>\n");
      out.write("   \n");
      out.write("  \n");
      out.write("\n");
      out.write("<!--</body>\n");
      out.write("     \n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("             <section class=\"jumbotron text-center\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <h1 class=\"jumbotron-heading\">Confirm your order details</h1>\n");
      out.write("  \n");
      out.write("          <p>Order summary</p>\n");
      out.write("          \n");
      out.write("                <div>\n");
      out.write("            <a>ORDER INFO</a>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("            <a href=\"index.jsp\" class=\"btn btn-secondary my-2\">Add shipment</a>\n");
      out.write("            <a href=\"index.jsp\" class=\"btn btn-secondary my-2\">Add Payment</a>\n");
      out.write("          </p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("         </div>\n");
      out.write("            <a href=\"index.jsp\" class=\"btn btn-secondary my-2\">Confirm order</a>\n");
      out.write("          </p>\n");
      out.write("        </div>\n");
      out.write("      </section>\n");
      out.write("            \n");
      out.write("\n");
      out.write("    </body>-->\n");
      out.write("    \n");
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
