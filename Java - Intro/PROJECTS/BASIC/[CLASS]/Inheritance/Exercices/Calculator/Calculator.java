public class Calculator {

    private double x;
    private double y;

    private Double result;
    private String OpName;

    //region Proprieties
    public double get_x(){ return this.x; }
    public void set_x(double x){ this.x = x; }
    public double get_y(){ return this.y; }
    public void set_y(double y){ this.y = y; }
    //endregion

    // Default ctor
    public Calculator() {

    }

    // Ctor x,y
    public Calculator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void Operation(String choise){

        switch (choise){
            case "+":
                result = get_x() + get_y();
                OpName = choise;
                break;
            case "-":
                result = get_x() - get_y();
                OpName = choise;
                break;
            case "*":
                result = get_x() * get_y();
                OpName = choise;
                break;
            case "/":
                try{ 
                    result = get_x() / get_y();
                    OpName = choise;
                }
                catch (Exception e){
                    System.out.print(e.getMessage());
                }
                break;
            default:
                System.out.print("Invalid operation");
                break;
        }

    }

    public void ShowResult(){
        System.out.print("Operation (" + OpName + ")\n");
        System.out.print("Result : " + result);
    }

}
