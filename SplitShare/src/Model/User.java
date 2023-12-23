package Model;

import java.util.List;
import Exception.VehicleAlreadyExists;
import Exception.NoVehicleForUser;

public class User {
    private int age;
    private String userName;
    private String userGender;
    private List<Vehicle> vehicles;
    private List<Ride> ridesShared;
    private List<Ride> ridesTaken;

    public User(int age, String userName, String userGender, List<Vehicle> vehicles, List<Ride> ridesShared, List<Ride> ridesTaken) {
        this.age = age;
        this.userName = userName;
        this.userGender = userGender;
        this.vehicles = vehicles;
        this.ridesShared = ridesShared;
        this.ridesTaken = ridesTaken;
    }

    public User(int age, String userName, String userGender) {
        this.age = age;
        this.userName = userName;
        this.userGender = userGender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Ride> getRidesShared() {
        return ridesShared;
    }

    public void setRidesShared(List<Ride> ridesShared) {
        this.ridesShared = ridesShared;
    }

    public List<Ride> getRidesTaken() {
        return ridesTaken;
    }

    public void setRidesTaken(List<Ride> ridesTaken) {
        this.ridesTaken = ridesTaken;
    }

    public void addRidesShared(Ride ride){ridesShared.add(ride);}

    public void addRidesTaken(Ride ride){ridesTaken.add(ride);}

    public void addVehicle(Vehicle vehicle){
        if (vehicles.contains(vehicle)){
            throw new VehicleAlreadyExists();
        }
        vehicles.add(vehicle);
    }

    public boolean checkVehicle(String regNo){
        boolean flag = false;

        for (Vehicle v : vehicles){
            if (v.getRegistrationNo().equals(regNo)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
