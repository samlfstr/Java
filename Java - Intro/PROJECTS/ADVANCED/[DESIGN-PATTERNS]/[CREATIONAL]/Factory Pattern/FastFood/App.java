/*
* Created by Isa 16.1.2018 07:17
*/
public class App {

    private Coke coke;
    private Fries fries;
    private Hamburger hamburger;

    //region Props

    public Coke get_coke(){ return this.coke; }
    public void set_coke(Coke coke){ this.coke = coke; }

    public Fries get_fries(){ return this.fries; }
    public void set_fries(Fries fries){ this.fries = fries; }

    public Hamburger get_hamburger(){ return this.hamburger; }
    public void set_hamburger(Hamburger hamburger){ this.hamburger = hamburger; }

    //endregion
    //region Creator
    public void createMenu(final MenuFactory main_factory){
        set_coke(main_factory.CreateCoke());
        set_fries(main_factory.CreateFries());
        set_hamburger(main_factory.CreateHamburger());
    }
    //endregion

    public static class FactoryMaker{
       public enum MenuType {
           PREMIUM,
           SIMPLE,
           DIET
       }

           public static MenuFactory makeMenu(MenuType type){
           switch (type){

               case PREMIUM:
                   return new PremiumMenu();

               case SIMPLE:
                   return new SimpleMenu();

               case DIET:
                   return new DietMenu();

               default:
                   throw new IllegalArgumentException("Wrong menu type");
           }
       }


    }




}
