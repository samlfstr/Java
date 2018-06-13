package com.pluralsight;

public class ShutGun implements WeaponBehavior {
    @Override
    public void select() {
        System.out.println("Weapon selected");
    }
}
