package main.Abstract;

public class AbstractFactoryPatternDemo { //AbstractFactoryPatternDemo
    public static void main(String[] args) {

        AbstractFactory treeFactory = FactoryProducer.createTree();

        Client plant1 = treeFactory.getNation("Iran");
        System.out.println(plant1.getInfo());

        Client plant2 = treeFactory.getNation("Japan");
        System.out.println(plant2.getInfo());

        AbstractFactory shapeFactory1 = FactoryProducer.createFlower();

        Client plant3 = shapeFactory1.getNation("Iran");
        System.out.println(plant3.getInfo());

        Client plant4 = shapeFactory1.getNation("Japan");
        System.out.println(plant4.getInfo());

    }
}

