package com.pluralsight;

public class Product {

    //region Fields
    private float price;
    private String product_id;
    //endregion

    //region Getters & Setters

    public float getPrice() {
        return price;
    }

    public String getProduct_id() {
        return product_id;
    }
    //endregion

    //region Ctors


    public Product() {
    }

    public Product(float price, String product_id) {
        this.price = price;
        this.product_id = product_id;
    }

    //endregion

    //region Behaviors

      @Override
    public String toString() {
        return String.format("Product id : %s | Price : %.1f",getProduct_id(),getPrice());
    }


    //endregion
}
