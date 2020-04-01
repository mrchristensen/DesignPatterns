package DesignPatterns.StatePattern.States;

import DesignPatterns.StatePattern.GumballMachine;

public class YesGumballsNoQuarter implements GumballState {
    @Override
    public void turnHandle(GumballMachine gumballMachine) {
        System.out.println("You tried to turn the handle without putting in a quarter, it doesn't turn");
    }

    @Override
    public void removeQuarter(GumballMachine gumballMachine) {
        System.out.println("You tried to remove a quarter that wasn't there");
    }

    @Override
    public void insertQuarter(GumballMachine gumballMachine) {
        System.out.println("You inserted a quarter into the machine");
        gumballMachine.setQuarterInserted(true);

        gumballMachine.setCurrentState(new YesGumballsYesQuarter());
    }

    @Override
    public void addGumballs(GumballMachine gumballMachine, int count) {
        System.out.println("You added " + count + " more gumballs into a non-empty machine");
        gumballMachine.addGumballsToMachine(count);
    }
}
