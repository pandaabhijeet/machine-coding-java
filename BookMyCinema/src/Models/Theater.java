package Models;

import java.util.HashMap;
import java.util.List;

public class Theater {

    String theaterName;
    HashMap<Integer,Seat> noOfSeats;
    List<Movie> currentMovie ;
    HashMap<Float,Seat> priceForSeats;
    int totalSeats;

    public Theater(String theaterName, int totalSeats){
        this.theaterName = theaterName;
        this.totalSeats = totalSeats;
    }

    public Theater(String theaterName, HashMap<Integer, Seat> noOfSeats) {
        this.theaterName = theaterName;
        this.noOfSeats = noOfSeats;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public HashMap<Integer, Seat> getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(HashMap<Integer, Seat> noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public List<Movie> getCurrentMovie() {
        return currentMovie;
    }

    public void setCurrentMovie(List<Movie> currentMovie) {
        this.currentMovie = currentMovie;
    }

    public HashMap<Float, Seat> getPriceForSeats() {
        return priceForSeats;
    }

    public void setPriceForSeats(HashMap<Float, Seat> priceForSeats) {
        this.priceForSeats = priceForSeats;
    }
}
