package prac;
import java.sql.*;

public class JDBCDemo {
 public static void main(String[] args)
 {
     // Database URL, username, and password

     // Replace with your database name
     String url
         = "jdbc:mysql://localhost:3306/practice_db";

     // Replace with your MySQL username
     String username = "root";

     // Replace with your MySQL password
     String password = "root";

     // Updated query syntax for modern databases
     String query
         = "INSERT INTO emp (firstname, lastname, salary, address) VALUES ('Aayu', 'Tiwari', 15000, 'Indore')";

     // Establish JDBC Connection
     try {
       
         // Load Type-4 Driver
         // MySQL Type-4 driver class
         Class.forName("com.mysql.cj.jdbc.Driver");

         // Establish connection
         Connection c = DriverManager.getConnection(url, username, password);

         // Create a statement
         Statement st = c.createStatement();

         // Execute the query
         int count = st.executeUpdate(query);
         System.out.println(
             "Number of rows affected by this query: "
             + count);

         // Close the connection
         st.close();
         c.close();
         System.out.println("Connection closed.");
     }
     catch (ClassNotFoundException e) {
         System.err.println("JDBC Driver not found: "
                            + e.getMessage());
     }
     catch (SQLException e) {
         System.err.println("SQL Error: "
                            + e.getMessage());
     }
 }
}

