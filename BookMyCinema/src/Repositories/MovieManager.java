package Repositories;

import Exceptions.CityAlreadyAdded;
import Exceptions.MovieAlreadyExists;
import Models.Movie;

import java.util.*;

public class MovieManager {

    private HashMap<String, Movie> movieForName = new HashMap<>();

    public void addMovie(Movie movie){
        if (movieForName.containsKey(movie.getMovieName()))
        {
            throw new MovieAlreadyExists();
        }

        movieForName.put(movie.getMovieName(), movie);
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
        System.out.println("Cities Now " + movie.getCitiesRunning());
    }
}
