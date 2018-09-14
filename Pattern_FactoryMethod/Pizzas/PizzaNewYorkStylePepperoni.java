package Patterns.Pattern_FactoryMethod.Pizzas;

public class PizzaNewYorkStylePepperoni extends Pizza{
    public PizzaNewYorkStylePepperoni(){
        name = "NY style: Pepperoni Pizza";
        dough = "Thin dough";
        sauce = "Sweet sauce";
        toppings.add("Pepperoni cheese");
        toppings.add("Topping2");
    }


    @Override
    public void bake() {
        System.out.println("Bake for 30 minutes at 350 degrees");
    }

    @Override
    public void cut() {
        System.out.println("Cutting pizza at square pieces");
    }
}
