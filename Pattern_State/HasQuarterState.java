package Patterns.Pattern_State;

import java.util.Random;

public class HasQuarterState implements State {
    private GumballMachine gumballMachine;
    private Random random = new Random();

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Coin already inside, can't add another one");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Ejecting coin");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned the crank");
        int winner = random.nextInt(10);
        if ((winner==0) && gumballMachine.getCountOgGumsInside()>1)
        {
            gumballMachine.setState(gumballMachine.getWinnerState());
        }
        else
            gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        throw new UnsupportedOperationException();
    }
}
