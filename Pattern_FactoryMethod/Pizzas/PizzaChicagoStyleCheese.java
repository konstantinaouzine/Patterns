package Patterns.Pattern_FactoryMethod.Pizzas;

public class PizzaChicagoStyleCheese extends Pizza {
    public PizzaChicagoStyleCheese(){
        name = "Chicago style: Deep dish Pizza";
        dough = "Extra thick dough";
        sauce = "Tomato sauce";
        toppings.add("Shredded Mozarella cheese");
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
