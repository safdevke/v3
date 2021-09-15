package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Cart {

    int cartId;
    Map<Integer,Map<Integer, List>> cart;

    public Cart(Map<Integer,Map<Integer, List>> cart) {
        this.cart = cart;
    }

}
