package main.Abstract;

public class FactoryProducer {
    public static AbstractFactory createTree() {
        return new TreeFactory();
    }

    public static AbstractFactory createFlower() {
        return new FlowerFactory();
    }
}
