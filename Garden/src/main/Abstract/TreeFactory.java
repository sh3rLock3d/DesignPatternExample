package main.Abstract;

public class TreeFactory extends AbstractFactory {
    @Override
    public Client getNation(String shapeType) {
        if (shapeType.equalsIgnoreCase("Iran")) {
            return new Chenar();
        } else if (shapeType.equalsIgnoreCase("Japan")) {
            return new J1();
        }
        return null;
    }
}
