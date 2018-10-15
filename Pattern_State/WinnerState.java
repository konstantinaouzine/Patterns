package Patterns.Pattern_State;

public class WinnerState implements State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void ejectQuarter() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void turnCrank() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void dispense() {
        System.out.println("You are winner and we give you additional gum");
        gumballMachine.releaseBall();
        if (gumballMachine.getCountOgGumsInside()==0)
            gumballMachine.setState(gumballMachine.getSoldOutState());
        else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCountOgGumsInside()==0)
                gumballMachine.setState(gumballMachine.getSoldOutState());
            else
                gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
    }
}
