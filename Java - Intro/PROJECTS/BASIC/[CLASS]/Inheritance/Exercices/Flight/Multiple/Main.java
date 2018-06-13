public class Main {
    public static void main(String[] args){
        Flight f1 =  new CargoFlight();

        for (int i = 0; i < 15; i++) {
            f1.addPassenger();
        }
        f1.addPassenger();
        System.out.println(f1.get_passenger_number());
        System.out.println(f1.get_seat_number());
    }
}
