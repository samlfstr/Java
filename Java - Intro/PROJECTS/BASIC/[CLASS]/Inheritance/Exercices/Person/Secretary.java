package com.pluralsight;

public class Secretary extends Person {

    private String bureau_number;
    public String get_bureau_number(){ return this.bureau_number; }
    private int secretary_number;
    public int get_secretary_number(){ return this.secretary_number; }

    public Secretary(String name, String surname, String rue, String ville) {
        super(name, surname, rue, ville);
    }

    Secretary(String name, String surname, String rue, String ville, String bureau_number, int secretary_number) {
        super(name, surname, rue, ville);
        this.bureau_number = bureau_number;
        this.secretary_number = secretary_number;
        number_f_employees++;
    }

    public String toString(){
        return super.toString() + " | " + secretary_number + " | " + bureau_number;
    }

    @Override
    public void personInfo() {
        System.out.println("Secretary : " + toString());
    }


}
