package Exception;

public class RideAlreadyExists extends RuntimeException{

    public RideAlreadyExists() {
        super("Ride Already Exists!");
    }
}
