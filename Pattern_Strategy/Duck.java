package Pattern_Strategy;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    abstract void display();

    void performFly()
    {
        this.flyBehavior.fly();
    }

    void performQuack()
    {
        this.quackBehavior.quack();
    }

    void setFlyBehavior(FlyBehavior flyBehavior)
    {
        this.flyBehavior = flyBehavior;
    }

    void setQuackBehavior(QuackBehavior quackBehavior)
    {
        this.quackBehavior = quackBehavior;
    }
}
