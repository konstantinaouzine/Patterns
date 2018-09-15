package Patterns.Pattern_AbstractFactory.Pizzas;

import Patterns.Pattern_AbstractFactory.IngridientFactories.IngredientFactory;
import Patterns.Pattern_AbstractFactory.Ingridients.Cheese.Cheese;
import Patterns.Pattern_AbstractFactory.Ingridients.Clam.Clam;
import Patterns.Pattern_AbstractFactory.Ingridients.Douch.Dough;
import Patterns.Pattern_AbstractFactory.Ingridients.Pepperonies.Pepperoni;
import Patterns.Pattern_AbstractFactory.Ingridients.Sauce.Sauce;
import Patterns.Pattern_AbstractFactory.Ingridients.Veggies.Veggie;

public abstract class Pizza {
    protected IngredientFactory ingredientFactory;
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Veggie[] veggies;
    protected Clam clam;

    public Pizza(IngredientFactory _ingredientFactory){
        this.ingredientFactory = _ingredientFactory;
    }

    //if not overridden, then will produce default cheese pizza
    public void prepare(){
        System.out.println("Preparing " + this.name);
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
        this.cheese = ingredientFactory.createCheese();
    }

    public void bake(){
        System.out.println("Bake for 25 min at 350 degrees");
    }

    public void cut(String city){
        if (city.equalsIgnoreCase("New York"))
            System.out.println("Cutting the pizza into square slices");
        else
            System.out.println("Cutting the pizza into triangle slices");
    }

    public void box(){
        System.out.println("Placing pizza in official PizzaStore box");
    }

    public void setName(String _name)
    {
        this.name = _name;
    }
}
