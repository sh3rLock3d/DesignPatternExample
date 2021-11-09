package com.company;

public class AbstractFactoryPatternDemo { //AbstractFactoryPatternDemo
    public static void main(String[] args) {

        AbstractFactory treeFactory = FactoryProducer.createTree();

        Client plant1 = treeFactory.getNation("Iran");
        plant1.getInfo();

        Client plant2 = treeFactory.getNation("Japan");
        plant2.getInfo();

        AbstractFactory shapeFactory1 = FactoryProducer.createFlower();

        Client plant3 = shapeFactory1.getNation("Iran");
        plant3.getInfo();

        Client plant4 = shapeFactory1.getNation("Japan");
        plant4.getInfo();

    }
}

interface Client {
    void getInfo();
}

class Chenar implements Client {
    @Override
    public void getInfo() {
        System.out.println("Inside Chenar. iranian tree.");
    }
}

class J1 implements Client {
    @Override
    public void getInfo() {
        System.out.println("Inside J1. japanese tree.");
    }
}

class Khatami implements Client {
    @Override
    public void getInfo() {
        System.out.println("Inside khatami. Iranian flower.");
    }
}

class G1 implements Client {
    @Override
    public void getInfo() {
        System.out.println("Inside G1. japanese flower.");
    }
}

abstract class AbstractFactory {
    abstract Client getNation(String shapeType);
}

class FlowerFactory extends AbstractFactory {
    @Override
    public Client getNation(String shapeType){
        if(shapeType.equalsIgnoreCase("Iran")){
            return new Khatami();
        }else if(shapeType.equalsIgnoreCase("Japan")){
            return new G1();
        }
        return null;
    }
}

class TreeFactory extends AbstractFactory {
    @Override
    public Client getNation(String shapeType){
        if(shapeType.equalsIgnoreCase("Iran")){
            return new Chenar();
        }else if(shapeType.equalsIgnoreCase("Japan")){
            return new J1();
        }
        return null;
    }
}

class FactoryProducer {
    public static AbstractFactory createTree(){
        return new TreeFactory();
    }

    public static AbstractFactory createFlower(){
        return new FlowerFactory();
    }
}
