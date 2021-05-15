package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import uts.isd.model.Product;

public final class productCart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <div>\n");
      out.write("<iframe width=\"100%\" height=\"80\" scrolling=\"no\" src=\"interface.jsp\" title=\"Interface\"></iframe>\n");
      out.write("</div>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6\" crossorigin=\"anonymous\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>IOTBay Welcome Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("              \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

             //ArrayList<Product> productsCart = (ArrayList<Product>) session.getAttribute("products");
                         ArrayList<Product> Cart = new ArrayList<Product>();
                          //session.setAttribute("productsCart", productsCart);
                          ///id, produtname, price, discount, productEnumeral 
                            Cart.add(new Product( 1, "Book", 12, 1, null));
                        Cart.add(new Product( 2, "Pencil", 2, 1, null));
                        Cart.add(new Product( 3, "Pen", 7, 2, null));
                         
                         session.setAttribute("CartList", Cart);

                          int d = 0;  
                for (int i = 0; i < Cart.size(); i++) {     
                      d = d + 1;
                      
            }
                
                
                
      out.write("\n");
      out.write("                           \n");
      out.write("                 <SCRIPT LANGUAGE=\"JavaScript\">\n");
      out.write("            <!--\n");
      out.write("            function button1()\n");
      out.write("            {\n");
      out.write("               document.form1.buttonName.value = \"button 1\";\n");
      out.write("\n");
      out.write("               \n");
      out.write("                 form1.submit();\n");
      out.write("        \n");
      out.write("            }    \n");
      out.write("            function button2()\n");
      out.write("            {\n");
      out.write("                document.form1.buttonName.value = \"button 2\";\n");
      out.write("               \n");
      out.write("                form1.submit();\n");
      out.write("            }    \n");
      out.write("            // --> \n");
      out.write("        </SCRIPT>\n");
      out.write("         \n");
      out.write("        \n");
      out.write("        <section class=\"pt-5 pb-5\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"row w-100\">\n");
      out.write("        <div class=\"col-lg-12 col-md-12 col-12\">\n");
      out.write("            <h3 class=\"display-5 mb-2 text-center\">Shopping Cart</h3>\n");
      out.write("            <p class=\"mb-5 text-center\">\n");
      out.write("                \n");
      out.write("                <i class=\"text-info font-weight-bold\">");
      out.print( d );
      out.write("</i> items in your cart</p>\n");
      out.write("            <table id=\"shoppingCart\" class=\"table table-condensed table-responsive\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th style=\"width:60%\">Product</th>\n");
      out.write("                        <th style=\"width:12%\">Price</th>\n");
      out.write("                        <th style=\"width:10%\">Quantity</th>\n");
      out.write("                        <th style=\"width:16%\"></th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody> \n");
      out.write("                    \n");
      out.write("                      <div>\n");
      out.write("                      ");


                          
                        if(Cart == null || d == 0){
                          
      out.write("\n");
      out.write("                           <p class=\"mb-5 text-center\">\n");
      out.write("                \n");
      out.write("                        <i class=\"text-info font-weight-bold\"></i> Your cart is empty</p>\n");
      out.write("                          ");
}

                        else{
                      for (int i = 0; i < Cart.size(); i++) {
      out.write("\n");
      out.write("                      <tr>\n");
      out.write("                           <tr>\n");
      out.write("                        <td data-th=\"Product\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-3 text-left\">\n");
      out.write("                                    <img src=\"https://via.placeholder.com/250x250/5fa9f8/ffffff\" alt=\"\" class=\"img-fluid d-none d-md-block rounded mb-2 shadow \">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-9 text-left mt-sm-2\">\n");
      out.write("                                    <h4>");
      out.print( Cart.get(i).getName() );
      out.write("</h4>\n");
      out.write("                                    <p class=\"font-weight-light\">Brand &amp; Name</p>\n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </td>\n");
      out.write("                        <td data-th=\"Price\">$");
      out.print( Cart.get(i).getPrice() );
      out.write("</td>\n");
      out.write("                        <td data-th=\"Quantity\">\n");
      out.write("                            <input type=\"number\" class=\"form-control form-control-lg text-center\" value=\"1\">\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"actions\" data-th=\"\">\n");
      out.write("                            <p>\n");
      out.write("                               \n");
      out.write("\n");
      out.write("                            <a  class=\"btn btn-secondary my-2\" ONCLICK=\"\">Remove</a>\n");
      out.write("                        </p>\n");
      out.write("                        </td>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                                             \n");
      out.write("                        \n");
      out.write("                      ");
}

                        }


                      
      out.write("\n");
      out.write("                      </div>  \n");
      out.write("   \n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("            <div class=\"float-right text-right\">\n");
      out.write("                \n");
      out.write("                <div>\n");
      out.write("              \n");
      out.write("                  \n");
      out.write("            ");

                double a = 0;  
                for (int i = 0; i < Cart.size(); i++) {
                     double b = Cart.get(i).getPrice();
                      a = a + b;
            }
                
      out.write("\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <h4>Subtotal:$ ");
      out.print( a );
      out.write(" </h4>\n");
      out.write("                \n");
      out.write("                <h1></h1>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row mt-4 d-flex align-items-center\">\n");
      out.write("        <div class=\"col-sm-6 order-md-2 text-right\">\n");
      out.write("            <a href=\"orderDetails.jsp\" class=\"btn btn-primary mb-4 btn-lg pl-5 pr-5\">Checkout</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-6 mb-3 mb-m-1 order-md-1 text-md-left\">\n");
      out.write("            <a href=\"catalog.html\">\n");
      out.write("                <i class=\"fas fa-arrow-left mr-2\"></i> Continue Shopping</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</section>\n");
      out.write("        \n");
      out.write("  \n");
      out.write("  \n");
      out.write("        \n");
      out.write("    \n");
      out.write("      \n");
      out.write("      \n");
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
