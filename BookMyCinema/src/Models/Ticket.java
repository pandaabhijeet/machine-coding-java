package Models;

import java.util.UUID;

public class Ticket {
    UUID ticketId;
    Float price;
    Movie movie;
    Theater theater;
    int forNoOfSeats;
    String seatName;

    public Ticket() {
    }

    public Ticket(UUID ticketId, Float price, Movie movie, Theater theater, int forNoOfSeats, String seatName) {
        this.ticketId = ticketId;
        this.price = price;
        this.movie = movie;
        this.theater = theater;
        this.forNoOfSeats = forNoOfSeats;
        this.seatName = seatName;
    }

    public UUID getTicketId() {
        return ticketId;
    }

    public void setTicketId(UUID ticketId) {
        this.ticketId = ticketId;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    public int getForNoOfSeats() {
        return forNoOfSeats;
    }

    public void setForNoOfSeats(int forNoOfSeats) {
        this.forNoOfSeats = forNoOfSeats;
    }

    public String getSeatName() {
        return seatName;
    }

    public void setSeatName(String seatName) {
        this.seatName = seatName;
    }
}
