package com.pluralsight;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import java.sql.SQLException;

public class Person {

    private String first_name;
    private String last_name;
    private int age;

    public Person(Builder builder) {
        this.first_name = builder.first_name;
        this.last_name = builder.last_name;
        this.age = builder.age;
    }

    public static class Builder{

        private String first_name;
        private String last_name;
        private int age;

        public Builder first_name(String first_name){
            this.first_name = first_name;
            return this;
        }

        public Builder last_name(String last_name){
            this.last_name = last_name;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }


        public Person build(){
            return new Person(this);
        }
    }


    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getAge() {
        return age;
    }


    public void Insertion(){

        Connection connection = ConnectionDb.getConnection();

        try {
            Statement statement = (Statement) connection.createStatement();
            int resultSet = statement.executeUpdate("insert into person.info values (DEFAULT,'"+getFirst_name()+"','"+getLast_name()+"','"+getAge()+"');");
        } catch (SQLException e) {
            e.getStackTrace();
        }

    }
}
