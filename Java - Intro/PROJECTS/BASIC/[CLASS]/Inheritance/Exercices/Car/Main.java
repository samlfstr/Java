package com.pluralsight;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Vehicle car = new Car("Mercedes","slr Mclaren",450.000f,35f,21f,450,310,4);
        Vehicle car1 = new Car("Ferrari","slr Mclaren",450.000f,35f,21f,450,310,4);
        Vehicle car2 = new Car("Lamborghini","slr Mclaren",450.000f,35f,21f,450,310,4);


        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(car1);
        vehicles.add(car2);

        for (Vehicle vehicle : vehicles) {
            vehicle.ınfos();
            System.out.println("");
        }


    }
}
