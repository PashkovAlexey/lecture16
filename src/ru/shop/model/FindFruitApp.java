package ru.shop.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class FindFruitApp {

    public static void main(String[] args) {
        List<Fruit> collection = populateCollection();
        for (int i = 0 ; i < 70; i++){
            Fruit fruit = collection.get(i);
            if (collection.get(i).getName().equals("Золотое яблоко")){
                System.out.println("Found index: " + i + " Found apple: " + fruit.toString());
            }
        }

    }

    private static List<Fruit> populateCollection() {

        List<Fruit> list = new ArrayList<>();
        for (int i = 0 ; i < 70; i++){
            if (i!=50){
                list.add(new Apple("Яблоко"));
            } else {
                list.add(new Apple("Золотое яблоко"));
            }
        }
        return list;
    }

}
