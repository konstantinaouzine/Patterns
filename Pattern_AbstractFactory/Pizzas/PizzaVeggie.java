package Patterns.Pattern_AbstractFactory.Pizzas;

import Patterns.Pattern_AbstractFactory.IngridientFactories.IngredientFactory;

public class PizzaVeggie extends Pizza {
    public PizzaVeggie(IngredientFactory _ingredientFactory)
    {
        super(_ingredientFactory);
        name = "Veggie Pizza";
    }

    @Override
    public void prepare(){
        super.prepare();
        this.veggies = ingredientFactory.createVeggies();
    }
}
