package BackEnd;

import java.io.Serializable;

public class User implements Serializable {
    
    protected String Email;
    protected String Password;

    public User(String email, String password) {
        Email = email;
        Password = password;
    }

    public User() {

    }
}
