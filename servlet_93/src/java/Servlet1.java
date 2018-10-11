import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet1 extends HttpServlet 
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
       response.setContentType("text/html");
       PrintWriter out=response.getWriter();
       out.println("Hello!!!! Good Morning.....\n");
       
       //Context Parameter
       String context = getServletContext().getInitParameter("Name");
       out.println(context);
       
       String config = getServletConfig().getInitParameter("Id");
       out.println(config);
    }

}
