import Services.CinemaBookingService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CinemaBookingService cinemaBookingService = new CinemaBookingService();

//        cinemaBookingService.addUser("Abhijeet",24,"9668264969","Bhubaneswar",'M');
//        cinemaBookingService.addUser("Nikhil",24,"9668264969","Bhubaneswar",'M');

          cinemaBookingService.addMovie("Fighter", new String[]{"Bhubaneswar", "Delhi", "Mumbai"});
          //cinemaBookingService.addMovie("Fighter", new String[]{"Bhubaneswar", "Delhi", "Mumbai"});
          //cinemaBookingService.addCitiesToMovie("Fighter", new String[]{"Bhubaneswar"});
          cinemaBookingService.addCitiesToMovie("Fighter", new String[]{"Madurai","Patna"});
    }
}
