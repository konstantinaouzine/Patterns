package Patterns.Pattern_FactoryMethod.Pizzas;

public class PizzaNewYorkStyleCheese extends Pizza {
    public PizzaNewYorkStyleCheese(){
        name = "NY style: Sauce and Cheese Pizza";
        dough = "Thin dough";
        sauce = "Marinara sauce";
        toppings.add("Grated Reggiano cheese");
        toppings.add("Topping2");
    }


    @Override
    public void bake() {
        System.out.println("Bake for 30 minutes at 350 degrees");
    }

    @Override
    public void cut() {
        System.out.println("Cutting pizza at square pieces");
    }}
