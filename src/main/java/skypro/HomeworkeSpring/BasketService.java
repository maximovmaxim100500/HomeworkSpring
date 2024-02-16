package skypro.HomeworkeSpring;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketService {

    public Basket addItemToBasket(Basket basket, List<Integer> itemIds) {
        if (basket == null) {
            basket = new Basket();
        }
        basket.getItems().addAll(itemIds);
        return basket;
    }

    public static Basket getBasket(Basket basket) {
        if (basket != null) {
            return basket;
        }
        return null;
    }
}
