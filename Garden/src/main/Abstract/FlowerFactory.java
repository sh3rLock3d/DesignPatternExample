package main.Abstract;

public class FlowerFactory extends AbstractFactory {
    @Override
    public Client getNation(String shapeType) {
        if (shapeType.equalsIgnoreCase("Iran")) {
            return new Khatami();
        } else if (shapeType.equalsIgnoreCase("Japan")) {
            return new G1();
        }
        return null;
    }
}
