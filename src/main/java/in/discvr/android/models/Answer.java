package in.discvr.android.models;

import in.discvr.android.models.provided.Location;
import in.discvr.android.models.transactions.Purchasable;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author shuklaalok7
 * @since 7/4/15 05:18
 */
@Getter
@Setter
public class Answer extends PersistentObject {

    private String displayText;
    private Company provider;

    /**
     * Basically a mechanism to know their operating area
     */
    private Location serviceLocation;

    /**
     * When user clicks on this answer tile/list-item,<br/>
     * we might want to show him the list of items/services relevant to his question.<br/>
     * This field contains those items/services.
     */
    private List<Purchasable> items;

}
