package com.pluralsight;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDb {

    // Volatile for thread safe
    private static volatile Connection connection = null;

    // Class Knowledge
    public ConnectionDb() {
        try {
            Class.forName("com.mysql.jdbc.Connection");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Getter for connection parameter
    public static Connection getConnection(String db_name, String user_name, String password) {

        String data_base_url = "jdbc:mysql://localhost:3306/"+db_name+"?verifyServerCertificate=false&useSSL=true";

        if (connection == null) {
            synchronized (ConnectionDb.class) {
                if (connection == null) {

                    try {
                        connection = (Connection) DriverManager.getConnection(data_base_url, user_name,password);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        return connection;
    }

}