package Patterns.Pattern_AbstractFactory;

import Patterns.Pattern_AbstractFactory.PizzaStores.PizzaStore;
import Patterns.Pattern_AbstractFactory.PizzaStores.PizzaStoreChicago;
import Patterns.Pattern_AbstractFactory.PizzaStores.PizzaStoreNY;
import static Patterns.Pattern_AbstractFactory.Pizzas.PizzaType.*;

public class TestMain {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStoreNY();
        //pizzaStore.orderPizza(CHEESE);
        //System.out.println("-----------------");
        pizzaStore.orderPizza(PEPPERONI);
        System.out.println("-----------------");

        PizzaStore pizzaStore2 = new PizzaStoreChicago();
        pizzaStore2.orderPizza(CHEESE);
        System.out.println("-----------------");
        //pizzaStore2.orderPizza(PEPPERONI);
    }
}
