package com.pluralsight;

public class Flight {

    private int seats;
    private int pessenger;
    private String pessanger_name;
    private int pessanger_id;
    private int totalPassenger;

    Flight(){

    }

    Flight(int seats, int pessenger){
        this.pessenger = pessenger;
        this.seats = seats;
    }

    public void addPessanger(String pessanger_name, int pessanger_id){
        if (pessenger < seats) {
            pessenger += 1;
            this.pessanger_id = pessanger_id;
            this.pessanger_name = pessanger_name;
        } else System.out.print("There is no enougth place");
    }

    private boolean hasRoom(Flight f){
        int total = pessenger + f.pessenger;
        return total <= seats;
    }

    public Flight createNewWithBoth(Flight flight){
            Flight newf = new Flight();
            newf.seats = seats;
            newf.pessenger = pessenger + flight.pessenger;
            totalPassenger = newf.pessenger;
            return newf;
    }

    public void pessangerInfo(){
        System.out.print("Number of pessangers : ");
        System.out.print(totalPassenger);
        System.out.print("\n");
        System.out.print("Pessanger name : ");
        System.out.print(pessanger_name);
        System.out.print("\n");
        System.out.print("Pessanger id : ");
        System.out.print(pessanger_id);
    }

}
