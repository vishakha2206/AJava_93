import java.net.*;
import java.io.*;
 
public class  Server_PC
{
	public static void main(String args[]) throws Exception
	{
            Socket sk;
            BufferedReader cin;
            PrintStream cout;
            BufferedReader stdin;
            try (ServerSocket ss = new ServerSocket(6000)) {
                sk = ss.accept();
                cin = new BufferedReader(new InputStreamReader(sk.getInputStream()));
                cout = new PrintStream(sk.getOutputStream());
                stdin = new BufferedReader(new InputStreamReader(System.in));
                String s;
                while (true)
                {
                    s=cin.readLine();
                    if (s.equalsIgnoreCase("END"))
                    {
                        cout.println("BYE");
                        break;
                    }
                    System. out.print("Client : "+s+"\n");
                    System.out.print("Server : ");
                    s=stdin.readLine();
                    cout.println(s);
                }
            }
 		sk.close();
 		cin.close();
		cout.close();
 		stdin.close();
	}

     //To change body of generated methods, choose Tools | Templates.
    }




