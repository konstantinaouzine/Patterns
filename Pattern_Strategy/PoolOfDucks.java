package Pattern_Strategy;

public class PoolOfDucks {
    public static void main(String[] args) {
        Duck regularDuck = new RegularDuck();
        Duck demiDuck = new DemiDuck();
        regularDuck.performFly();
        regularDuck.performQuack();
        demiDuck.performFly();
        demiDuck.performQuack();
        Duck specialDuck = new SpecialDuck();
        specialDuck.performFly();
        specialDuck.setFlyBehavior(new FlyingLikeRocket());
        specialDuck.performFly();
    }
}
