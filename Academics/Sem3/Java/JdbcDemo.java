import java.sql.*;
 
public class JdbcDemo
 
{
 
public static void main(String[] args) 
 
 
{
 
try
 
{
 
Connection con = DriverManager.getConnection("jdbc:ucanaccess://db1.accdb"); 
 
Statement s = con. createStatement(); // Create Statement
 
String query = "select * from Student"; // Create Query
 
s.execute(query); // Execute Query
 
ResultSet rs = s.getResultSet(); //return the data from Statement into ResultSet
 
while(rs.next()) // Retrieve data from ResultSet
 
{
 
System.out.println("Serial number : "+rs.getInt(1)); //1st column of Table
 
System.out.println(" Roll Number : "+rs.getString(2)); //2nd column of Table 
 
System.out.println(" Name: "+rs.getString(3)); //3rd column of Table 
 
}
 
s.close();
 
con.close();
 
}
 
catch (Exception e) 
 
{
 
System.out.println("Exception : "+e);
 
}
 
}
 
}
