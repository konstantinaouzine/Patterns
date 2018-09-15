package Patterns.Pattern_AbstractFactory.Pizzas;

import Patterns.Pattern_AbstractFactory.IngridientFactories.IngredientFactory;

public class PizzaCheese extends Pizza{

    public PizzaCheese(IngredientFactory _ingredientFactory)
    {
        super(_ingredientFactory);
        name = "Cheese Pizza";
    }

    //prepare() method not overridden, default implementation was used to create Cheese Pizza
}
