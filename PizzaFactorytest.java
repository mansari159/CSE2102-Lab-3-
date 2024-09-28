import org.junit.Test;
import static org.junit.Assert.*;

public class PizzaFactoryTest {

    @Test
    public void testCreateCheesePizza() {
        PizzaFactory factory = new PizzaFactory();
        Pizza pizza = factory.createPizza("cheese");
        assertTrue(pizza instanceof CheesePizza);
    }

    @Test
    public void testCreateGreekPizza() {
        PizzaFactory factory = new PizzaFactory();
        Pizza pizza = factory.createPizza("greek");
        assertTrue(pizza instanceof GreekPizza);
    }
    
    @Test
    public void testCreatePeperoniPizza() {
        PizzaFactory factory = new PizzaFactory();
        Pizza pizza = factory.createPizza("peperoni");
        assertTrue(pizza instanceof PeperoniPizza);
    }

    @Test
    public void testCreateGlutenFreePizza() {
        PizzaFactory factory = new PizzaFactory();
        Pizza pizza = factory.createPizza("gluten free");
        assertTrue(pizza instanceof GlutenFreePizza);
    }

}
