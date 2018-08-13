package Pattern_Strategy;

public class QuackingRegular implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("regular quacking");
    }
}
