package com.pluralsight;

public class Car extends Vehicle {

    private double cylinder;
    private double power;
    private double km;
    private int number_of_doors;


    public double getCylinder() {
        return cylinder;
    }

    public double getPower() {
        return power;
    }

    public double getKm() {
        return km;
    }

    public int getNumber_of_doors() {
        return number_of_doors;
    }

    public Car() {
    }

    public Car(double cylinder, double power, double km, int number_of_doors) {
        this.cylinder = cylinder;
        this.power = power;
        this.km = km;
        this.number_of_doors = number_of_doors;
    }

    public Car(String mark, String model, Float price, Float tank, double cylinder, double power, double km, int number_of_doors) {
        super(mark, model, price, tank);
        this.cylinder = cylinder;
        this.power = power;
        this.km = km;
        this.number_of_doors = number_of_doors;
    }

    @Override
    public void ınfos() {
        System.out.println("Mark  : " + getMark()  + "\n" + "Model : " + getModel() + "\n" +"Price : " + getPrice() + "\n" + "Tank  : " + getTank() + "\n" + "Cylinder : " + cylinder + "\n" + "Power : " + power + "\n" + "Doors : " + number_of_doors + "\n" + "Km : "  + km
        );
    }
}
