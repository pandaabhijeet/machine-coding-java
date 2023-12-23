package Exception;

public class NoVehicleForUser extends RuntimeException{

    public NoVehicleForUser(){
        super("No vehicle with this registration number exists for the user !");
    }
}
