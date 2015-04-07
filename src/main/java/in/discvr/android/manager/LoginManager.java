package in.discvr.android.manager;

import in.discvr.android.models.User;

import java.util.Base64;

/**
 * @author shuklaalok7
 * @since 7/4/15 15:50
 */
public class LoginManager extends ManagerSupport {

    /**
     * @param username    Entered username
     * @param password    Entered password
     * @return Logged in User object or <code>null</code> if login fails
     */
    public User login(String username, String password) {
        return this.apiClient.login(username, Base64.getEncoder().encode(password.getBytes()));
    }

    /**
     * @param email       Email to sign-up with
     * @param password    Chosen password
     * @return Newly created User object
     */
    public User signUp(String email, String password) {
        // Sign-up
        return null;
    }

}
