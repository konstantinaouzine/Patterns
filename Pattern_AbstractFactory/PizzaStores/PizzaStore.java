package Patterns.Pattern_AbstractFactory.PizzaStores;

import Patterns.Pattern_AbstractFactory.IngridientFactories.IngredientFactory;
import Patterns.Pattern_AbstractFactory.Pizzas.Pizza;
import Patterns.Pattern_AbstractFactory.Pizzas.PizzaType;

public abstract class PizzaStore {
    String city;
    Pizza pizza;

    public Pizza orderPizza(PizzaType type){
        pizza = createPizza(type);
        if (pizza==null)
        {
            System.out.println("Such pizza doesn't exist - \'" + type + "\', terminating...");
            System.exit(1);
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut(this.city);
        pizza.box();
        return pizza;
    }

    //PizzaStore acts as AbstractFactory interface. createPizza() method implemented using FactoryMethod pattern
    protected abstract Pizza createPizza(PizzaType type);
}
