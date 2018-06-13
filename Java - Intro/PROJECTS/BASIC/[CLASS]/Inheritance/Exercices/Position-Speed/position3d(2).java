public class Position3D extends Position2D {

    //region Variables
    private double z;
    //endregion

    //region Props
    public double get_z(){ return this.z; }
    public void set_z(double z){ this.z = z; }

    //endregion

    //region Ctor
    public Position3D() {
    }

    public Position3D(double x, double y) {
        super(x, y);
    }

    public Position3D(double x, double y, double z){
        super(x, y);
        this.set_z(z);
    }
    //endregion

    //region Methods
    public double Distance3D(Position3D pos){
        double posA = Distance2D(pos), posB = get_z() - pos.get_z();
        return posA + (posB*posB);

    }

    //endregion







}
