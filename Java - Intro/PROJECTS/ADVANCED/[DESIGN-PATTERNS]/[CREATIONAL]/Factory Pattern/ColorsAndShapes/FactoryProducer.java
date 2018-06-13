public class FactoryProducer {

    public static AbstractFactory CreateFactory(String factory){
        if (factory == "Color") return new ColorFactory();
        else if(factory == "Shape") return new ShapeFactory();
        else return null;
    }
}
