package Repositories;

import Exceptions.*;
import Models.Location;
import Models.Movie;
import Models.Seat;
import Models.Theater;

import java.util.*;

public class MovieManager {

    private HashMap<String, Movie> movieForName = new HashMap<>();
    private HashMap<String, Location> locationForName = new HashMap<>();
    private HashMap<String, Theater> theaterByName = new HashMap<>();


    public void addMovie(Movie movie) {
        if (movieForName.containsKey(movie.getMovieName())) {
            throw new MovieAlreadyExists();
        }

        movieForName.put(movie.getMovieName(), movie);

        //List<Movie> moviesRunning = new ArrayList<>();
        //moviesRunning.add(movie);


        for (String s : movie.getCitiesRunning()) {
            Location location;
            if (!locationForName.containsKey(s)) {
                location = new Location(s);
                locationForName.put(s, location);
            } else {
                location = locationForName.get(s);
            }
            location.getMoviesShowing().add(movie);

        }

    }

    public Movie getMovie(String movieName) {

        if (movieForName.containsKey(movieName)) {
            return movieForName.get(movieName);
        }

        return null;
    }

    public void addCityToMovie(String[] cities, Movie movie) {

        List<String> cityList = new ArrayList<>();

        for (String s : cities) {
            if (!movie.getCitiesRunning().contains(s)) {
                if (!cityList.contains(s)) {
                    cityList.add(s);
                }
            } else {
                System.out.println("City already exists : " + s);
            }
        }

        for (String s : cityList) {
            movie.getCitiesRunning().add(s);
        }

        //List<Movie> moviesRunning = new ArrayList<>();
        for (String s : movie.getCitiesRunning()) {
            Location location;
            if (!locationForName.containsKey(s)) {
                location = new Location(s);
                locationForName.put(s, location);
            } else {
                location = locationForName.get(s);
            }

            if(!location.getMoviesShowing().contains(movie)){
                location.getMoviesShowing().add(movie);
            }
        }
        System.out.println("Cities Now " + movie.getCitiesRunning());
    }

    public Location getLocationByName(String locationName) {
        if (locationForName.containsKey(locationName)) {
            return locationForName.get(locationName);
        }

        return null;
    }

    public Theater getTheaterByName(String theaterName) {
        if (theaterByName.containsKey(theaterName)) {
            return theaterByName.get(theaterName);
        }

        return null;
    }

    public void addTheater(Theater theater, String theaterName, Location location) {

        if (location.getTheaters() != null) {
            for (Theater t : location.getTheaters()) {
                if (theaterName.equals(t.getTheaterName())) {
                    throw new TheaterAlreadyExists();
                }
                break;
            }
        }
        location.getTheaters().add(theater);
        theaterByName.put(theaterName, theater);
        System.out.println("Theaters in location now : " + location.getTheaters().get(0).getTheaterName()
                + "," + location.getTheaters().get(1).getTheaterName());
    }

    public void addSeatAndPrice(Theater theater, Seat seatType, float seatPrice) {
        if (!theaterByName.containsKey(theater.getTheaterName())) {
            throw new NoSuchTheater();
        }
        HashMap<Float, Seat> seatWithPriceMap = new HashMap<>();
        seatWithPriceMap.put(seatPrice, seatType);
        theater.setPriceForSeats(seatWithPriceMap);

        System.out.println("Price and seats for theater added : " + seatWithPriceMap);
    }

    public List<Movie> getAllMoviesShowing(Location cityName) {
        if (cityName.getMoviesShowing() == null) {
            throw new NoMoviesShowing();
        }
        return cityName.getMoviesShowing();
    }
}
