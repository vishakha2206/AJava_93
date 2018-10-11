
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class registration_fetch extends HttpServlet 
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
        String name=request.getParameter("Name");
        String sem=request.getParameter("Semester");
        String gen=request.getParameter("radio");
        String sub=request.getParameter("Subjects");
        
             String[] values=request.getParameterValues("checkbox");
            out.println("Selected Values...");
            for(int i=0;i<values.length;i++)
            {
                out.println("<li>"+values[i]+"</li>");
            }

        
        
        out.println("done");
         out.println("\nName is :" + name);
          out.println("\nSemester is " +sem);
           out.println(gen);
            out.println(sub);
    }
}

    
    
   