package com.pluralsight;

import java.util.ArrayList;

public class Book implements Library {

    private String name;

    public String getName() {
        return name;
    }

    private String catgry;

    public String getCatgry() {
        return catgry;
    }

    private ArrayList<String> books = new ArrayList<>();

    Book() { }

    @Override
    public String authorName(String name) {

        return this.name = name;
    }

    @Override
    public void category(Category category) {
        switch (category){

            case ADVENTURE:
                catgry = Category.ADVENTURE.toString();
                break;

            case HORROR:
                catgry = Category.HORROR.toString();
                break;

            case THRILLER:
                catgry  = Category.THRILLER.toString();
                break;
        }
    }

    @Override
    public void addBook() {
        try {
            books.add(name + "," + catgry);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void showBooks(){
        for(String items : books){
            System.out.println(items);
        }
    }



}
