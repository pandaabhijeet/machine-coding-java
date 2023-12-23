package Exception;

import Model.User;

public class UserAlreadyExists extends RuntimeException{

    public UserAlreadyExists(){
        super("User Already Exists !");
    }
}
