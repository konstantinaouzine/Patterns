package Patterns.Pattern_FactoryMethod.PizzaStores;

import Patterns.Pattern_FactoryMethod.PizzaType;
import Patterns.Pattern_FactoryMethod.Pizzas.Pizza;
import Patterns.Pattern_FactoryMethod.Pizzas.PizzaNewYorkStyleCheese;
import Patterns.Pattern_FactoryMethod.Pizzas.PizzaNewYorkStylePepperoni;
import static Patterns.Pattern_FactoryMethod.PizzaType.*;

public class PizzaStoreNY extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type) {
        if (type == CHEESE)
            return new PizzaNewYorkStyleCheese();
        else if (type == PEPPERONI)
            return new PizzaNewYorkStylePepperoni();
        else
            return null;
    }
}
