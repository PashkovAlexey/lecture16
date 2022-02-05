package ru.shop.model;

import java.util.Objects;

public abstract class Product {

    private String name;
    private double ves;

    public Product(String name) {
    this.name = name;
    }

    public Product(){

    }

    abstract void eat();
    abstract void makeJuice();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVes() {
        return ves;
    }

    public void setVes(double ves) {
        this.ves = ves;
    }


}
