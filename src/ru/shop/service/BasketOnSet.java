package ru.shop.service;

import ru.shop.model.Product;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

public class BasketOnSet implements Basket {

    Collection<Product> products = new HashSet<>();

    @Override
    public void addProduct(Product p) {
        products.add(p);

    }

    @Override
    public Object[] getProducts() {
        return products.toArray();
    }
}
