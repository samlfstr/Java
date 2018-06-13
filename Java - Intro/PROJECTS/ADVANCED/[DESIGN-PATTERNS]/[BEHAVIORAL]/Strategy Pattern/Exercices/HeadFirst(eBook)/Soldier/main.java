package com.pluralsight;

public class Main {

    public static void main(String[] args){

        Character queen = new Queen();
        queen.performInstallation();
        queen.weaponBehavior.attack();
        queen.setWeaponBehavior(new Arrow());
        queen.weaponBehavior.attack();
    }

}
