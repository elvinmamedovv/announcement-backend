package az.mapacaademy.announcement.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/announcment_backend";
        String username = "root";
        String password = "root";
        return DriverManager.getConnection(url, username, password);
    }
}
