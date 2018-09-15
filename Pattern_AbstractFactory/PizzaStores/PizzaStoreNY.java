package Patterns.Pattern_AbstractFactory.PizzaStores;

import Patterns.Pattern_AbstractFactory.IngridientFactories.IngredientFactory;
import Patterns.Pattern_AbstractFactory.IngridientFactories.NYIngredientsFactory;
import Patterns.Pattern_AbstractFactory.Pizzas.*;

public class PizzaStoreNY extends PizzaStore {
    public PizzaStoreNY(){
        this.city = "New York";
    }
    //PizzaStoreNY acts as ConcreteFactory implementation and uses specific IngredientFactory(NewYork)
    @Override
    protected Pizza createPizza(PizzaType type) {
        IngredientFactory ingredientFactory = new NYIngredientsFactory();
        Pizza pizza = null;
        if (type == PizzaType.CHEESE) {
            pizza = new PizzaCheese(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        else if (type == PizzaType.PEPPERONI)
        {
            pizza = new PizzaPepperoni(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        else if (type == PizzaType.VEGGIE)
        {
            pizza = new PizzaVeggie(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }
        else if (type == PizzaType.CLAM)
        {
            pizza = new PizzaClam(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");

        }
        return pizza;
    }
}
