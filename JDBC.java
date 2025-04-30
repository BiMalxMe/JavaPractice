import java.sql.*;

public class JDBC {
    public static void main(String[] args) {
        try {
            // loading the PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");

            // Establish the connection to neon db database
            Connection con = DriverManager.getConnection(
                    "jdbc:postgresql://ep-raspy-firefly-a4a1t3qd-pooler.us-east-1.aws.neon.tech/neondb?sslmode=require",
                    "neondb_owner",
                    "npg_zUN7dHeot2Fp"
            );

            // creating a statement object
            Statement st = con.createStatement();

            // writing a SQL query to create a table
            int result = st.executeUpdate("CREATE TABLE student (" +
                    "id INT, " +
                    "name TEXT, " +
                    "roll INT" +
                    ")");

            // Output success message
            System.out.println(result + " Table created");

            // Close the connection
            st.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
