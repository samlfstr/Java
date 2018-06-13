package com.pluralsight;

public class Gun implements WeaponBehavior {
    @Override
    public void select() {
        System.out.println("Gun selected");
    }
}
