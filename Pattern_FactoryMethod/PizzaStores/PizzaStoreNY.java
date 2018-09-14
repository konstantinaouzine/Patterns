package Patterns.Pattern_FactoryMethod.PizzaStores;

import Patterns.Pattern_FactoryMethod.Pizzas.Pizza;
import Patterns.Pattern_FactoryMethod.Pizzas.PizzaNewYorkStyleCheese;
import Patterns.Pattern_FactoryMethod.Pizzas.PizzaNewYorkStylePepperoni;

public class PizzaStoreNY extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("Cheese"))
            return new PizzaNewYorkStyleCheese();
        else if (type.equalsIgnoreCase("Pepperoni"))
            return new PizzaNewYorkStylePepperoni();
        else
            return null;
    }
}
