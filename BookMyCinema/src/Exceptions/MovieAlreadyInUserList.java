package Exceptions;

public class MovieAlreadyInUserList extends RuntimeException{

    public MovieAlreadyInUserList(){
        super("Movie already present in user's list of watched movies !");
    }
}
