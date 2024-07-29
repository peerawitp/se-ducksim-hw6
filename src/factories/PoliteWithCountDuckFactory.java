package factories;

import adapters.GooseAdapter;
import adapters.PigeonAdapter;
import decorators.PoliteQuack;
import decorators.QuackCounter;
import interfaces.Quackable;
import models.*;

/**
 * @author 6510405741 Peerawit Pharkdeepinyo
 */
public class PoliteWithCountDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new PoliteQuack(new QuackCounter(new MallardDuck()));
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new PoliteQuack(new QuackCounter(new RedheadDuck()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new PoliteQuack(new QuackCounter(new RubberDuck()));
    }

    @Override
    public Quackable createCallDuck() {
        return new PoliteQuack(new QuackCounter(new DuckCall()));
    }

    @Override
    public Quackable createGoose() {
        return new PoliteQuack(new QuackCounter(new GooseAdapter(new Goose())));
    }

    @Override
    public Quackable createPigeon() {
        return new PoliteQuack(new QuackCounter(new PigeonAdapter(new Pigeon())));
    }
}
