package in.discvr.android.models;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author shuklaalok7
 * @since 7/4/15 09:58
 */
@Getter
@Setter
public class Contact implements Serializable {

    /**
     * Map of label and number<br/>
     * Labels such as Home, Work, Mobile etc
     */
    private Map<String, String> phoneNumbers;


    /**
     * Map of label and number<br/>
     * Labels such as Home, Work etc
     */
    private Map<String, String> emails;

    /**
     * Map of labels and addresses
     */
    private Map<String, Address> addresses;

    public Contact() {
        this.phoneNumbers = new HashMap<String, String>();
        this.emails = new HashMap<String, String>();
        this.addresses = new HashMap<String, Address>();
    }
}
