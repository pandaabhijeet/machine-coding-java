import Model.Ride;
import Model.SelectionStrategyType;
import Service.SplitShareService;

public class Main {
    public static void main(String[] args) {
        SplitShareService service = new SplitShareService();

        service.addUser("Rohan", "M", 36);
        service.addVehicle("Rohan", "Swift", "KA-01-12345");

        service.addUser("Shashank", "M", 29);
        service.addVehicle("Shashank", "Baleno", "TS-05-62395");

        service.addUser("Nandini", "F", 29);

        service.addUser("Shipra", "F", 27);
        service.addVehicle("Shipra", "Polo", "KA-05-41491");
        service.addVehicle("Shipra", "Activa", "KA-12-12332");

        service.addUser("Gaurav", "M", 29);

        service.addUser("Rahul", "M", 35);
        service.addVehicle("Rahul", "XUV", "KA-05-1234");

        service.offerRide("Rohan", "Hyderabad", 1, "Swift", "KA-01-12345", "Bangalore");
        service.offerRide("Shipra", "Bangalore", 1, "Activa", "KA-12-12332", "Mysore");
        service.offerRide("Shipra", "Bangalore", 2, "Polo", "KA-05-41491", "Mysore");
        service.offerRide("Shashank", "Hyderabad", 2, "Baleno", "TS-05-62395", "Bangalore");
        service.offerRide("Rahul", "Hyderabad", 5, "XUV", "KA-05-1234", "Bangalore");
        service.offerRide("Rohan", "Bangalore", 1, "Swift", "KA-01-12345", "Pune");

        Ride ride1=service.selectRide("Nandini", "Bangalore", "Mysore", 1, SelectionStrategyType.MOST_VACANT, "None");
        Ride ride2=service.selectRide("Gaurav", "Bangalore", "Mysore", 1, SelectionStrategyType.PREFERRED, "Activa");
        Ride ride3=service.selectRide("Rohan", "Mumbai", "Bangalore", 1, SelectionStrategyType.PREFERRED, "Baleno");
        Ride ride4=service.selectRide("Rohan", "Hyderabad", "Bangalore", 1, SelectionStrategyType.PREFERRED, "Baleno");
        Ride ride5=service.selectRide("Shashank", "Hyderabad", "Bangalore", 1, SelectionStrategyType.PREFERRED, "Polo");


        service.endRide("Rohan", "Hyderabad", 1, "Swift", "KA-01-12345", "Bangalore");
        service.endRide("Shipra", "Bangalore", 1, "Activa", "KA-12-12332", "Mysore");
        service.endRide("Shipra", "Bangalore", 2, "Polo", "KA-05-41491", "Mysore");
        service.endRide("Shashank", "Hyderabad", 2, "Baleno", "TS-05-62395", "Bangalore");
        service.printRideStatus();
    }
}