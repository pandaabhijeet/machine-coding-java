package Repositories;

import Exceptions.CityAlreadyAdded;
import Exceptions.MovieAlreadyExists;
import Exceptions.TheaterAlreadyExists;
import Models.Location;
import Models.Movie;
import Models.Theater;

import java.util.*;

public class MovieManager {

    private HashMap<String, Movie> movieForName = new HashMap<>();
    private HashMap<String, Location> locationForName = new HashMap<>();
    private HashMap<String, Theater> theaterByName = new HashMap<>();

    public void addMovie(Movie movie){
        if (movieForName.containsKey(movie.getMovieName()))
        {
            throw new MovieAlreadyExists();
        }

        movieForName.put(movie.getMovieName(), movie);

        for(String s : movie.getCitiesRunning()){
            if(!locationForName.containsKey(s)){
                Location location = new Location(s);
                locationForName.put(s,location);
            }

        }
    }

    public Movie getMovie(String movieName){

        if(movieForName.containsKey(movieName)){
            return movieForName.get(movieName);
        }

        return null;
    }

    public void addCityToMovie(String[] cities, Movie movie){

        List<String> cityList = new ArrayList<>();

        for (String s: cities) {
            if (!movie.getCitiesRunning().contains(s)){
                if(!cityList.contains(s)){
                    cityList.add(s);
                }
            }else{
                System.out.println("City already exists : "+s);
            }
        }

        for (String s:cityList){
            movie.getCitiesRunning().add(s);
        }

        for(String s : movie.getCitiesRunning()){
            if(!locationForName.containsKey(s)){
                Location location = new Location(s);
                locationForName.put(s,location);
            }

        }
        System.out.println("Cities Now " + movie.getCitiesRunning());
    }

    public Location getLocationByName(String locationName){
        if(locationForName.containsKey(locationName)){
            return locationForName.get(locationName);
        }

        return null;
    }

    public void addTheater(Theater theater, String theaterName, Location location) {

        if(location.getTheaters() != null){
            for(Theater t : location.getTheaters()){
                if (theaterName.equals(t.getTheaterName())){
                    throw new TheaterAlreadyExists();
                }
                break;
            }
        }
        location.getTheaters().add(theater);
        System.out.println("Theaters in location now : " + location.getTheaters().get(0).getTheaterName()
        + "," +location.getTheaters().get(1).getTheaterName());
    }
}
