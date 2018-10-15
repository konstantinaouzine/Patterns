package Patterns.Pattern_State;

import javax.naming.OperationNotSupportedException;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
