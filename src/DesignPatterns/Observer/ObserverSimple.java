package DesignPatterns.Observer;

public class ObserverSimple implements ObserverInterface {
    @Override
    public void update(Flight flight) {
        System.out.println("Flight info:  " + flight.toString());
    }
}
