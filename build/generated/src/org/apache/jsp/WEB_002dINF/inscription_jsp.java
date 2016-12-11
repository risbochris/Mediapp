package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inscription_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <!--meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" /-->\t\n");
      out.write("        <title>Inscription</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("\n");
      out.write("        <!-- stylesheets -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Ressources/css/compiled/theme.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Ressources/css/vendor/brankic.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Ressources/css/vendor/ionicons.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Ressources/css/vendor/font-awesome.min.css\" />\n");
      out.write("\n");
      out.write("        <!-- javascript -->\n");
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/theme.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body id=\"signup\">\n");
      out.write("        <a href=\"/\" class=\"logo\">\n");
      out.write("            <i class=\"brankic-pen\"></i>\n");
      out.write("        </a>\n");
      out.write("\n");
      out.write("        <h3>Nouveau médiathécaire</h3>\n");
      out.write("        <div class=\"content\">\n");
      out.write("            \n");
      out.write("            <form method=\"POST\" action=\"Register\">\n");
      out.write("                <div class=\"fields\">\n");
      out.write("                    <strong>Informations personnelles</strong>\n");
      out.write("                    <input class=\"form-control\" name=\"nom\" type=\"text\" placeholder=\"Nom\" />\n");
      out.write("                    <input class=\"form-control\" name=\"prenom\" type=\"text\" placeholder=\"Prénoms\" />\n");
      out.write("                    <input class=\"form-control\" name=\"adresse\" type=\"text\" placeholder=\"Adresse complète\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"fields\">\n");
      out.write("                    <strong>Informations de connexion</strong>\n");
      out.write("                    <input class=\"form-control\" name=\"mail\" type=\"text\" placeholder=\"Email\" />\n");
      out.write("                    <input class=\"form-control\" name=\"pwd\" type=\"password\" placeholder=\"Mot de passe\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"signup\">\n");
      out.write("                    <input type=\"submit\" value=\"Inscription\" class=\"btn btn-success btn-lg\" />\t\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"bottom-wrapper\">\n");
      out.write("\t\t<div class=\"message\">\n");
      out.write("\t\t\t<span>Accéder à votre tableau de bord</span>\n");
      out.write("\t\t\t<a href=\"/Dashboard\">ici</a>.\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
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
