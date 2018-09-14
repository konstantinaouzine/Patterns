package Patterns.Pattern_FactoryMethod.PizzaStores;

import Patterns.Pattern_FactoryMethod.PizzaType;
import Patterns.Pattern_FactoryMethod.Pizzas.Pizza;
import Patterns.Pattern_FactoryMethod.Pizzas.PizzaChicagoStyleCheese;
import Patterns.Pattern_FactoryMethod.Pizzas.PizzaChicagoStylePepperoni;
import static Patterns.Pattern_FactoryMethod.PizzaType.*;

public class PizzaStoreChicago extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type) {
        if (type == CHEESE)
            return new PizzaChicagoStyleCheese();
        else if (type == PEPPERONI)
            return new PizzaChicagoStylePepperoni();
        else
            return null;
    }
}
