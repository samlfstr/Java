package com.pluralsight;

public class JavaMain {
    public static void main(String []args) {
        Bus bus = new Bus("Mercedes","clr");
        Person person = bus.AddPassenger();
        person.Infos();

    }

}

