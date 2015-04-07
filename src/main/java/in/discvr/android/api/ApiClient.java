package in.discvr.android.api;

import in.discvr.android.dto.RequestDTO;
import in.discvr.android.models.PersistentObject;
import in.discvr.android.models.User;
import in.discvr.android.models.transactions.Order;

import java.util.List;

/**
 * This class will talk to the Discvr JSON API.<br/>
 * There can be different classes to talk to different subsets of API
 * but for now let's assume that this client class does all the communication for us.
 * @author shuklaalok7
 * @since 7/4/15 15:06
 */
public class ApiClient {
    private String clientId;
    private String clientSecret;

    public ApiClient(String clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    /**
     * Searches for the objects of type <code>tClass</code>
     * @param tClass        The class of the objects to get from the server
     * @param requestDTO    RequestDTO to filter the results
     * @param <T>           extends Object. I might want to restrain it to PersistentObject only.
     * @return List of found objects after converting from JSON obtained from API
     */
    public <T> List<T> search(Class<T> tClass, RequestDTO<T> requestDTO) {
        // Create an API request to get these objects
        // On successful return, convert JSON to T objects,
        // here Question object and embedded Answer objects would be instantiated.
        // return List of T's
        return null;
    }

    /**
     * @param username           username
     * @param encodedPassword    Base64 encoded password
     * @return Logged in User object or <code>null</code> if login fails
     */
    public User login(String username, byte[] encodedPassword) {
        // Create an API request to login
        // Assuming the server returns, associated User object on successful login
        // Return null, if login fails
        return null;
    }

    /**
     *
     * @param order    Order object
     * @return <code>true</code>, if placed successfully
     */
    public boolean placeOrder(Order order) {
        // Implementation assumed
        return false;
    }

    /**
     * @param persistentObject    persistentObject to push to the server
     * @return <code>id</code>
     */
    public long save(PersistentObject persistentObject) {
        // Implementation assumed
        return 0;
    }
}
