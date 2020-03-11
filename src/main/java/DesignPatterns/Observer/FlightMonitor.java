package DesignPatterns.Observer;

public class FlightMonitor {
	
	public static void main(String[] args) {
	
		FlightFeed feed = new FlightFeed();
		feed.attach(new ObserverSimple());
		feed.attach(new ObserverDeltas());
		feed.start();
	}
	
}