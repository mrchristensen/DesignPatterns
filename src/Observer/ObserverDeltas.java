package Observer;

public class ObserverDeltas implements ObserverInterface {
    Flight previousFlight;

    @Override
    public void update(Flight flight) {
        if(previousFlight == null){
            previousFlight = flight;
            return;
        }

        float longDelta = previousFlight.longitude - flight.longitude;
        float latDelta = previousFlight.latitude - flight.latitude;
        float velocityDelta = previousFlight.velocity - flight.velocity;
        float altitudeDelta = previousFlight.geo_altitude - flight.geo_altitude;

        System.out.println("Delta info:  lon delta: " + longDelta + ", lat delta: " + latDelta + ", velocity delta: " +
                velocityDelta + ", altitude delta: " + altitudeDelta);

        previousFlight = flight;
    }
}
