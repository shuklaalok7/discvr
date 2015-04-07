package in.discvr.android.models.transactions;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author shuklaalok7
 * @since 7/4/15 08:13
 */
@Getter
@Setter
public class Combo extends AbstractPurchasable {

    private List<Item> items;

}
