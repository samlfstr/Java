public class Main {

    public static void main(String[] args) {



        App app = new App();
        app.createKingdom(App.FactoryMaker.makeFactory(App.FactoryMaker.KingdomType.ORC));
        System.out.println(app.getArmy().getDescription());



    }


}


