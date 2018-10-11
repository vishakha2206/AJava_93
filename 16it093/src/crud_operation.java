import java.sql.*;
public class crud_operation 
{
    public static void main(String[] args) throws SQLException 
    {
        Connection con=null;
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver loaded Successfully");
        
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/16it093","root","");
        System.out.println("Connection created successfully");
        
        Statement st=con.createStatement();     
         //String str="INSERT INTO crud_op(Id,Name) VALUES(1,'Aastha')";  
        //String str="UPDATE crud_op SET Id=3 WHERE Id=2";  
        
        String str="SELECT * FROM crud_op";
        
        //String str="DELETE FROM crud_op WHERE Id='3'";                                                                                                                          
        System.out.println("Data created  Successfully");
        
        //st.executeUpdate(str);
        //st.executeQuery(str);
        ResultSet rs= st.executeQuery(str);
        System.out.println(rs);
        
        
        while(rs.next())
        {
           // System.out.println(rs.getString(1));
            System.out.println(rs.getString("Id")+"   " +rs.getString("Name"));
             //System.out.println(rs.getArray("Name"));
        }
        
     /* String s1=rs.getArray("Name");
        System.out.println(s1);*/
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
        
        //con.commit();
        finally
        {
            try
            {
                con.close();
            }
            
            catch(Exception e)
            {
                System.out.println("Connection closed");
            }
        }
    }
}
