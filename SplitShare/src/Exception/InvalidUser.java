package Exception;

public class InvalidUser extends RuntimeException {
    public InvalidUser() {
        super("No such user exists! ");
    }
}
