package in.discvr.android.models.transactions;

import in.discvr.android.models.Address;
import in.discvr.android.models.PersistentObject;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Its <code>id</code> will serve as ORDER ID.
 * @author shuklaalok7
 * @since 7/4/15 13:18
 */
@Getter
@Setter
public class Order extends PersistentObject {
    private Cart cart;
    private LocalDateTime orderedOn;
    /**
     * To be populated, if applicable<br/>
     * A few types of services might not require a physical address to get delivered.
     */
    private Address shippingAddress;
    private Address billingAddress;
}
