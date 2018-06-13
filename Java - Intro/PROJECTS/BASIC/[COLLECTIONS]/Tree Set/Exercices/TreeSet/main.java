package com.pluralsight;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<MyClass> treeSet = new TreeSet<>();

        treeSet.add(new MyClass("title","0"));
        treeSet.add(new MyClass("title","3"));
        treeSet.add(new MyClass("title","1"));
        treeSet.add(new MyClass("title","2"));

        treeSet.forEach(System.out::println);

    }
}
