package test;


import main.Abstract.AbstractFactory;
import main.Abstract.Client;
import main.Abstract.FactoryProducer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryPatternDemoTest {
    @Test
    public void create_an_iranian_flower() {
        AbstractFactory treeFactory = FactoryProducer.createTree();

        Client plant1 = treeFactory.getNation("Iran");
        assertEquals(plant1.getInfo(), "Inside Chenar. iranian tree.");
    }

    @Test
    public void create_an_iranian_tree() {
        AbstractFactory shapeFactory1 = FactoryProducer.createFlower();

        Client plant3 = shapeFactory1.getNation("Iran");

        assertEquals(plant3.getInfo(), "Inside khatami. Iranian flower.");
    }

    @Test
    public void create_an_japanese_flower() {
        AbstractFactory shapeFactory1 = FactoryProducer.createFlower();

        Client plant4 = shapeFactory1.getNation("Japan");
        assertEquals(plant4.getInfo(), "Inside G1. japanese flower.");
    }

    @Test
    public void create_an_japanese_tree() {
        AbstractFactory treeFactory = FactoryProducer.createTree();

        Client plant2 = treeFactory.getNation("Japan");
        assertEquals(plant2.getInfo(), "Inside J1. japanese tree.");
    }

}