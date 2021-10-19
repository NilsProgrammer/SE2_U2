import java.util.Calendar;

public class User {
    private final String username;
    private final String email;
    private final String password;
    private final Calendar birthdate;

    public User(String username, String email, String password, Calendar birthdate) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.birthdate = birthdate;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Calendar getBirthdate() {
        return birthdate;
    }

    @Override
    public String toString() {
        return this.username + " " + this.email + this.password + this.birthdate.toString();
    }
}
