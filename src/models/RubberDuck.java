package models;

import interfaces.Quackable;

/**
 * @author 6510405741 Peerawit Pharkdeepinyo
 */
public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
