package Patterns.Pattern_FactoryMethod.PizzaStores;

import Patterns.Pattern_FactoryMethod.Pizzas.Pizza;

public abstract class PizzaStore {
    Pizza pizza;

    public Pizza orderPizza(String type){
        pizza = createPizza(type);
        if (pizza==null)
        {
            System.out.println("Such pizza doesn't exist - \'" + type + "\', terminating...");
            System.exit(1);
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
