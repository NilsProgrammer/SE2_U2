import java.util.Calendar;

public class User {
    private final String userID;
    private final String username;
    private String email;
    private final String password;
    private Calendar birthdate;

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

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public Calendar getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Calendat date) {
        this.birthdate = date;
    }

    @Override
    public String toString() {
        return this.username + " " + this.email + this.password + this.birthdate.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }
}
