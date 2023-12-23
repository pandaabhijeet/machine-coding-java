package Repository;

import Model.Ride;
import Model.RideStatus;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class RideManager {
    // private Map<String,List<Ride>> activeRides;
    private Map<UUID, Ride> activeRides;

    public RideManager() {
        this.activeRides=new HashMap<>();
    }

    public Map<UUID,Ride> getActiveRides() {
        return activeRides;
    }

    public void addOfferRide(Ride ride, String userName)
    {
        for(Ride r: activeRides.values())
        {
            if(r.getVehicleNum().equals(ride.getVehicleNum()))
            {
                r.setRideStatus(RideStatus.END);
            }
        }
        activeRides.put(ride.getRideId(), ride);
    }

    public Ride endRide(String vehicleNumber)
    {
        for(Ride r: activeRides.values())
        {
            if(r.getVehicleNum().equals(vehicleNumber))
                return r;
        }
        return null;
    }



}
