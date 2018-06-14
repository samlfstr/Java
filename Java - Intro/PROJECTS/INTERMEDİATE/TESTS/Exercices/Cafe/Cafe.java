/**
 * A coffee shop that can brew coffee and maintains an internal stock of beans and milk.
 */
public final class Cafe {

    private int beansInStock = 0;
    private int milkInStock = 0;

    public Coffee brew(CoffeeType coffeeType) {
        return brew(coffeeType, 1);
    }

    public Coffee brew(CoffeeType coffeeType, int strength) {
        requirePositive(strength);

        int requiredBeans = coffeeType.getRequiredBeans() * strength;
        int requiredMilk = coffeeType.getRequiredMilk() * strength;
        if (requiredBeans > beansInStock || requiredMilk > milkInStock) {
            throw new IllegalStateException();
        }

        beansInStock -= requiredBeans;
        milkInStock -= requiredMilk;
        return new Coffee(coffeeType, requiredBeans, requiredMilk);
    }

    //region restock
    public void restockBeans(int weightInGrams) {
        requirePositive(weightInGrams);
        beansInStock += weightInGrams;
    }

    public void restockMilk(int weightInGrams) {
        requirePositive(weightInGrams);
        milkInStock += weightInGrams;
    }
    //endregion
    //region require positive
    private void requirePositive(int value) {
        if (value < 1) {
            throw new IllegalArgumentException();
        }
    }
    //endregion
    //region getters
    public int getBeansInStock() {
        return beansInStock;
    }

    public int getMilkInStock() {
        return milkInStock;
    }
    //endregion











}