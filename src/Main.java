import factories.AbstractDuckFactory;
import factories.PoliteWithCountDuckFactory;

/**
 * @author 6510405741 Peerawit Pharkdeepinyo
 */
public class Main {
    public static void main(String[] args) {
        AbstractDuckFactory factory = new PoliteWithCountDuckFactory();

        DuckSimulator simulator = new DuckSimulator(factory);
        simulator.simulate();
    }
}