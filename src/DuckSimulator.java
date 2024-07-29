import decorators.QuackCounter;
import factories.AbstractDuckFactory;
import interfaces.Quackable;
import models.*;

/**
 * @author 6510405741 Peerawit Pharkdeepinyo
 */
public class DuckSimulator {
    private AbstractDuckFactory factory;
    public DuckSimulator(AbstractDuckFactory factory) {
       this.factory = factory;
    }

    public void simulate() {
        Flock flockOfMallards = new Flock();
        flockOfMallards.add(factory.createMallardDuck());
        flockOfMallards.add(factory.createMallardDuck());
        flockOfMallards.add(factory.createMallardDuck());

        System.out.println("\nFlock of Mallard Ducks");
        simulate(flockOfMallards);

        Flock flockOfRedHeads = new Flock();
        flockOfRedHeads.add(factory.createRedHeadDuck());
        flockOfRedHeads.add(factory.createRedHeadDuck());
        flockOfRedHeads.add(factory.createRedHeadDuck());

        System.out.println("\nFlock of Red Head Ducks");
        simulate(flockOfRedHeads);

        System.out.println("Polite duck quacked: " + QuackCounter.getQuackCount());
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
