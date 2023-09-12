package pro.sky.store.service;

import java.util.List;

public interface CartService {
    void add (List<Integer> items);
    List<Integer> get();
}
