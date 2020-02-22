package hotel;

import java.sql.*;
public class SQL_Connect {
    public static Connection connectDB() 
{
Connection conn=null;
try
{
Class.forName("com.mysql.jdbc.Driver"); //Register the driver

conn = DriverManager.getConnection("jdbc:mysql://localhost/hotelm","root", "");
System.out.print("Database is connected !");
//Statement stt = conn.createStatement();
return conn;
}
catch(Exception e)
{
System.out.print("Do not connect to DB - Error:"+e);
return null;
} 
}

    static Connection ConnectDB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
