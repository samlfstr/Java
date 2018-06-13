public class ShapeFactory extends AbstractFactory {
    @Override
    Shape GetShape(String shape) {
        if(shape == "Circle") return new Circle();
        if(shape == "Square") return new Square();
        if(shape == "Rectangle") return new Rectangle();
        else return null;
    }

    @Override
    Color GetColor(String color) {
        return null;
    }
}
