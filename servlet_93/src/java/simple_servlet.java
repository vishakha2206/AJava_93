import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class simple_servlet extends HttpServlet 
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
       response.setContentType("text/html");
       PrintWriter out=response.getWriter();
       out.println("Hello!!!! Good Morning.....");
       
        String context = getServletContext().getInitParameter("Name");
       out.println(context);
       
       //here the config parameter will not appear bez we have declared it in servlet1
       String config = getServletConfig().getInitParameter("Id");
       out.println(config);
    }

}
