import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet3 extends HttpServlet 
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
       response.setContentType("text/html");
       PrintWriter out=response.getWriter();
       out.println("Hello!!!! This is servlet 3\n");
      
    }

}
