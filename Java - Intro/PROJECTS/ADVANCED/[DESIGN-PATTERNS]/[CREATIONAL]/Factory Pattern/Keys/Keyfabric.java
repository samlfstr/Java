package com.pluralsight;

public class KeyFabric {

    public Key CreateNewKey(String keyType){
        if (keyType == "Door") return new DoorKey();
        if (keyType == "Work") return new WorkKey();
        if (keyType == "Garage") return new GarageKey();
        else return null;
    }
}
