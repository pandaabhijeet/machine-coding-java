package Services;

import Models.*;
import Repositories.MovieManager;
import Repositories.UserManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class CinemaBookingService {

    public UserManager userManager = new UserManager();
    public MovieManager movieManager = new MovieManager();

    public void addUser(String name, int age, String phoneNo, String location, char gender){

        User user = new User(UUID.randomUUID(),name,phoneNo,location,age,gender);
        try{

            userManager.addUser(user);
            System.out.println("User: "+name+" with Phone No: "+phoneNo + " successfully added !");

        }catch(Exception e){
            System.out.println("Exception in adding user: " + e.getMessage());
        }

    }

    public void addMovie(String movieName, String[] cities){

        List<String> citiesRunning = new ArrayList<>(Arrays.asList(cities));

        Movie movie = new Movie(UUID.randomUUID(),movieName,citiesRunning);

        try{
            movieManager.addMovie(movie);
            System.out.println("Movie: "+movieName+" with availability : "+ citiesRunning + " successfully added !");

        }catch(Exception e){
            System.out.println("Exception in adding movie: "+e.getMessage());
        }
    }

    public void addCitiesToMovie(String movieName, String[] newCities){
        Movie movie = movieManager.getMovie(movieName);

        try{
            if (movie != null){
                movieManager.addCityToMovie(newCities,movie);
                System.out.println("Cities have been added to the movie !");
            }
        }catch(RuntimeException e){
            System.out.println("Exception in adding cities: "+e.getMessage());
        }
    }

    public void addTheaterToLocations(String location, String theaterName, int noOfSeats){

        Location locationCity = movieManager.getLocationByName(location);
        Theater theater = new Theater(theaterName,noOfSeats);

        try{
            if(locationCity != null){
                movieManager.addTheater(theater,theaterName,locationCity);
                System.out.println("Theater : " +theaterName +" added to location : " + location);
            }
        }catch(Exception e){
            System.out.println("Exception in adding theater: "+e.getMessage());
        }
    }

    public void addSeatTypeAndPriceToTheater(String theaterName, String seatType, float price){
        Theater theater = movieManager.getTheaterByName(theaterName);
        Seat seatSelType;
          if(theater != null){
              try{
                  switch (seatType) {
                      case "Diamond" -> {
                          seatSelType = Seat.DIAMOND;
                          movieManager.addSeatAndPrice(theater, seatSelType, price);
                      }
                      case "Platinum" -> {
                          seatSelType = Seat.PLATINUM;
                          movieManager.addSeatAndPrice(theater, seatSelType, price);
                      }
                      case "Gold" -> {
                          seatSelType = Seat.GOLD;
                          movieManager.addSeatAndPrice(theater, seatSelType, price);
                      }
                      default -> {
                          System.out.println("Exception in adding Seat type and price: Invalid Seat Type!");
                      }
                  }


              }catch(Exception e){
                  System.out.println("Exception in adding Seat type and price: "+e.getMessage());
              }
          }
    }
}
