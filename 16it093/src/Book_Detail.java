import java.sql.*;
public class Book_Detail 
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver loaded Successfully");
        
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/book_detail","root","");
        System.out.println("Connection created successfully");
        
        Statement st=con.createStatement();
        
        String create_table="CREATE TABLE Book(Id varchar(20) Primary Key,Name varchar(50),Author varchar(50),Publication varchar(50),Price varchar(50))";
        System.out.println("Table Created Successfully");
        
       // int r1=st.executeUpdate(create_table);
        //st.executeUpdate(create_table);
        //System.out.println("hello");
        
        //String insert="INSERT INTO Book(Id,Name,Author,Publication,Price) VALUES('1','Half Girlfriend','Chetan Bhagat','Rupa &Co','400')";
        
       /* String insert="INSERT INTO Book(Id,Name,Author,Publication,Price) VALUES('2','3 Mistakes Of my Life','Chetan Bhagat','Rupa &Co','300'),('3','Revolution 2020','Chetan Bhagat','Rupa &Co','300')";
        System.out.println("Record inserted ");
        
        int r2=st.executeUpdate(insert);*/
        
       /* String update="UPDATE Book SET Id=4 WHERE Id=2";
        int r3=st.executeUpdate(update);
        System.out.println("Table updated successfully");*/
        
        /*String delete="DELETE FROM Book where Id=4";
        int r4=st.executeUpdate(delete);
        System.out.println("Record deleted ");*/
        
       /* String fetch="SELECT * FROM Book WHERE Price>300";
        ResultSet r5=st.executeQuery(fetch);
        System.out.println("Record fetched ");
        System.out.println(r5);
        
        while(r5.next())
        {
            System.out.println(r5.getString("Id")+" "+r5.getString("Name")+" "+r5.getString("Author")+" "+r5.getString("Publication")+" "+r5.getString("Price"));
        }
        */
       /* String alter="ALTER TABLE Book ADD Date_Time DateTime(6)";
        int r6=st.executeUpdate(alter);
        System.out.println("Table altered");*/
        
        String insert="INSERT INTO Book(Id,Name,Author,Publication,Price,Date_Time) VALUES('2','2 States','XYZ','Rupa &Co','500','NOW()')";
        int r7=st.executeUpdate(insert);
        System.out.println("Record inserted successfully");

        
        con.close();
    }
}
