package adapters;

import interfaces.Quackable;
import models.Pigeon;

/**
 * @author 6510405741 Peerawit Pharkdeepinyo
 */
public class PigeonAdapter implements Quackable {
    private Pigeon pigeon;

    public PigeonAdapter(Pigeon pigeon) {
        this.pigeon = pigeon;
    }

    @Override
    public void quack() {
        pigeon.coo();
        pigeon.coo();
    }
}
