package Exceptions;

public class TheaterAlreadyExists extends RuntimeException{
    public TheaterAlreadyExists(){
        super("Theater already exists in this city !");
    }
}
