package Pattern_Strategy;

public class FlyingRegular implements FlyBehavior{
    @Override
    public void fly()
    {
        System.out.println("regular flying");
    }
}
