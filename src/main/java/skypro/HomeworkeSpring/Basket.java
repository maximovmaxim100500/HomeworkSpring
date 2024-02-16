package skypro.HomeworkeSpring;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Integer> items = new ArrayList<>();

    public void addItem(Integer item) {
        items.add(item);
    }

    public List<Integer> getItems() {
        return items;
    }
}
