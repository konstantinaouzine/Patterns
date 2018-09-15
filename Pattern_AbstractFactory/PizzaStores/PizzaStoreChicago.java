package Patterns.Pattern_AbstractFactory.PizzaStores;

import Patterns.Pattern_AbstractFactory.IngridientFactories.ChicagoIngridientsFactory;
import Patterns.Pattern_AbstractFactory.IngridientFactories.IngredientFactory;
import Patterns.Pattern_AbstractFactory.Pizzas.*;

public class PizzaStoreChicago extends PizzaStore {
    public PizzaStoreChicago(){
        this.city = "Chicago";
    }

    //PizzaStoreChicago acts as ConcreteFactory implementation and uses specific IngredientFactory(Chicago)
    //Various IngredientFactories produce different 'products' according to AbstractFactory pattern
    @Override
    protected Pizza createPizza(PizzaType type){
        IngredientFactory ingredientFactory = new ChicagoIngridientsFactory();
        Pizza pizza = null;
        if (type == PizzaType.CHEESE) {
            pizza = new PizzaCheese(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        }
        else if (type == PizzaType.PEPPERONI)
        {
            pizza = new PizzaPepperoni(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }
        else if (type == PizzaType.VEGGIE)
        {
            pizza = new PizzaVeggie(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        }
        else if (type == PizzaType.CLAM)
        {
            pizza = new PizzaClam(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }
        return pizza;

    }
}
