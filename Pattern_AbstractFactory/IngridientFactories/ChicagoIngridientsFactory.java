package Patterns.Pattern_AbstractFactory.IngridientFactories;

import Patterns.Pattern_AbstractFactory.Ingridients.Cheese.Cheese;
import Patterns.Pattern_AbstractFactory.Ingridients.Cheese.MozzarellaCheese;
import Patterns.Pattern_AbstractFactory.Ingridients.Clam.Clam;
import Patterns.Pattern_AbstractFactory.Ingridients.Clam.FrozenClam;
import Patterns.Pattern_AbstractFactory.Ingridients.Douch.Dough;
import Patterns.Pattern_AbstractFactory.Ingridients.Douch.ThickDough;
import Patterns.Pattern_AbstractFactory.Ingridients.Pepperonies.BigPepperoni;
import Patterns.Pattern_AbstractFactory.Ingridients.Pepperonies.Pepperoni;
import Patterns.Pattern_AbstractFactory.Ingridients.Sauce.PlumTomatoSauce;
import Patterns.Pattern_AbstractFactory.Ingridients.Sauce.Sauce;
import Patterns.Pattern_AbstractFactory.Ingridients.Veggies.BlackOlives;
import Patterns.Pattern_AbstractFactory.Ingridients.Veggies.EggPlant;
import Patterns.Pattern_AbstractFactory.Ingridients.Veggies.Spinach;
import Patterns.Pattern_AbstractFactory.Ingridients.Veggies.Veggie;

public class ChicagoIngridientsFactory implements IngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggie[] createVeggies() {
        Veggie[] veggies = {new BlackOlives(), new Spinach(), new EggPlant()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new BigPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FrozenClam();
    }
}
