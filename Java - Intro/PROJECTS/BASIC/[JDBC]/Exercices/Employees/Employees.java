package com.pluralsight;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Employees implements Cloneable {

    private ArrayList<String> emp_list;

    Employees() {
        emp_list = new ArrayList<>();
    }

    private Employees(ArrayList<String> emp_list) {
        this.emp_list = emp_list;
    }

    public void loadData(){

        String mysql = "select first_name from person.info";


        try(Connection connection = ConnectionDb.getConnection("person","root","samlfstr.FR0")){

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(mysql);

            while(resultSet.next()){
                emp_list.add(resultSet.getString("first_name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object o = super.clone();
        ArrayList<String> temp = new ArrayList<>(this.getEmp_list());
        return new Employees(temp);
    }

    ArrayList<String> getEmp_list() {
        return emp_list;
    }

    public void showElements() {
       emp_list.forEach(System.out::println);
    }
}
