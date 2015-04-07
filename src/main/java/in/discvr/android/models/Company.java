package in.discvr.android.models;

import in.discvr.android.models.provided.Location;
import lombok.Getter;
import lombok.Setter;

/**
 * @author shuklaalok7
 * @since 7/4/15 08:12
 */
@Getter
@Setter
public class Company extends PersistentObject {

    private String displayName;
    private Location location;

    private Contact contact;

}
