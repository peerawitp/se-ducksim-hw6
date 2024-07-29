package decorators;

import interfaces.Quackable;

/**
 * @author 6510405741 Peerawit Pharkdeepinyo
 */
public class PoliteQuack implements Quackable {
    private Quackable bird;

    public PoliteQuack(Quackable bird) {
        this.bird = bird;
    }

    @Override
    public void quack() {
        bird.quack();
        System.out.println("krub");
    }
}
