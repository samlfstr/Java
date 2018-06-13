package com.pluralsight;

public class WebsiteFactory {
    public static WebSite getWebSite(WebSiteType type){
        switch (type){

            case BLOG:
                return new Blog();
            case SHOP:
                return new Shop();
            default:
                return null;
        }
    }
}
