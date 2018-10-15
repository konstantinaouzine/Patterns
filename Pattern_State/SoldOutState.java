package Patterns.Pattern_State;

public class SoldOutState implements State {
    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Machine is empty of gums");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Machine is empty of gums");
    }

    @Override
    public void turnCrank() {
        System.out.println("Machine is empty of gums");
    }

    @Override
    public void dispense() {
    }
}
