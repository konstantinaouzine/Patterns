package Pattern_Strategy;

public class FlyingLikeRocket implements  FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying like a Rocket");
    }
}
