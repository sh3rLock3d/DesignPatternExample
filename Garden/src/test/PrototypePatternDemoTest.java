package test;

import main.prototype.PineTree;
import main.prototype.PlasticTree;
import main.prototype.Position;
import main.prototype.Tree;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.*;

class PrototypePatternDemoTest {
    @Test
    public void givenAPlasticTreePrototypeWhenClonedThenCreateA_Clone() {
        Position position = new Position(10, 10);
        Position otherPosition = new Position(20, 20);
        int mass = 100;
        int height = 15;

        PlasticTree plasticTree = new PlasticTree(mass, height);
        plasticTree.setPosition(position);
        PlasticTree anotherPlasticTree = (PlasticTree) plasticTree.copy();
        anotherPlasticTree.setPosition(otherPosition);

        assertEquals(position, plasticTree.getPosition());
        assertEquals(otherPosition, anotherPlasticTree.getPosition());
    }

    @Test
    public void givenA_ListOfTreesWhenClonedThenCreateListOfClones() {

        Position position = new Position(10, 10);
        Position otherPosition = new Position(20, 20);
        int mass = 100;
        int height = 15;

        PlasticTree plasticTree = new PlasticTree(mass, height);
        plasticTree.setPosition(position);

        PineTree pineTree = new PineTree(2*mass, 2*height);
        pineTree.setPosition(otherPosition);

        List<Tree> trees = Arrays.asList(plasticTree, pineTree);
        List<Tree> treeClones = trees.stream().map(Tree::copy).collect(toList());

        // ...

        assertEquals(height, treeClones.get(0).getHeight());
        assertEquals(position, treeClones.get(0).getPosition());
    }

}