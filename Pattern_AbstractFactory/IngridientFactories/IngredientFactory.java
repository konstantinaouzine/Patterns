package Patterns.Pattern_AbstractFactory.IngridientFactories;

import Patterns.Pattern_AbstractFactory.Ingridients.Cheese.Cheese;
import Patterns.Pattern_AbstractFactory.Ingridients.Clam.Clam;
import Patterns.Pattern_AbstractFactory.Ingridients.Douch.Dough;
import Patterns.Pattern_AbstractFactory.Ingridients.Pepperonies.Pepperoni;
import Patterns.Pattern_AbstractFactory.Ingridients.Sauce.Sauce;
import Patterns.Pattern_AbstractFactory.Ingridients.Veggies.Garlic;
import Patterns.Pattern_AbstractFactory.Ingridients.Veggies.Mushroom;
import Patterns.Pattern_AbstractFactory.Ingridients.Veggies.Onion;
import Patterns.Pattern_AbstractFactory.Ingridients.Veggies.Veggie;

public interface IngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggie[] createVeggies();
    Pepperoni createPepperoni();
    Clam createClam();
}
