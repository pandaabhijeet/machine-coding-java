package Exceptions;

public class NoSuchTheater extends RuntimeException{

    public NoSuchTheater(){
        super("No such theater exists !");
    }
}
