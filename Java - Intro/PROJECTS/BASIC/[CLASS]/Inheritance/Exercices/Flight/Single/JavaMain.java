package com.pluralsight;

public class JavaMain {
    public static void main(String []args) {

        Flight flight = new Flight(50,5);
        Flight flight1 = new Flight(50,10);
        flight.createNewWithBoth(flight1);
        flight.addPessanger("jacky",71);
        flight.pessangerInfo();

    }
}
