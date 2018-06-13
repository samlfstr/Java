public class PremiumMenu implements MenuFactory {
    @Override
    public Hamburger CreateHamburger() {
        return new BigMac();
    }

    @Override
    public Fries CreateFries() {
        return new ThickCut();
    }

    @Override
    public Coke CreateCoke() {
        return new CokeZero();
    }
}
