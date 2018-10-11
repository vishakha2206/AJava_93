
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class login_app extends HttpServlet 
{
     protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
    {
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        
        String n=req.getParameter("u_name");
        String p=req.getParameter("pwd");
        
        //out.println("Welcome.!!...");
        
        if("5IT".equals(n) && "Ajava".equals(p))
        {
            out.println("Welcome....You are logged in");
        }
        else
            out.println("Try again...");
     
       // out.println("Welcome....");
    }
}

    
   
   
    
   
