import com.mysql.cj.jdbc.*;
import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConDB {
    private static volatile Connection connection = null;

    public ConDB() {
        try {
            if(connection == null) {
                Class.forName("com.mysql.jdbc.Driver");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(String db_name, String user_name, String password) {


        String data_base_url = "jdbc:mysql://localhost:3306/"+db_name+"?verifyServerCertificate=false&useSSL=true&serverTimezone=UTC";

        if(connection == null){
            synchronized (ConDB.class){
                if(connection == null){
                    try {
                        connection = DriverManager.getConnection(data_base_url, user_name,password);
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }

        return connection;
    }
}
