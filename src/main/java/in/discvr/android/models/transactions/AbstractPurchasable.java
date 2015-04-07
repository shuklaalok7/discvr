package in.discvr.android.models.transactions;

import in.discvr.android.models.Company;
import in.discvr.android.models.PersistentObject;
import lombok.Getter;
import lombok.Setter;

/**
 * @author shuklaalok7
 * @since 7/4/15 10:24
 */
@Getter
@Setter
public class AbstractPurchasable extends PersistentObject implements Purchasable {
    private String name;
    private double price;
    private Company provider;

}
