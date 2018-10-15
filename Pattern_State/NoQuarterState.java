package Patterns.Pattern_State;

public class NoQuarterState implements State {
    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Coin inserted");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No coin inside to eject");
    }

    @Override
    public void turnCrank() {
        System.out.println("Can't turn crank, coz no coin inside");
    }

    @Override
    public void dispense() {
    }
}
