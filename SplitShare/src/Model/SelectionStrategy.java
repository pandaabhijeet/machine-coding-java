package Model;

import Repository.RideManager;

public interface SelectionStrategy {

    public Ride findRide(String origin, String destination,int seats, RideManager rideManager,String vehicle);
}
