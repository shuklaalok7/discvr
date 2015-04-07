package in.discvr.android.manager;

import in.discvr.android.dto.PurchasableRequestDTO;
import in.discvr.android.models.Answer;
import in.discvr.android.models.transactions.Cart;
import in.discvr.android.models.transactions.Order;
import in.discvr.android.models.transactions.Purchasable;

import java.util.List;

/**
 * This manager takes over once the user selects an answer
 * @author shuklaalok7
 * @since 7/4/15 21:46
 */
public class OrderManager extends ManagerSupport {

    /**
     * Assume that he select "Coffee shops" in question tile, he will get a list of coffee shops around him<br/>
     * Now when he tap on one of the coffee shops, he need to see the list of beverages provided by that shop.<br/>
     * Those beverages are purchasable.
     * @param answer    The selected answer
     * @return Purchasable which are to be listed after the user selects an answer
     */
    public List<Purchasable> fetchItems(Answer answer) {
        PurchasableRequestDTO purchasableRequestDTO = new PurchasableRequestDTO();
        purchasableRequestDTO.setProvider(answer.getProvider());
        purchasableRequestDTO.setServiceLocation(answer.getServiceLocation());
        return this.apiClient.search(Purchasable.class, purchasableRequestDTO);
    }

    public boolean placeOrder(Order order) {
        return this.apiClient.placeOrder(order);
    }

    /**
     * @param cart    The cart to sync with server
     * @return id of the cart
     */
    public long syncCart(Cart cart) {
        return this.apiClient.save(cart);
    }


    // Methods below are for retrieving/operating on local DB
    // Logic layer calls up DAO layer to perform these actions
    /**
     *
     * @param id    Order ID
     * @return Order retrieved from the local DB
     */
    public Order getOrder(long id) {
        return super.get(Order.class, id);
    }

    public Cart getCart(long id) {
        return super.get(Cart.class, id);
    }

    public Order deleteOrder(long id) {
        return super.delete(Order.class, id);
    }

    public Cart deleteCart(long id) {
        return super.delete(Cart.class, id);
    }
}
