package DesignPatterns.StatePattern;

import DesignPatterns.StatePattern.States.NoGumballsNoQuarter;
import DesignPatterns.StatePattern.States.GumballState;

public class GumballMachine {
    //Track money made, how many gumballs it contains, if there's a quarter in the slot.
    GumballState currentState;
    double profit;
    int gumballs;
    boolean quarterInserted;

    public GumballMachine() {
        currentState = new NoGumballsNoQuarter();
        profit = 0;
        gumballs = 0;
        quarterInserted = false;
    }

    void addGumballs(int count) { // adds more gumballs to the machine
        currentState.addGumballs(this, count);
    }

    void insertQuarter() { // inserts a quarter into the slot
        currentState.insertQuarter(this);
    }
    void removeQuarter() { // removes the quarter currently in the slot (user changed their mind)
        currentState.removeQuarter(this);
    }
    void turnHandle() { // consumes quarter and dispenses gumballs
        currentState.turnHandle(this);
    }

    @Override
    public String toString() {
        return "\nGumballMachine{" +
                "currentState=" + currentState.getClass().toString() +
                ", profit=" + profit +
                ", gumballs=" + gumballs +
                ", quarterInserted=" + quarterInserted +
                "}" +
                "\nPress:\n1 to add gumballs\n2 to insert a quarter\n3 to remove quarter\n4 to turn handle\n";
    }

    public void setCurrentState(GumballState state){
        currentState = state;
    }

    public void addProfit(double profit) {
        this.profit += profit;
    }

    public void addGumballsToMachine(int gumballs) {
        this.gumballs = gumballs;
    }

    public void setQuarterInserted(boolean quarterInserted) {
        this.quarterInserted = quarterInserted;
    }

    public void removeGumball(){
        gumballs--;
    }

    public int getGumballs() {
        return gumballs;
    }
}
