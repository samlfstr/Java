class FactoryProducer {

    static AbstractFactory createFactory(FactoryType type){
        switch (type){
            case CIRCLE_FACTORY:
                return new CircleFactory();
            default:
                throw new IllegalArgumentException("Don't know man !");
        }
    }

}
