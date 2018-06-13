package com.pluralsight;

public class Bus {

    private String mark;
    private String model;
    private final int seat_num = 65;
    private int seats = 0;
    private String id;

    public Bus(String mark, String model) {
        this.mark = mark;
        this.model = model;
    }

    public Person AddPassenger(){
        if(seats< seat_num && seats >= 0 && seats <= 15){
            seats++;
            id = seats + "A";
            return new Person(id);
        }
        // else if < 65 ...
        else return null;
    }


}
