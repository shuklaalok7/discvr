package in.discvr.android.dto;

import in.discvr.android.models.Company;
import in.discvr.android.models.provided.Location;
import in.discvr.android.models.transactions.Purchasable;
import lombok.Getter;
import lombok.Setter;

/**
 * @author shuklaalok7
 * @since 7/4/15 21:51
 */
@Getter
@Setter
public class PurchasableRequestDTO extends RequestDTO<Purchasable> {
    private Company provider;
    private Location serviceLocation;

}
