package com.pluralsight;

public class Arrow implements WeaponBehavior  {
    @Override
    public void attack() {
        System.out.println("Attack with arrow");
    }

    @Override
    public void perform() {
        System.out.println("Arrow chosen");
    }
}
