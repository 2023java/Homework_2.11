package pro.sky.store.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Cart {
    private List<Integer> items;

    public Cart () {
        items = new ArrayList<>();
    }
    public void add (Integer item){
        items.add(item);
    }

    public List<Integer> getItems() {
        return items;
    }
}
