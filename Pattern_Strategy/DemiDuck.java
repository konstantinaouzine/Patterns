package Pattern_Strategy;

public class DemiDuck extends Duck {
    public DemiDuck() {
        this.flyBehavior = new FlyingImpossible();
        this.quackBehavior = new QuackImpossible();
    }

    @Override
    public void display()
    {
        System.out.println("I am Demi Pattern_Strategy.Duck");
    }
}
