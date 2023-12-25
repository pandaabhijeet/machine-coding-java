package Exceptions;

public class MovieAlreadyExists extends RuntimeException{

    public MovieAlreadyExists(){
        super("Movie already exists!");
    }

}
