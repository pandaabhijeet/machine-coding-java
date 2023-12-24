package Model;

import Repository.RideManager;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import Exception.NoRideFound;

public class PreferredVehicleStrategyImpl implements SelectionStrategy{
    @Override
    public Ride findRide(String origin, String destination, int seats, RideManager rideManager, String vehicle) {
        Map<UUID,Ride> activeRides = rideManager.getActiveRides();
        Ride potentialRide = null;

        for (Ride r: activeRides.values()){
            if (r.getOrigin().equals(origin) && r.getDestination().equals(destination)){
                if(r.getAvailableSeats() >= seats){
                    if (r.getVehicleModel().equals(vehicle)){
                        potentialRide =r;
                    }
                }
            }
        }

        if (potentialRide == null){
            throw new NoRideFound();
        }

        return potentialRide;
    }
}
