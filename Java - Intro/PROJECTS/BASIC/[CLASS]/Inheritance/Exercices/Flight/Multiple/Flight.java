public class Flight {

    private int passenger_number;
    private int seat_number = 250;
    private int actualPassengerNumber = 0;

    public int get_passenger_number(){ return this.passenger_number; }
    public void set_passenger_number(int passenger_number){ this.passenger_number = passenger_number; }

    public int get_seat_number(){ return this.seat_number; }
    public void set_seat_number(int seat_number){ this.seat_number = seat_number; }

    public Flight() {

    }

    public void addPassenger(){

        if (hasSeat()) passenger_number++;
        else System.out.println("There is no seat available");
    }

    private boolean hasSeat(){
        return get_passenger_number() < get_seat_number();
    }

}
