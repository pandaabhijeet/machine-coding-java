package Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import Model.User;
import Exception.UserAlreadyExists;
import Exception.InvalidUser;

public class UserManager {
    public Map<String, User> userMap;

    public UserManager() {
        this.userMap = new HashMap<>();
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void addUser(User user){

            if (userMap.containsKey(user.getUserName())){
                throw new UserAlreadyExists();
            }

            userMap.put(user.getUserName(),user);
    }

    public User getUser(String name){

            if (userMap.containsKey(name)){
                throw new InvalidUser();
            }

            return userMap.get(name);
    }

    public Collection<User> usersCollection(){
        return userMap.values();
    }
}
