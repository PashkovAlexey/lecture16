package ru.shop.service;

import ru.shop.model.Product;

import java.util.Objects;

public interface Basket {

    void addProduct(Product p);
    Object[] getProducts();

}
