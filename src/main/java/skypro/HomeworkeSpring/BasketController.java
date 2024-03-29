package skypro.HomeworkeSpring;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public Basket add(@RequestParam("ID") List<Integer> itemIDs, HttpSession session) {
        Basket basket = (Basket) session.getAttribute("basket");
        basket = basketService.addItemToBasket(basket, itemIDs);
        session.setAttribute("basket", basket);
        return basket;
    }

    @GetMapping("/get")
    public Basket get(HttpSession session) {
        Basket basket = (Basket) session.getAttribute("basket");
        return BasketService.getBasket(basket);
    }

}
