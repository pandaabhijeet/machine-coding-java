package Model;

import Repository.RideManager;

import java.util.Map;
import java.util.UUID;
import Exception.NoRideFound;

public class MostVacantStrategyImpl implements SelectionStrategy {

    @Override
    public Ride findRide(String origin, String destination, int seats, RideManager rideManager, String vehicle) {

        Map<UUID,Ride> activeRides = rideManager.getActiveRides();
        Ride potentialRide = null;
        int maxAvailableSeats = 0 ;

        for(Ride r : activeRides.values()){
            if(r.getOrigin().equals(origin) && r.getDestination().equals(destination)){
                if (r.getAvailableSeats() >= (seats)){
                    if(r.getAvailableSeats() > maxAvailableSeats){
                        maxAvailableSeats = r.getAvailableSeats();
                        potentialRide = r;
                    }
                }
            }
        }

        System.out.println("No Rides Found !");
        return potentialRide;
    }
}
