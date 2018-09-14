package Patterns.Pattern_FactoryMethod;

import Patterns.Pattern_FactoryMethod.PizzaStores.PizzaStore;
import Patterns.Pattern_FactoryMethod.PizzaStores.PizzaStoreChicago;
import Patterns.Pattern_FactoryMethod.PizzaStores.PizzaStoreNY;

public class TestMain {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStoreNY();
        pizzaStore.orderPizza("Cheese");
        System.out.println("-----------------");
        pizzaStore.orderPizza("Pepperoni");
        System.out.println("-----------------");
        /*pizzaStore.orderPizza("Veggie");
        System.out.println("-----------------");*/

        PizzaStore pizzaStore2 = new PizzaStoreChicago();
        pizzaStore.orderPizza("Cheese");
        System.out.println("-----------------");
        pizzaStore2.orderPizza("Pepperoni");
        System.out.println("-----------------");
        pizzaStore2.orderPizza("Veggie");
    }
}
