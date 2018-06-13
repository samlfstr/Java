package com.pluralsight;

public class Shop extends WebSite {
    @Override
    void createWebSite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new ContactPage());
    }
}
