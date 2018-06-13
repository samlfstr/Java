package com.pluralsight;


public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        inventory.addNewProduct(new Product(45f,"1"));
        inventory.addNewProduct(new Product(35f,"2"));
        inventory.addNewProduct(new Product(25f,"3"));
        inventory.addNewProduct(new Product(15f,"4"));


        inventory.removeFromList("1");
        inventory.showListOfProducts();



    }


}
