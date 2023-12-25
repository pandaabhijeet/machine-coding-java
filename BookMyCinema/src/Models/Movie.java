package Models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class Movie {

    private UUID movieId;
    private String movieName;
    private List<String> citiesRunning;
    private int noOfTicketsBooked;
    private HashMap<LocalDate,List<LocalTime>> timeSlotsForDate;

    public Movie(){}
    public Movie(UUID movieId,String movieName, List<String> citiesRunning) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.citiesRunning = citiesRunning;
        this.timeSlotsForDate = new HashMap<>();
    }

    public UUID getMovieId() {
        return movieId;
    }

    public void setMovieId(UUID movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public List<String> getCitiesRunning() {
        return citiesRunning;
    }

    public void setCitiesRunning(List<String> citiesRunning) {
        this.citiesRunning = citiesRunning;
    }

    public int getNoOfTicketsBooked() {
        return noOfTicketsBooked;
    }

    public void setNoOfTicketsBooked(int noOfTicketsBooked) {
        this.noOfTicketsBooked = noOfTicketsBooked;
    }

    public HashMap<LocalDate, List<LocalTime>> getTimeSlotsForDate() {
        return timeSlotsForDate;
    }

    public void setTimeSlotsForDate(HashMap<LocalDate, List<LocalTime>> timeSlotsForDate) {
        this.timeSlotsForDate = timeSlotsForDate;
    }

}
