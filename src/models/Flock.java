package models;

import interfaces.Quackable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 6510405741 Peerawit Pharkdeepinyo
 */
public class Flock implements Quackable {
    private List<Quackable> quackers = new ArrayList<>();
    private Quackable leader;

    public void add(Quackable quackable) {
        if (leader == null)
            leader = quackable;
        quackers.add(quackable);
    }

    @Override
    public void quack() {
        for (Quackable q : quackers) {
            if (q == leader) {
                q.quack();
                q.quack();
                q.quack();
            }
            else
                q.quack();
        }
    }
}
