package Patterns.Pattern_AbstractFactory.Pizzas;

import Patterns.Pattern_AbstractFactory.IngridientFactories.IngredientFactory;

public class PizzaPepperoni extends Pizza {
    public PizzaPepperoni(IngredientFactory _ingredientFactory)
    {
        super(_ingredientFactory);
        name = "Pepperoni Pizza";
    }

    @Override
    public void prepare(){
        super.prepare();
        this.pepperoni = ingredientFactory.createPepperoni();
    }
}
