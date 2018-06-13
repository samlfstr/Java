public class Position3D extends Position2D {

    private double z, result;

    public Position3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Position3D() {
    }

    Position3D(double x, double y) {
        super(x, y);
    }

    double Distance(Position3D newPos){
        double disA = x - newPos.x, disB = y - newPos.y, disZ = z - newPos.z;
        return result = ((disA*disA)+(disB*disB)+(disZ*disZ));

    }
    void ShowPosition(){
        System.out.print("New position is: " + result);
    }


}
