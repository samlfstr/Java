public class CircleFactory extends AbstractFactory {

    @Override
    Shape getShape(ShapeType type) {
        switch (type){
            case ELLIPTIC_CIRCLE:
                return new CircleElliptic();
            case GENERAL_CIRCLE:
                return new CircleGeneral();
            default:
                throw new IllegalArgumentException("Je ne sais pas merde !");
        }
    }


}
