package Service;

import Model.*;
import Repository.RideManager;
import Repository.UserManager;
import Exception.NoRideFound;

import java.util.Collection;
import java.util.List;

public class SplitShareService {

    private RideManager rideManager;
    private UserManager userManager;

    public SplitShareService() {
        this.rideManager = new RideManager();
        this.userManager = new UserManager();
    }

    public void addUser(String name, String gender, int age) {

        try {

            User user = new User(age, name, gender);
            userManager.addUser(user);

            System.out.println("User : " + user.getUserName() + " successfully added !");

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public void addVehicle(String userName, String model, String regNo) {

        try {
            Vehicle vehicle = new Vehicle(model, regNo, userName);
            User user = userManager.getUser(userName);

            user.addVehicle(vehicle);
            System.out.println("Vehicle : " + model + " and Registration No: " + vehicle.getRegistrationNo() + " registered for " + userName);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public void offerRide(String name, String origin, int availableSeats, String model, String vehicleNo, String destination) {

        User user = userManager.getUser(name);
        if (user.checkVehicle(vehicleNo)) {
            try {
                Ride ride = new Ride(origin, destination, user.getUserName(), availableSeats, vehicleNo, model);
                rideManager.addRidesOffered(ride,ride.getOfferedBy());
                System.out.println("Ride with id : " + ride.getRideId() + " and Registration No: " + ride.getVehicleNum()
                        + "and model :" + ride.getVehicleModel() + " and with seats: " + ride.getAvailableSeats() +
                        " has been offered by " + ride.getOfferedBy());

            } catch (Exception e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }

    public Ride selectRide(String name, String origin, String destination, int seats, SelectionStrategyType strategyType, String model) {
        Ride ride = null;

        try {
            if (strategyType.equals(SelectionStrategyType.PREFERRED)) {
                PreferredVehicleStrategyImpl prefVehicleStg = new PreferredVehicleStrategyImpl();
                ride = prefVehicleStg.findRide(origin, destination, seats, rideManager, model);
            }

            if (strategyType.equals(SelectionStrategyType.MOST_VACANT)) {
                MostVacantStrategyImpl mostVacantStg = new MostVacantStrategyImpl();
                ride = mostVacantStg.findRide(origin, destination, seats, rideManager, model);
            }

            if (ride != null) {
                ride.addPassengers(name, seats);
            } else {
                throw new NoRideFound();
            }
            System.out.println(ride.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return ride;
    }

    public void endRide(String name,String origin,int seats,String model,String regNo,String destination){
        Ride ride = rideManager.endRide(regNo);
        ride.endRide();
        String offeredBy = ride.getOfferedBy();
        User user = userManager.getUser(offeredBy);
        user.addRidesShared(ride);

        List<String> selectedBy = ride.getSelectedBy();

        for (String s : selectedBy){
           user = userManager.getUser(s);
           user.addRidesTaken(ride);
        }
    }

    public void printRideStatus(){
        Collection<User> users = userManager.usersCollection();

        for (User user:users) {

            System.out.println("User : "+user.getUserName()+" has taken " +user.getRidesTaken().size() +" rides and shared "
                    + user.getRidesShared().size() + " !");
        }
    }
}
