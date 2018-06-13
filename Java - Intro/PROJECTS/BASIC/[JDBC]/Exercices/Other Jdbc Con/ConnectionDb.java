package com.pluralsight;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDb {

    private static volatile Connection connection = null;

    private ConnectionDb() {
        try{
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (connection != null) throw new RuntimeException("Please use getConnection method");
    }

    public static Connection getConnection() {
        if(connection == null){
            synchronized (ConnectionDb.class){
                if(connection == null){

                    String data_base_url = "jdbc:mysql://localhost:3306/person?verifyServerCertificate=false&useSSL=true";
                    String db_user_name = "root";
                    String db_pass = "samlfstr.FR0";

                    try {
                        connection = (Connection) DriverManager.getConnection(data_base_url,db_user_name,db_pass);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                }
            }
        }

        return connection;
    }


}
