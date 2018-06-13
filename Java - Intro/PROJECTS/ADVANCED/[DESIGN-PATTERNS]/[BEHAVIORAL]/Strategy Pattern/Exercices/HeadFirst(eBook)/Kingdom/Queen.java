package com.pluralsight;

public class Queen extends Character {

    public Queen() {
        weaponBehavior = new Knife();
    }

    @Override
    void attack() {
        weaponBehavior.select();
    }
}
