package Model;

public class Vehicle {

    private String vehicleModel;
    private String registrationNo;
    private String userName;

    public Vehicle(String vehicleModel, String registrationNo, String userName) {
        this.vehicleModel = vehicleModel;
        this.registrationNo = registrationNo;
        this.userName = userName;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
