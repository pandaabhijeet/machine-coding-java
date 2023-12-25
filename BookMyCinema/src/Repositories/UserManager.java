package Repositories;

import Exceptions.UserAlreadyExists;
import Models.User;

import java.util.HashMap;
import java.util.UUID;

public class UserManager {

    private HashMap<String,User> usersForPhone = new HashMap<>();

    public void addUser(User user){
        if (usersForPhone.containsKey(user.getPhoneNum()))
        {
            throw new UserAlreadyExists();
        }

        usersForPhone.put(user.getPhoneNum(), user);
    }

}
