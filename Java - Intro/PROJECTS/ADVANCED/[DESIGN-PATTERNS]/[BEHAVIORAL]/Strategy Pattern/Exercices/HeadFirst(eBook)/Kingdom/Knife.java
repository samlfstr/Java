package com.pluralsight;

public class Knife implements WeaponBehavior {

    @Override
    public void select() {
        System.out.println("Knife selected");
    }

}
