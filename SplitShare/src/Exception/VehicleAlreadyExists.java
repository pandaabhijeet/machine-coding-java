package Exception;

public class VehicleAlreadyExists extends RuntimeException{

    public VehicleAlreadyExists() {
        super("Vehicle already exists !");
    }
}
