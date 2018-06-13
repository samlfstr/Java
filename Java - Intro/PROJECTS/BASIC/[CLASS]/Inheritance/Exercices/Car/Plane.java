package com.pluralsight;

public class Plane extends Vehicle {

    private String motor;
    private int fly_hours;


    @Override
    public void ınfos() {
        System.out.println("Mark  : " + getMark() + "\n" + "Model : " + getModel() + "\n" +"Price : " + getPrice() + "\n" + "Tank  : " + getTank() + "\n" + "Motor : " + motor + "\n" + "Fly Hours : " + fly_hours + "\n"
        );
    }
}
