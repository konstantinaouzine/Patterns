package Patterns.Pattern_AbstractFactory.IngridientFactories;

import Patterns.Pattern_AbstractFactory.Ingridients.Cheese.Cheese;
import Patterns.Pattern_AbstractFactory.Ingridients.Cheese.ReggianoCheese;
import Patterns.Pattern_AbstractFactory.Ingridients.Clam.Clam;
import Patterns.Pattern_AbstractFactory.Ingridients.Clam.FreshClam;
import Patterns.Pattern_AbstractFactory.Ingridients.Douch.Dough;
import Patterns.Pattern_AbstractFactory.Ingridients.Douch.ThinDough;
import Patterns.Pattern_AbstractFactory.Ingridients.Pepperonies.Pepperoni;
import Patterns.Pattern_AbstractFactory.Ingridients.Pepperonies.SlicedPepperoni;
import Patterns.Pattern_AbstractFactory.Ingridients.Sauce.MarinaraSauce;
import Patterns.Pattern_AbstractFactory.Ingridients.Sauce.Sauce;
import Patterns.Pattern_AbstractFactory.Ingridients.Veggies.Garlic;
import Patterns.Pattern_AbstractFactory.Ingridients.Veggies.Mushroom;
import Patterns.Pattern_AbstractFactory.Ingridients.Veggies.Onion;
import Patterns.Pattern_AbstractFactory.Ingridients.Veggies.Veggie;

public class NYIngredientsFactory implements IngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggie[] createVeggies() {
        Veggie[] veggies = {new Garlic(), new Mushroom(), new Onion()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }
}
