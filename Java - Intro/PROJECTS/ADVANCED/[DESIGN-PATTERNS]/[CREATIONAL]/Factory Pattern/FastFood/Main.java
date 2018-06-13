public class Main {

    public static void main(String[] args) {

        App app = new App();
        app.createMenu(App.FactoryMaker.makeMenu(App.FactoryMaker.MenuType.SIMPLE));

        System.out.println(app.get_coke().getDescription());
        System.out.println(app.get_fries().getDescription());
        System.out.println(app.get_hamburger().getDescription());

    }
    
}


