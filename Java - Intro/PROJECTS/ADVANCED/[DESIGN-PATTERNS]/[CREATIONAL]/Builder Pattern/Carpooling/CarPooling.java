import java.util.ArrayList;
import java.util.Iterator;

// immutable class
public class CarPooling {

    // builder pattern

    private ArrayList<Double> dailyExpense = new ArrayList<>(365);
    private double totalExpense;
    private double daily_expense;

    private double milesPerDay;
    private double gallonPrice;
    private double averageMilesPerGallon;
    private double parkingFees;
    private double tollsPerDay;

    public CarPooling(Builder builder) {
        this.milesPerDay = builder.milesPerDay;
        this.gallonPrice = builder.gallonPrice;
        this.averageMilesPerGallon = builder.averageMilesPerGallon;
        this.parkingFees = builder.parkingFees;
        this.tollsPerDay = builder.tollsPerDay;
    }

    //region InternClass





    public static class Builder{

        private double milesPerDay;
        private double gallonPrice;
        private double averageMilesPerGallon;
        private double parkingFees;
        private double tollsPerDay;


        public Builder milesPerDay(double milesPerDay){
            this.milesPerDay = milesPerDay;
            return this;
        }

        public Builder gallonPrice(double gallonPrice){
            this.gallonPrice = gallonPrice;
            return this;
        }

        public Builder averageMilesPerGallon(double averageMilesPerGallon){
            this.averageMilesPerGallon = averageMilesPerGallon;
            return this;
        }

        public Builder parkingFees(double parkingFees){
            this.parkingFees = parkingFees;
            return this;
        }

        public Builder tollsPerday(double tollsPerDay){
            this.tollsPerDay = tollsPerDay;
            return this;
        }

        public CarPooling build(){
            return new CarPooling(this);
        }
    }
    //endregion

    //region Getters

    public double getMilesPerDay() {
        return milesPerDay;
    }

    public double getGallonPrice() {
        return gallonPrice;
    }

    public double getAverageMilesPerGallon() {
        return averageMilesPerGallon;
    }

    public double getParkingFees() {
        return parkingFees;
    }

    public double getToolsPerDay() {
        return tollsPerDay;
    }

    public double getDailyExpense() {
        return dailyExpense.get(dailyExpense.size() - 1);
    }

    public double getTotalExpense() {
        totalExpense = 0;
        final Iterator<Double> iterator = dailyExpense.iterator();
        while(iterator.hasNext()){
            totalExpense += iterator.next();
        }
        return totalExpense;
    }
    //endregion

    //region Setters
    public void setDailyExpense() {
        daily_expense += getMilesPerDay() + getGallonPrice() + getAverageMilesPerGallon() + getParkingFees() + getToolsPerDay();
        dailyExpense.add(daily_expense);
    }

    //endregion

}
