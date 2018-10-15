package Patterns.Pattern_State;

public class GumballMachine {
    private NoQuarterState noQuarterState;
    private HasQuarterState hasQuarterState;
    private SoldState soldState;
    private SoldOutState soldOutState;
    private WinnerState winnerState;

    private int countOgGumsInside;
    private State currentState;

    public GumballMachine(int countOfBalls) {
        this.countOgGumsInside = countOfBalls;
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.soldOutState = new SoldOutState(this);
        this.winnerState = new WinnerState(this);
        if (countOfBalls>0)
            currentState = noQuarterState;
        else
            currentState = soldOutState;
    }

    void setState(State newState){
        currentState = newState;
    }

    public void insertQuarter(){
        currentState.insertQuarter();
    }

    public void ejectQuarter(){
        currentState.ejectQuarter();
    }

    public void turnCrank() {
        currentState.turnCrank();
        currentState.dispense();

    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getWinnerState(){
        return winnerState;
    }

    public int getCountOgGumsInside() {
        return countOgGumsInside;
    }

    public void setCountOgGumsInside(int countOgGumsInside) {
        this.countOgGumsInside = countOgGumsInside;
    }

    void releaseBall() {
        if (countOgGumsInside>0)
        {
            countOgGumsInside--;
            System.out.println("Gumball comes out");
        }
    }

    void refillMachineWithGums(int addedGums){
        countOgGumsInside = countOgGumsInside + addedGums;
        if (currentState != noQuarterState)
            currentState = noQuarterState;
    }
}
