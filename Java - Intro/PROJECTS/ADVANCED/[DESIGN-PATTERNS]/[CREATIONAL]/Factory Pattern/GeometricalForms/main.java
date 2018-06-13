
public class Main {

    public static void main(String[] args) {


        AbstractFactory factory = FactoryProducer.createFactory(FactoryType.CIRCLE_FACTORY);
        Circle circle = (Circle) factory.getShape(ShapeType.ELLIPTIC_CIRCLE);
        System.out.println(circle.Description());



    }
}



