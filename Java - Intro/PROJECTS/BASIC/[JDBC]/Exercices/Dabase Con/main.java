package com.pluralsight;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Main {

    public static void main(String[] args) {

        Connection connection = DatabaseCon.getCon();
        String mysqlStatement = "insert into library.categories values (default,'JRR','Tolkien');";

        try{

            Statement statement = (Statement) connection.createStatement();
            int setResult = statement.executeUpdate(mysqlStatement);


        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
