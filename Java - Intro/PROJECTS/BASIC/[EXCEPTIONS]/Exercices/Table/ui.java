public class Ui {

    public Ui() {
    }

    public void Inputs(){

        Boolean ok = true;
        int first_val,second_val;
        double result;
        Scanner scanner = new Scanner(System.in);
        do {
            try{
                System.out.print("First Val :");
                first_val = scanner.nextInt();
                System.out.print("Second Val : ");
                second_val = scanner.nextInt();
                System.out.println(Tableau.division(first_val,second_val));
            }
            catch (IndexOutOfBoundsException e){
                System.out.println("Index have to be between 0-9");
                ok = false;
            }
            catch (ArithmeticException e){
                System.out.println("Divisor can not be null");
                ok = false;
            }
            catch (InputMismatchException e){
                System.out.println("Input have to be an integer");
                ok = false;
            }

        }while(!ok);



    }


}
