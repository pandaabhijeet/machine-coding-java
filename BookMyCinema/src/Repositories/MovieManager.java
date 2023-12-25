package Repositories;

import Exceptions.CityAlreadyAdded;
import Exceptions.MovieAlreadyExists;
import Models.Movie;

import java.util.HashMap;
import java.util.Objects;

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

        for (String s: movie.getCitiesRunning()) {

            for(String city : cities){
                if (!city.equals(s)){
                    movie.getCitiesRunning().add(city);
                }else{
                    System.out.print(city + "Already exists in the list");
                }
            }
        }
    }
}
