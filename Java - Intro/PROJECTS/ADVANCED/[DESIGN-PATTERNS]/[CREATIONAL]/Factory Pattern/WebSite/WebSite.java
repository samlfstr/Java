package com.pluralsight;

import java.util.ArrayList;

abstract class WebSite {

    public ArrayList<Page> getPages() {
        return pages;
    }

    ArrayList<Page> pages = new ArrayList<>();


    WebSite() {
        this.createWebSite();
    }

    abstract void createWebSite();


}
