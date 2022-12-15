


import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;



public class Security {
    private Connection c;
    protected final String url="jdbc:sqlserver://localhost:1433;databaseName=LMS;user=sa;password={123};encrypt=true;trustServerCertificate=true";
    public Connection connect() throws SQLException{
       return DriverManager.getConnection(url); 
    }
}
