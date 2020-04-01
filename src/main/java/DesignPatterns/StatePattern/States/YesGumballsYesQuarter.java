package DesignPatterns.StatePattern.States;

import DesignPatterns.StatePattern.GumballMachine;

public class YesGumballsYesQuarter implements GumballState {
    @Override
    public void turnHandle(GumballMachine gumballMachine) {
        System.out.println("You turned the handle and got a gumball!");
        gumballMachine.addProfit(.25);
        gumballMachine.setQuarterInserted(false);
        gumballMachine.removeGumball();

        if(gumballMachine.getGumballs() > 0){
            gumballMachine.setCurrentState(new YesGumballsNoQuarter());
        }
        else {
            gumballMachine.setCurrentState(new NoGumballsNoQuarter());
        }
    }

    @Override
    public void removeQuarter(GumballMachine gumballMachine) {
        System.out.println("You removed the quarter from the machine");
        gumballMachine.setQuarterInserted(false);

        gumballMachine.setCurrentState(new YesGumballsNoQuarter());
    }

    @Override
    public void insertQuarter(GumballMachine gumballMachine) {
        System.out.println("You tried to insert a quarter into a slot that already have a quarter");
    }

    @Override
    public void addGumballs(GumballMachine gumballMachine, int count) {
        System.out.println("You added " + count + " more gumballs into a non-empty machine");
        gumballMachine.addGumballsToMachine(count);
    }
}
