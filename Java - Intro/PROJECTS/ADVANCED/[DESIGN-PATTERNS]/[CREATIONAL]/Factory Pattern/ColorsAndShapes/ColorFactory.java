public class ColorFactory extends AbstractFactory {
    @Override
    Shape GetShape(String shape) {
        return null;
    }

    @Override
    Color GetColor(String color) {
        if(color == "Red") return new Red();
        else if(color == "Green") return new Green();
        else if(color == "Yellow") return new Yellow();
        else return null;
    }
}
