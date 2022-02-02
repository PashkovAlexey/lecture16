package ru.shop.service;

import ru.shop.model.Product;

public class BasketOnArray {

    private int basketIndex;
    private int regenArayIndex;

    private Product[] products = new Product[10];


    public void addProduct(Product p) {
        if (regenArayIndex >= 10){
            Product[] products2 = new Product[products.length + 10];
            System.arraycopy(products, 0, products2, 0, products.length);
            products = products2;
            regenArayIndex = 0 ;
        }

        products[basketIndex++] = p;
        regenArayIndex++;


    }


    public int getBasketIndex() {
        return basketIndex;
    }

    public void setBasketIndex(int basketIndex) {
        this.basketIndex = basketIndex;
    }

    public Product[] getProducts() {
        return products;
    }


}
