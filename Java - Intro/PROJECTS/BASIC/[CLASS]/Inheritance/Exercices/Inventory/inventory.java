package com.pluralsight;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {

    //region Fields
    private final int MAX_LIST_SIZE = 100;
    private int number_f_products;
    private int general_price;
    private List<Product> productList = new ArrayList<>(MAX_LIST_SIZE);

    //endregion

    //region Getters & Setters

    public int getGeneral_price() {
        return general_price;
    }

    public int getNumber_f_products() {
        return number_f_products;
    }

    //endregion

    //region Ctor

    public Inventory() {

    }

    //endregion

    //region Behaviors
    public void addNewProduct(Product product){
        if(productList.size() < MAX_LIST_SIZE) {
            productList.add(product);
            number_f_products++;
        }
    }

    public void showListOfProducts(){
        productList.forEach(System.out::println);
    }

    public void removeFromList(int index){
        if (productList.size() > 0){
            productList.remove(index);
        }
    }

    public void removeFromList(String id){
        final Iterator<Product> iterator = productList.iterator();
        if (productList.size() > 0){
            while(iterator.hasNext()){
                Product product = iterator.next();
                if (product.getProduct_id().equals(id)){
                    iterator.remove();
                }
            }
        }
    }


    //endregion


}
