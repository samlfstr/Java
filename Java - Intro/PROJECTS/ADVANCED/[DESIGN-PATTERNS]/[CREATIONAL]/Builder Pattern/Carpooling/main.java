
public class Main {

    public static void main(String[] args){

        CarPooling.Builder builder = new CarPooling.Builder();
        builder.averageMilesPerGallon(23.6).gallonPrice(12).milesPerDay(23).parkingFees(5).tollsPerday(10);
        CarPooling car = builder.build();
        car.setDailyExpense();
        System.out.println(car.getDailyExpense());


    }
}
