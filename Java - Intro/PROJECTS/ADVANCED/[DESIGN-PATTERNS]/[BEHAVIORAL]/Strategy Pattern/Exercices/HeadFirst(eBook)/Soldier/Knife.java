package com.pluralsight;

public class Knife implements WeaponBehavior {
    @Override
    public void attack() {
        System.out.println("Attack with knife");
    }

    @Override
    public void perform() {
        System.out.println("Knife chosen");
    }
}
