package pro.sky.store.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.store.service.CartService;

import java.util.List;

@RestController
@RequestMapping("/order")

public class CartController {
    private final CartService cartService;
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }
    @GetMapping("/add")
    public String add(@RequestParam List<Integer> items){
        cartService.add(items);
        return "Товар добавлен в корзину";

    }
    @GetMapping("/get")
    public List<Integer> get() {
        return cartService.get();
    }

}
