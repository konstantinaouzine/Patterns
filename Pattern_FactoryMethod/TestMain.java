package Patterns.Pattern_FactoryMethod;

import Patterns.Pattern_FactoryMethod.PizzaStores.PizzaStore;
import Patterns.Pattern_FactoryMethod.PizzaStores.PizzaStoreChicago;
import Patterns.Pattern_FactoryMethod.PizzaStores.PizzaStoreNY;
import static Patterns.Pattern_FactoryMethod.PizzaType.*;

public class TestMain {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStoreNY();
        pizzaStore.orderPizza(CHEESE);
        System.out.println("-----------------");
        pizzaStore.orderPizza(PEPPERONI);
        System.out.println("-----------------");
        /*pizzaStore.orderPizza("Veggie");
        System.out.println("-----------------");*/

        PizzaStore pizzaStore2 = new PizzaStoreChicago();
        pizzaStore.orderPizza(CHEESE);
        System.out.println("-----------------");
        pizzaStore2.orderPizza(PEPPERONI);
        System.out.println("-----------------");
        pizzaStore2.orderPizza(DEFAULT);
    }
}
