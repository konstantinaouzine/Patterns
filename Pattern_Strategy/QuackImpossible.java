package Pattern_Strategy;

public class QuackImpossible implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Can't quack");
    }
}
