package Services;

import Models.Movie;
import Models.User;
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
}
