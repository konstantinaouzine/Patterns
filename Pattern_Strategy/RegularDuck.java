package Pattern_Strategy;

public class RegularDuck extends Duck {
    public RegularDuck() {
        this.flyBehavior = new FlyingRegular();
        this.quackBehavior = new QuackingRegular();
    }

    @Override
    void display() {
        System.out.println("I am a regular duck!");
    }
}
