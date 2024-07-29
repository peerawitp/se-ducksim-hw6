package decorators;

import interfaces.Quackable;

/**
 * @author 6510405741 Peerawit Pharkdeepinyo
 */
public class QuackCounter implements Quackable {
    private Quackable duck;
    private static int quackCount = 0;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        quackCount++;
    }

    public static int getQuackCount() {
        return quackCount;
    }
}
