package DesignPatterns.StatePattern.States;

import DesignPatterns.StatePattern.GumballMachine;

public interface State {
    void turnHandle(GumballMachine gumballMachine);

    void removeQuarter(GumballMachine gumballMachine);

    void insertQuarter(GumballMachine gumballMachine);

    void addGumballs(GumballMachine gumballMachine, int count);
}
