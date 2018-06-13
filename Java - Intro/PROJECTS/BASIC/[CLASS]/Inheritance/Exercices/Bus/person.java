package com.pluralsight;

public class Person {
    private String id;
    // ctor
    public Person(String id) {
        this.id = id;
    }
    public void Infos(){
        System.out.print("Id : ");
        System.out.print(id);
        System.out.print("\n");
    }
}
