package ru.shop.model;


public class Apple extends Fruit implements Comparable {

public Apple(String name){
    super(name);
}



    @Override
    public void eat() {

    }

    @Override
    public void makeJuice() {

    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
