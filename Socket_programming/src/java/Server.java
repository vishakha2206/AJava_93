
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server 
{
    public static void main(String[] args) throws IOException 
    {
        try  
        {
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept(); //establishes connection
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = dis.readUTF();
            System.out.println("Message is "+str);
        } 
        catch(IOException ee)
        {
            System.out.println("Exception is "+ee);
        }
        
    }
}
