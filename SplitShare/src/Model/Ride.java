package Model;

import java.util.List;
import java.util.UUID;

public class Ride {

    private UUID rideId;
    private String origin;
    private String destination;
    private String offeredBy;
    private List<String> selectedBy;
    private int availableSeats;
    private String vehicleNum;
    private String vehicleModel;
    private RideStatus rideStatus;

    public Ride(String origin, String destination, String offeredBy, List<String> selectedBy, int availableSeats, String vehicleNum, String vehicleModel, RideStatus rideStatus) {
        this.rideId = UUID.randomUUID();
        this.origin = origin;
        this.destination = destination;
        this.offeredBy = offeredBy;
        this.selectedBy = selectedBy;
        this.availableSeats = availableSeats;
        this.vehicleNum = vehicleNum;
        this.vehicleModel = vehicleModel;
        this.rideStatus = rideStatus;
    }

    public UUID getRideId() {
        return rideId;
    }

    public void setRideId(UUID rideId) {
        this.rideId = rideId;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getOfferedBy() {
        return offeredBy;
    }

    public void setOfferedBy(String offeredBy) {
        this.offeredBy = offeredBy;
    }

    public List<String> getSelectedBy() {
        return selectedBy;
    }

    public void setSelectedBy(List<String> selectedBy) {
        this.selectedBy = selectedBy;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public String getVehicleNum() {
        return vehicleNum;
    }

    public void setVehicleNum(String vehicleNum) {
        this.vehicleNum = vehicleNum;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public RideStatus getRideStatus() {
        return rideStatus;
    }

    public void setRideStatus(RideStatus rideStatus) {
        this.rideStatus = rideStatus;
    }

    public void endRide(){
        this.rideStatus = RideStatus.END;
    }
}
