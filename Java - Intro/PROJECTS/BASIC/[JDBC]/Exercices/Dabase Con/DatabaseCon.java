package com.pluralsight;
import com.mysql.jdbc.Connection;

import java.sql.DriverManager;

public class DatabaseCon {

    private static volatile DatabaseCon instance = null;
    private static volatile Connection connection = null;

    private DatabaseCon() {
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (connection != null) throw new RuntimeException("Please use getConnection method");
        if (instance != null) throw new RuntimeException("Please use getInstance method");
    }

    public static DatabaseCon getIns() {
        if (instance == null) {
            synchronized (DatabaseCon.class) {
                if (instance == null) {
                    instance = new DatabaseCon();
                }
            }
        }
        return instance;
    }

    public static Connection getCon(){
        if(connection == null){
            synchronized (DatabaseCon.class){
                if(connection == null){
                    String data_base_url = "jdbc:mysql://localhost:3306/library?verifyServerCertificate=false&useSSL=true";
                    String user_name = "root";
                    String pass = "samlfstr.FR0";

                    try{
                        connection = (Connection) DriverManager.getConnection(data_base_url,user_name,pass);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
        return connection;
    }



}
