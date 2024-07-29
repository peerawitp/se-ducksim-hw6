package factories;

import interfaces.Quackable;

/**
 * @author 6510405741 Peerawit Pharkdeepinyo
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedHeadDuck();
    public abstract Quackable createRubberDuck();
    public abstract Quackable createCallDuck();
    public abstract Quackable createGoose();
    public abstract Quackable createPigeon();
}
