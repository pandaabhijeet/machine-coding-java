package Models;

import Exceptions.MovieAlreadyInUserList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class User {
    private UUID userId;
    private String userName;
    private String phoneNum;
    private String location;
    private int age;
    private char gender;
    private HashMap<String,Movie> moviesWatched;

    public User()
    {
    }

    public User(UUID userId, String userName, String phoneNum, String location, int age, char gender)
    {
        this.userId = userId;
        this.userName = userName;
        this.phoneNum = phoneNum;
        this.location = location;
        this.age = age;
        this.gender = gender;
        this.moviesWatched = new HashMap<>();
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public HashMap<String,Movie> getMoviesWatched() {
        return moviesWatched;
    }

    public void setMoviesWatched(HashMap<String,Movie> moviesWatched) {
        this.moviesWatched = moviesWatched;
    }

    public void addMoviesWatched(String movieName, Movie movie)
    {
        if(moviesWatched.containsKey(movieName))
        {
            throw new MovieAlreadyInUserList();
        }

        moviesWatched.put(movieName,movie);
    }
}
