public class DietMenu implements MenuFactory{
    @Override
    public Hamburger CreateHamburger() {
        return new McChicken();
    }

    @Override
    public Fries CreateFries() {
        return new FrenchFries();
    }

    @Override
    public Coke CreateCoke() {
        return new CokeLight();
    }

}
