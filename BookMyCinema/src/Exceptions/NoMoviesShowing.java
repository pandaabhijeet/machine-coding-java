package Exceptions;

public class NoMoviesShowing extends RuntimeException{

    public  NoMoviesShowing(){
        super("No movies showing currently in this city !");
    }
}
