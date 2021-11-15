import java.util.Calendar;

public class UserDTO {
    private int ID;
    private String username;
    private String email;
    private String password;
    private Calendar birthdate;
    private String address;

    public UserDTO() {

    }

    public UserDTO(int ID, String username, String email, String password, Calendar birthdate, String address) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.birthdate = birthdate;
        this.address = address;
    }

    public int getID() {return ID;}
    public void setID(int value) {this.ID = value;}

    public String getUsername() {return username;}
    public void setUsername(String value) {this.username = value;}

    public String getEmail() {return email;}
    public void setEmail(String value) {this.email = value;}

    public String getPassword() {return password;}
    public void setPassword(String value) {this.password = value;}

    public Calendar getBirthdate() {return birthdate;}
    public void setBirthdate(Calendar value) {this.birthdate = value;}

    public String getAddress() {return address;}
    public void setAddress(String value) {this.address = value;}

    @Override
    public String toString() {
        return this.username + " " + this.email + this.password + this.birthdate.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }

    
    public boolean equals(UserDTO other) {
        return
            this.ID == other.ID &&
            this.username == other.username &&
            this.email == other.email &&
            this.password == other.password &&
            this.birthdate.compareTo(other.birthdate) == 0 &&
            this.address.compareTo(other.address) == 0;
    }
}
