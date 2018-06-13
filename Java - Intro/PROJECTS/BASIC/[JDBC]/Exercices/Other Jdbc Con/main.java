package com.pluralsight;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        Person.Builder builder = new Person.Builder();
        builder.first_name("Samuel").last_name("Foster").age(23);
        Person person = builder.build();
        person.Insertion();


    }
}
