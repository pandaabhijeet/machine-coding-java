package Repository;

import Model.Ride;
import Model.RideStatus;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import Exception.RideAlreadyExists;

public class RideManager {

    private Map<UUID,Ride> activeRides;

    public RideManager() {
        this.activeRides = new HashMap<>();
    }

    public Map<UUID, Ride> getActiveRides() {
        return activeRides;
    }

    public void setActiveRides(Map<UUID, Ride> activeRides) {
        this.activeRides = activeRides;
    }

    public void addRidesOffered(Ride ride, String userName){
        for (Ride r : activeRides.values()){
            if (r.getVehicleNum().equals(ride.getVehicleNum())){
                throw new RideAlreadyExists();
            }
        }
        activeRides.put(ride.getRideId(),ride);
    }

    public Ride endRide(String vehicleNo){

        for (Ride r : activeRides.values()){
            if (r.getVehicleNum().equals(vehicleNo)){
                return r;
            }
        }

        return null;
    }
}
