package Patterns.Pattern_State;

public class SoldState implements State {
    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Can't insert another coin during dispensing");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Can't eject coin because it already used");
    }

    @Override
    public void turnCrank() {
        System.out.println("Already dispensing the gum");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCountOgGumsInside()==0)
        {
            System.out.println("No gums remained");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
        else
            gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
}
