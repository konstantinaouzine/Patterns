package Pattern_Strategy;

public class SpecialDuck extends Duck {

    public SpecialDuck()
    {
        this.flyBehavior = new FlyingRegular();
        this.quackBehavior = new QuackingRegular();
    }
    @Override
    void display() {
        System.out.println("I am special DUCK");
    }
}
