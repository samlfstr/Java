public class Cercle {

    //region Vars
    private double radius;
    private String color;
    //endregion

    //region Props
    public double get_radius(){ return this.radius; }
    public void set_radius(double radius){ this.radius = radius; }
    public String get_color(){ return this.color; }
    //endregion

    //region Ctors
    public Cercle() {
    }

    public Cercle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    //endregion

    //region Methodes
    public double getPerimeter(){
        return get_radius() * Math.PI;
    }
    public double getArea(){
        return Math.PI * get_radius()*get_radius();
    }

    public void Show(){
        System.out.print("Perimeter : " + getPerimeter());
        System.out.print("\n");
        System.out.print("Area : " + getArea());
    }

    public void ShowInteger(){
        long roundedPerimeter = Math.round(getPerimeter());
        long roundedArea = Math.round(getArea());
        System.out.print("Rounded Values Of The Calculation");
        System.out.print("Perimeter : " + roundedPerimeter);
        System.out.print("\n");
        System.out.print("Area : " + roundedArea);


    }

    //endregion







}
