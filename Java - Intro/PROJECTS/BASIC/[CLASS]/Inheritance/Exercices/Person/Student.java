package com.pluralsight;

public class Student extends Person{

    private String field_f_study;
    public String get_field_f_study(){ return this.field_f_study; }

    Student(String name, String surname, String rue, String ville) {
        super(name, surname, rue, ville);
    }

    public Student(String name, String surname, String rue, String ville, String field_f_study) {
        super(name, surname, rue, ville);
        this.field_f_study = field_f_study;
    }

    public String toString(){
        return super.toString() + " | " + field_f_study;
    }

    @Override
    public void personInfo() {
        System.out.println("Student : " + toString());
    }
}
