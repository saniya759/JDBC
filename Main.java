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
