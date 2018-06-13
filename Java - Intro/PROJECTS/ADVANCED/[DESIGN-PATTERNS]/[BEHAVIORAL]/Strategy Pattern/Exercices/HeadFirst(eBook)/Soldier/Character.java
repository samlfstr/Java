package com.pluralsight;

public abstract class Character {

    WeaponBehavior weaponBehavior;

    void performInstallation() {
        weaponBehavior.perform();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }


}
