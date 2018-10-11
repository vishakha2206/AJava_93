package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bean_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("        <h1>Hello Bean</h1>\n");
      out.write("           \n");
      out.write("        ");
      Bean.bean_1 test = null;
      synchronized (_jspx_page_context) {
        test = (Bean.bean_1) _jspx_page_context.getAttribute("test", PageContext.PAGE_SCOPE);
        if (test == null){
          test = new Bean.bean_1();
          _jspx_page_context.setAttribute("test", test, PageContext.PAGE_SCOPE);
          out.write(' ');
        }
      }
      out.write("\n");
      out.write("        ");
 
            test.setName("Vishakha");
            String name1= test.getName();
            out.println("Name set using getter and setter is "+name1);
            
            test.setId("16it093");
            String id1 = test.getId();
            out.println("    Id set using getter and setter is "+id1);
          
            
            test.setAge(20);
            int age1 = test.getAge();
            out.println("    Age set using getter and setter is "+age1);
        
      out.write("\n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("test"), "id", "5", null, null, false);
      out.write("\n");
      out.write("        <br>\n");
      out.write("       Id  is :  ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((Bean.bean_1)_jspx_page_context.findAttribute("test")).getId())));
      out.write(" \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "bean_2.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("       ");
      out.write("\n");
      out.write("        ");
      out.write("<" + "bean_xml.xml" + "/>");
      out.write("\n");
      out.write("      </body>\n");
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
