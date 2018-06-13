public class SimpleMenu implements MenuFactory {
    @Override
    public Hamburger CreateHamburger() {
       return new RoyalChees();
    }

    @Override
    public Fries CreateFries() {
        return new WaffleFries();
    }

    @Override
    public Coke CreateCoke() {
        return new CokeClassic();
    }
}
