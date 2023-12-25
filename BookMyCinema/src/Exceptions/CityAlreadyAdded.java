package Exceptions;

public class CityAlreadyAdded extends RuntimeException{

    public CityAlreadyAdded(){
        super("This city already exists : ");
    }
}
