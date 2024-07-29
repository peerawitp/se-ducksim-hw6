package factories;

import adapters.GooseAdapter;
import adapters.PigeonAdapter;
import decorators.QuackCounter;
import interfaces.Quackable;
import models.*;

/**
 * @author 6510405741 Peerawit Pharkdeepinyo
 */
public class CounterDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }

    @Override
    public Quackable createCallDuck() {
        return  new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createGoose() {
        return new QuackCounter(new GooseAdapter(new Goose()));
    }

    @Override
    public Quackable createPigeon() {
        return new QuackCounter(new PigeonAdapter(new Pigeon()));
    }
}
