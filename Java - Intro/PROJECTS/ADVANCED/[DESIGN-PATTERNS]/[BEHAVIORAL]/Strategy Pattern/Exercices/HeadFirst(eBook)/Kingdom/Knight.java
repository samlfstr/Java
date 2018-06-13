package com.pluralsight;

public class Knight extends Character {
    public Knight() {
        weaponBehavior  = new Knife();
    }

    @Override
    void attack() {
        weaponBehavior.select();
    }
}
