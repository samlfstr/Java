package com.pluralsight;

public abstract class Vehicle {

    private String mark, model;
    private Float price, tank;

    //region Getters
    public String getModel() {
        return model;
    }

    public Float getPrice() {
        return price;
    }

    public Float getTank() {
        return tank;
    }

    public String getMark() {
        return mark;
    }
    //endregion

    public Vehicle() {
    }

    public Vehicle(String mark, String model, Float price, Float tank) {
        this.mark = mark;
        this.model = model;
        this.price = price;
        this.tank = tank;
    }

    public void ınfos() {
        System.out.println("Mark  : " + mark + "\n" + "Model : " + model + "\n" + "Price : " + price + "\n" + "Tank  : " + tank);
    }
}
