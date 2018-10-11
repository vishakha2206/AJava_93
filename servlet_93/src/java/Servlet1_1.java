import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet1_1 extends HttpServlet 
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        
       response.setContentType("text/html");
       PrintWriter out=response.getWriter();
       out.println("Hello!!!! Good Morning.....\n");
       
       String name = request.getParameter("Emp_Name");
       if(name.equals("5IT"))
       {
           //response.sendRedirect("Servlet2");
           
           RequestDispatcher rd = request.getRequestDispatcher("Servlet2");
          // rd.include(request, response);
          
          rd.forward(request, response);
       }
       else
       {
           //response.sendRedirect("Servlet3");
           
           RequestDispatcher rd = request.getRequestDispatcher("Servlet3");
           //rd.include(request, response);
           
           rd.forward(request, response);
       }    
    }
    

}

//in redirect method we will be redirected to that page if the condition is true ie only servlet2 and contents of that page is only visible

//Include also includes the contents of that file

//Forward works like send redirect method only