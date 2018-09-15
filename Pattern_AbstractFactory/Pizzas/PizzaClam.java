package Patterns.Pattern_AbstractFactory.Pizzas;

import Patterns.Pattern_AbstractFactory.IngridientFactories.IngredientFactory;

public class PizzaClam extends Pizza {
    public PizzaClam(IngredientFactory _ingredientFactory)
    {
        super(_ingredientFactory);
        name = "Clam Pizza";
    }

    @Override
    public void prepare(){
        super.prepare();
        this.clam = ingredientFactory.createClam();
    }
}
