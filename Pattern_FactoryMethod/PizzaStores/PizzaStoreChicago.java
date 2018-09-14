package Patterns.Pattern_FactoryMethod.PizzaStores;

import Patterns.Pattern_FactoryMethod.Pizzas.Pizza;
import Patterns.Pattern_FactoryMethod.Pizzas.PizzaChicagoStyleCheese;
import Patterns.Pattern_FactoryMethod.Pizzas.PizzaChicagoStylePepperoni;

public class PizzaStoreChicago extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("Cheese"))
            return new PizzaChicagoStyleCheese();
        else if (type.equalsIgnoreCase("Pepperoni"))
            return new PizzaChicagoStylePepperoni();
        else
            return null;
    }
}
