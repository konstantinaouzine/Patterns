package Patterns.Pattern_State;

public class TestMain {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(10);
        gumballMachine.ejectQuarter();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();

        for (int i=0; i<8; i++) {
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
        }
    }

}
