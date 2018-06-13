package com.pluralsight;

public class Main {

    public static void main(String[] args){

        Library l1 = new Book();
        l1.authorName("Jamel");
        l1.category(Category.HORROR);
        l1.addBook();
        l1.authorName("Samuel");
        l1.category(Category.ADVENTURE);
        l1.addBook();
        l1.authorName("Post Malone");
        l1.category(Category.THRILLER);
        l1.addBook();
        l1.showBooks();


    }
}
