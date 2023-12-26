import Services.CinemaBookingService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CinemaBookingService cinemaBookingService = new CinemaBookingService();

//        cinemaBookingService.addUser("Abhijeet",24,"9668264969","Bhubaneswar",'M');
//        cinemaBookingService.addUser("Nikhil",24,"9668264969","Bhubaneswar",'M');

          cinemaBookingService.addMovie("Fighter", new String[]{"Bhubaneswar", "Delhi", "Mumbai"});
//          cinemaBookingService.addMovie("Fighter", new String[]{"Bhubaneswar", "Delhi", "Mumbai"});
          cinemaBookingService.addMovie("KGF", new String[]{"Bhubaneswar"});
          cinemaBookingService.addMovie("John Wick 4", new String[]{"Bhubaneswar"});

//          cinemaBookingService.addCitiesToMovie("Fighter", new String[]{"Bhubaneswar"});
//          cinemaBookingService.addCitiesToMovie("Fighter", new String[]{"Madurai","Patna"});
//          cinemaBookingService.addCitiesToMovie("Fighter", new String[]{"Madurai","Patna"});
//          cinemaBookingService.addTheaterToLocations("Bhubaneswar","Maharaja",256);
//          cinemaBookingService.addTheaterToLocations("Bhubaneswar","Inox",256);
//          cinemaBookingService.addSeatTypeAndPriceToTheater("Inox","Diamond",400);
//          cinemaBookingService.addSeatTypeAndPriceToTheater("Inox","Platinum",300);
//          cinemaBookingService.addSeatTypeAndPriceToTheater("Inox","Gold",200);
//          cinemaBookingService.addSeatTypeAndPriceToTheater("Inox","Gold",200);

          cinemaBookingService.selectCity("Bhubaneswar");
          cinemaBookingService.selectCity("Delhi");
    }
}
