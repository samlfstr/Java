package com.pluralsight;

public class Main {

    public static void main(String[] args) {

        Person secretary = new Secretary("Jane","Salop","Baker St.","London","24",495);
        secretary.personInfo();
        Person student = new Student("Jane","Salop","Baker St.","London","Engineering");
        student.personInfo();
       System.out.println("Number of employees : "+Person.number_f_employees);

    }


}
