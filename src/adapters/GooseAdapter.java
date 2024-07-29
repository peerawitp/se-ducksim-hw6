package adapters;

import interfaces.Quackable;
import models.Goose;

/**
 * @author 6510405741 Peerawit Pharkdeepinyo
 */
public class GooseAdapter implements Quackable {
    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
