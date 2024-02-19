package skypro.HomeworkeSpring;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public List<Integer> add(@RequestParam("ID") List<Integer> itemIDs) {
        basketService.addItemToBasket(itemIDs);
        return itemIDs;
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return basketService.getBasket();
    }

}
