package skypro.HomeworkeSpring;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketService {
    private Basket basket;

    public BasketService(Basket basket) {
        this.basket = basket;
    }

    public void addItemToBasket(List<Integer> itemIds) {
        if (basket == null) {
            basket = new Basket();
        }
        for (int itemId : itemIds) {
            basket.addItem(itemId);
        }
    }

    public List<Integer> getBasket() {
        if (basket != null) {
            return basket.getItems();
        }
        return null;
    }
}
