package com.pluralsight;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Employees employees = new Employees();
        employees.loadData();

        Employees employees1 = (Employees) employees.clone();
        Employees employees2 = (Employees) employees.clone();

        ArrayList<String> x = employees1.getEmp_list();
        x.add("Mother Fuckers");
        ArrayList<String> y = employees2.getEmp_list();
        y.remove(0);

        y.forEach(System.out::println);


    }
}
