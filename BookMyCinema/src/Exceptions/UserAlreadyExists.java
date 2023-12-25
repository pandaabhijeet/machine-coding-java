package Exceptions;

import Models.User;

public class UserAlreadyExists extends RuntimeException{
    public UserAlreadyExists(){
        super("User already exists !");
    }
}
