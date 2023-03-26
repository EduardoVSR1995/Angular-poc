package bankConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class bankConection {
    private static String url = "jdbc:mysql://localhost:4000/location";
    private static String user = "mysql";
    private static String password = "ex";
    public static Connection connectionBack;
    
    public static Connection connection() throws Exception{
        try {
            if(connectionBack != null) return connectionBack; 
            
            connectionBack = DriverManager.getConnection(url, user, password);
            
            return connectionBack;
        } catch (SQLException e) {
            throw new Error("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }
}
