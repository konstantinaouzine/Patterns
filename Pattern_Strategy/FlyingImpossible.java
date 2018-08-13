package Pattern_Strategy;

public class FlyingImpossible implements FlyBehavior {
    @Override
    public void fly(){
        System.out.println("Can't fly");
    }
}
