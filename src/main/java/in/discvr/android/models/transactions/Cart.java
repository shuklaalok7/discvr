package in.discvr.android.models.transactions;

import in.discvr.android.models.Address;
import in.discvr.android.models.PersistentObject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shuklaalok7
 * @since 7/4/15 05:20
 */
@Getter
@Setter
public class Cart extends PersistentObject {

    // Whom this cart belongs to
    private long userId;

    // Billing and shipping addresses can be saved with User object too
    private Address billingAddress;
    private Address shippingAddress;

    private List<Purchasable> items;

    public Cart() {
        this.items = new ArrayList<Purchasable>();
    }

    public double getTotalPrice() {
        double price = 0;
        for(Purchasable item: items) {
            price+=item.getPrice();
        }
        return price;
    }

}
