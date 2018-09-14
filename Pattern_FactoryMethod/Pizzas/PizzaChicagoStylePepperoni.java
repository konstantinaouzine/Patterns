package Patterns.Pattern_FactoryMethod.Pizzas;

public class PizzaChicagoStylePepperoni extends Pizza {
    public PizzaChicagoStylePepperoni(){
        name = "Chicago style: Deep dish Pizza";
        dough = "Extra thick dough";
        sauce = "Sweet sauce";
        toppings.add("Pepperoni cheese");
        toppings.add("Topping2");
    }


    @Override
    public void bake() {
        System.out.println("Bake for 24 minutes at 300 degrees");
    }

    @Override
    public void cut() {
        System.out.println("Cutting pizza at triangle pieces");
    }
}
