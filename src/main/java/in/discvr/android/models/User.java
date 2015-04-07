package in.discvr.android.models;

import in.discvr.android.models.provided.Location;
import lombok.Getter;
import lombok.Setter;

import java.io.File;

/**
 * User object is for the user of the application
 * @author shuklaalok7
 * @since 7/4/15 05:03
 */
@Getter
@Setter
public class User extends PersistentObject {

    private String username;
    private String password;
    private File profilePicture;

    private Location location;
    private Contact contact;

}
