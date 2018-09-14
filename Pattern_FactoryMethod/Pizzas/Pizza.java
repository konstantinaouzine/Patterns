package Patterns.Pattern_FactoryMethod.Pizzas;

import java.util.ArrayList;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;

    protected ArrayList<String> toppings = new ArrayList<>();

    public void prepare(){
        System.out.println("preparing " + name);
        System.out.println("tossing dough - " + dough);
        System.out.println("adding sauce - " + sauce);
        System.out.print("adding toppings: ");
        StringBuilder toppingsString = new StringBuilder();
        for (String topping: toppings)
            toppingsString.append(topping).append(", ");
        toppingsString.deleteCharAt(toppingsString.length()-1);
        toppingsString.deleteCharAt(toppingsString.length()-1);
        System.out.println(toppingsString);
    }

    //abstract methods to be completed in child classes to define specific PizzaStore behavior
    public abstract void bake();
    public abstract void cut();

    public void box(){
        System.out.println("Placing pizza in official PizzaStore box");
    }

}
