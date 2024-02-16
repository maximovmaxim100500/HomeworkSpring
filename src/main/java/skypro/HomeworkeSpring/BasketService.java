package skypro.HomeworkeSpring;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketService {

    public Basket addItemToBasket(Basket basket, List<Integer> itemIds) {
        if (basket == null) {
            basket = new Basket();
        }
        for (int itemId:itemIds) {
            basket.addItem(itemId);
        }
        return basket;
    }

    public static Basket getBasket(Basket basket) {
        if (basket != null) {
            return basket;
        }
        return null;
    }
}
