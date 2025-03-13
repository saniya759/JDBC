JDBC (Java Database Connectivity)

Overview
JDBC is an API that enables Java applications to interact with databases. It allows you to connect to a database, execute SQL queries, and process the results.

How It Works (In Simple Steps):
-Load the JDBC Driver → Helps Java understand how to connect to a database.
-Create a Connection → Java connects to the database.
-Execute Queries → Send commands (SQL queries) to the database.
-Get Results → Receive data from the database.
-Close the Connection → Disconnect from the database.

Example:
Here’s a simple example of using JDBC to connect to a MySQL database and retrieve data:

import java.sql.*;
class JDBC {
    public static void main(String args[]) {
        try {
            // 1.Load and register the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2.Opening database connection to mysql driver
           Connection con = DriverManager.getConnection("jdbc:mysql:///event?useSSL=false", "root", "root");

            // 3.getting statement object to execute query
            Statement st = con.createStatement();

            //4. execute query
            String q = "INSERT INTO eventregistration VALUES ('1', '2', '3', '4')";

          
            st.executeUpdate(q);

            //5. Success message
            System.out.println("Data inserted successfully");

            // 6. Close connection
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

