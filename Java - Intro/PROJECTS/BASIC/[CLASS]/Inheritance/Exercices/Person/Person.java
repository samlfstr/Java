package com.pluralsight;

public abstract class Person {
    
    private String name;
    public String get_name(){ return this.name; }
    private String surname;
    public String get_surname(){ return this.surname; }
    private String rue;
    public String get_rue(){ return this.rue; }
    private String ville;
    public String get_ville(){ return this.ville; }
    static int number_f_employees;

    Person(String name, String surname, String rue, String ville) {
        this.name = name;
        this.surname = surname;
        this.rue = rue;
        this.ville = ville;
    }

    public String toString(){
        return name + " | " + surname + " | " + rue + " | " + ville;
    }

    public static void info() {
        System.out.println("Number of employees :" + number_f_employees);
    }

    public abstract void personInfo();
    
}
