package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">    \n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <link rel=\"icon\" href=\"favicon.ico\">\n");
      out.write("    <title>Departamento de Recursos Humanos - My Company</title>\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"css/justified-nav.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("\n");
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
      out.write("      \n");
      out.write("      <!-- Formulario para la busqueda. El formulario es enviado por POST al BusquedaController -->    \n");
      out.write("      <form method =\"post\" action=\"buscar\" class=\"navbar-form navbar-right\">\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <input type=\"text\" name=\"query\" required placeholder=\"Buscar oferta...\" class=\"form-control\">\n");
      out.write("        </div>        \n");
      out.write("        <button type=\"submit\" class=\"btn btn-success\">Buscar</button>\n");
      out.write("      </form>\n");
      out.write("          \n");
      out.write("      <!-- Jumbotron -->\n");
      out.write("      <div class=\"jumbotron\">\n");
      out.write("        <h2>¡ENCUENTRA TU TRABAJO IDEAL!</h2>\n");
      out.write("        <!--\n");
      out.write("        <h4>ESTAMOS CONTRATANDO</h4>\n");
      out.write("        -->\n");
      out.write("        <p class=\"lead text-justify\">Bienvenido a My Company, aquí podrás encontrar ofertas de empleos \n");
      out.write("          que sean adecuados a tu perfil, experiencia y ubicación. \n");
      out.write("          Es muy fácil de usar, solo haz clic en una vacante, ingresa para ver los detalles y envíanos tu CV en formato \n");
      out.write("          PDF o DOCX. Nosotros revisaremos tu CV y posteriormente te contactaremos.<br><br>\n");
      out.write("\n");
      out.write("        <p><a class=\"btn btn-lg btn-success\" href=\"vacante?action=lista\" role=\"button\">Ver más Ofertas</a></p>                \n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <h1>Ofertas recientes</h1>\n");
      out.write("\n");
      out.write("      <!-- Example row of columns -->\n");
      out.write("      <div class=\"row\">\n");
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("\n");
      out.write("        <!--\n");
      out.write("        <div class=\"col-lg-4\">\n");
      out.write("          <h2>Oferta 2</h2>\n");
      out.write("          <p class=\"text-danger\">As of v8.0, Safari exhibits a bug in which resizing your browser horizontally causes rendering errors in the justified nav that are cleared upon refreshing.</p>\n");
      out.write("          <p class=\"text-justify\">Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>\n");
      out.write("          <p><a class=\"btn btn-primary\" href=\"#\" role=\"button\">View details &raquo;</a></p>\n");
      out.write("        </div>\n");
      out.write("        -->\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <!-- Site footer -->\n");
      out.write("      <footer class=\"footer\">\n");
      out.write("        <p>&copy; 2019 My Company, Inc.</p>\n");
      out.write("      </footer>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ultimas}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("vacante");
    _jspx_th_c_forEach_0.setVarStatus("status");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\n");
          out.write("          <div class=\"col-lg-4\">\n");
          out.write("            <h3>Vacante: [");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vacante.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("]</h3> \n");
          out.write("            <p class=\"text-danger\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vacante.nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>          \n");
          out.write("            <p class=\"text-justify\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vacante.descripcion}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("            <p><a class=\"btn btn-primary\" href=\"vacante?action=ver&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vacante.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" role=\"button\">Ver Detalles&raquo;</a></p>\n");
          out.write("          </div>\n");
          out.write("\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
