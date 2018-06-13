
public class Main {

    public static void main(String[] args) {

        float time;
        Vehicle vehicle = new Vehicle(5,50);
        Position2D posA = new Vehicle(0.0,0.0);
        Position2D posB = new Vehicle(90.0,100.0);
        time = (float)vehicle.Time(posA,posB);
        System.out.println("Time : " + time);

    }
}
