package factories;

import adapters.GooseAdapter;
import adapters.PigeonAdapter;
import interfaces.Quackable;
import models.*;

/**
 * @author 6510405741 Peerawit Pharkdeepinyo
 */
public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

    @Override
    public Quackable createCallDuck() {
        return new DuckCall();
    }

    @Override
    public Quackable createGoose() {
        return new GooseAdapter(new Goose());
    }

    @Override
    public Quackable createPigeon() {
        return new PigeonAdapter(new Pigeon());
    }
}
