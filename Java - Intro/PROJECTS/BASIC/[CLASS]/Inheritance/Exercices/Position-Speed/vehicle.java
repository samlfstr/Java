public class Vehicle extends Position3D {

    private int passengerNumber;
    // time = distance / speed
    private double speed, result;

    public int get_passengerNumber(){ return this.passengerNumber; }
    public void set_passengerNumber(int passengerNumber){ this.passengerNumber = passengerNumber; }
    public double get_speed(){ return this.speed; }
    public void set_speed(double speed){ this.speed = speed; }



    public Vehicle(double x, double y, double z) {
        super(x, y, z);
    }

    Vehicle(double x, double y) {
        super(x, y);
    }

    public Vehicle(int passengerNumber, double speed){
        this.passengerNumber = passengerNumber;
        this.speed = speed;
    }

    public double Time(Position2D posA, Position2D posB){
      double distance = posA.Distance(posB);
      return distance / speed;
    }

}
