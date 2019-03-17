package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class acerca_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">    \n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <link rel=\"icon\" href=\"favicon.ico\">\n");
      out.write("    <title>My Company - Acerca</title>\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"css/justified-nav.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("    \n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("      <!-- The justified navigation menu is meant for single line per list item.\n");
      out.write("           Multiple lines will require custom code not provided by Bootstrap. -->\n");
      out.write("      <div class=\"masthead\">\n");
      out.write("        <h3 class=\"text-muted\">My Company</h3>\n");
      out.write("        <nav>\n");
      out.write("          <ul class=\"nav nav-justified\">\n");
      out.write("            <li><a href=\"homepage\">Inicio</a></li>            \n");
      out.write("            <li><a href=\"admin?action=login\">Administración</a></li>                        \n");
      out.write("            <li><a href=\"acerca.jsp\">Acerca</a></li>            \n");
      out.write("          </ul>\n");
      out.write("        </nav>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <!-- Jumbotron -->\n");
      out.write("      <div class=\"jumbotron\">\n");
      out.write("        <h2>ACERCA</h2>\n");
      out.write("        <p class=\"lead text-justify\">Si te interesa esta aplicacion <a href='#'>Publicacion de vacantes con Java EE - Servlets y JSP</a>\n");
      out.write("          esta aplicacion esta realizada para que un usuario administrador pueda publicar,eliminar,editar ofertas de trabajo en la web.\n");
      out.write("          Cualquier duda o comentario puedes enviarme un correo electrónico.<br> <br>         \n");
      out.write("          <b>Autor</b>: !!!!!!!!!!!!!!!!!!!!!!!<br>\n");
      out.write("          <b>Email</b>: !!!!!!!!!!!!!!!!!!!!!!!\n");
      out.write("        <p>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </div> <!-- /container -->\n");
      out.write("\n");
      out.write("  </body>\n");
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
