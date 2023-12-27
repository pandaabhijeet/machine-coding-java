package Models;

import java.util.ArrayList;
import java.util.List;

public class Location {

    String locationName;
    int noOfTheaters;
    List<Theater> theaters;
    List<Movie> moviesShowing;

    public Location() {
        this.moviesShowing = new ArrayList<>();
    }

    public Location(String locationName, int noOfTheaters, List<Theater> theaters) {
        this.locationName = locationName;
        this.noOfTheaters = noOfTheaters;
        this.theaters = theaters;
        this.moviesShowing = new ArrayList<>();
    }

    public Location(String locationName){
        this.locationName = locationName;
        this.theaters = new ArrayList<>();
        this.moviesShowing = new ArrayList<>();
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public int getNoOfTheaters() {
        return noOfTheaters;
    }

    public void setNoOfTheaters(int noOfTheaters) {
        this.noOfTheaters = noOfTheaters;
    }

    public List<Theater> getTheaters() {
        return theaters;
    }

    public void setTheaters(List<Theater> theaters) {
        this.theaters = theaters;
    }

    public List<Movie> getMoviesShowing() {
        return moviesShowing;
    }

    public void setMoviesShowing(List<Movie> moviesShowing) {
        this.moviesShowing = moviesShowing;
    }
}
