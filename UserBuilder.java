import java.util.Calendar;

public class UserBuilder {
    UserDTO user;

    public static UserBuilder please() {
        return new UserBuilder();
    }

    public UserDTO done() {
        return this.user;
    }

    public UserBuilder and() {
        return this; //lol
    }

    public UserBuilder createDefaultUser() {
        this.user.setID(1);
        this.user.setUsername("Max Mustermann");
        this.user.setEmail("maxmustermann@gmail.com");
        this.user.setPassword("password");
        this.user.setBirthdate(Calendar.getInstance());
        this.user.setAddress("Musterstrasse 1, 10000 Musterstadt");
        return this;
    }

    public UserBuilder createNewUser() {
        this.user = new UserDTO();

        return this;
    }

    public UserBuilder withID(int value) {
        this.user.setID(value);

        return this;
    }

    public UserBuilder withNoID() {
        this.user.setID(-1);
        
        return this;
    }

    public UserBuilder withUserName(String username) {
        this.user.setUsername(username);

        return this;
    }

    public UserBuilder withNoUsername() {
        this.user.setUsername(null);

        return this;
    }

    public UserBuilder withEmail(String value) {
        this.user.setEmail(value);

        return this;
    }

    public UserBuilder withNoEmail() {
        this.user.setEmail(null);

        return this;
    }

    public UserBuilder withPassword(String password) {
        this.user.setPassword(password);

        return this;
    }

    public UserBuilder withNoPassword() {
        this.user.setPassword(null);

        return this;
    }

    public UserBuilder withBirthdate(Calendar value) {
        this.user.setBirthdate(value);

        return this;
    }

    public UserBuilder withNoBirthdate() {
        this.user.setBirthdate(null);

        return this;
    }

    public UserBuilder withAddress(String value) {
        this.user.setAddress(value);

        return this;
    }

    public UserBuilder withNoAddress() {
        this.user.setAddress(null);

        return this;
    }
}