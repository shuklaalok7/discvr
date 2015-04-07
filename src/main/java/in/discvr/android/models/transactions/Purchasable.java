package in.discvr.android.models.transactions;

import in.discvr.android.models.Company;

import java.io.Serializable;

/**
 * @author shuklaalok7
 * @since 7/4/15 05:23
 */
public interface Purchasable extends Serializable {

    /**
     *
     * @return Name of the Purchasable to display
     */
    public String getName();

    /**
     * @return Price of this purchasable
     */
    public double getPrice();

    /**
     *
     * @return Company which provides this purchasable
     */
    public Company getProvider();

    /**
     *
     * @return Quantity of the Purchasable to be shipped/served
     */
    public double getQuantity();

}
