/*
* Created by Samuel Foster
* 30.12.2017
* 18:44
*/
abstract class Position2D {

   //region Variables
    private double x;
    private double y;
   //endregion

    //region Props
    public double get_x(){ return this.x; }
    public void set_x(double x){ this.x = x; }
    public double get_y(){ return this.y; }
    public void set_y(double y){ this.y = y; }
    //endregion

    //region Ctor
    public Position2D() {
    }

    public Position2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //endregion

    //region Methods
    public double Distance2D(Position2D pos){
        double posA = get_x() - pos.get_x(), posB = get_y() - pos.get_y();
        return Math.sqrt((posA * posA) + (posB * posB));
    }
    //endregion





}
