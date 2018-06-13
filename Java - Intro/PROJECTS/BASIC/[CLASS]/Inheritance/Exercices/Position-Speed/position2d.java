/*
* Created by Samuel Foster
* 30.12.2017
* 18:44
*/
class Position2D {

    // il y a deux position x et y
    double x ,y;
    private double result;

    //ctor
    Position2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    Position2D(){

    }

    double Distance(Position2D Newpos){
        double disA = this.x - Newpos.x , disB = this.y - Newpos.y;
        return result = Math.sqrt((disA*disA) + (disB * disB));
    }


}
