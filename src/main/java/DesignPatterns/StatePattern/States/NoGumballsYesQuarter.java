package DesignPatterns.StatePattern.States;

import DesignPatterns.StatePattern.GumballMachine;

public class NoGumballsYesQuarter implements GumballState {
    @Override
    public void turnHandle(GumballMachine gumballMachine) {
        System.out.println("You turned the handle but didn't get a gumball - the machine is empty!");
        gumballMachine.addProfit(.25);
        gumballMachine.setQuarterInserted(false);

        gumballMachine.setCurrentState(new NoGumballsNoQuarter());
    }

    @Override
    public void removeQuarter(GumballMachine gumballMachine) {
        System.out.println("You removed the quarter from the machine");
        gumballMachine.setQuarterInserted(false);

        gumballMachine.setCurrentState(new NoGumballsNoQuarter());
    }

    @Override
    public void insertQuarter(GumballMachine gumballMachine) {
        System.out.println("You tried to insert a quarter into a slot that already have a quarter");
    }

    @Override
    public void addGumballs(GumballMachine gumballMachine, int count) {
        System.out.println("You added " + count + " gumballs into an empty machine");
        gumballMachine.addGumballsToMachine(count);

        gumballMachine.setCurrentState(new YesGumballsYesQuarter());
    }
}
