package ru.shop.service;

import ru.shop.model.Product;

import java.util.*;

public class BasketOnList implements Basket{

    Collection<Product> products = new ArrayList<>();


    @Override
    public void addProduct(Product p) {

    products.add(p);

    }

    @Override
    public Object[] getProducts() {
        return products.toArray();
    }
}
