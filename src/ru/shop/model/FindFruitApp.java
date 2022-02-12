package ru.shop.model;

import java.util.*;

public class FindFruitApp {

    public static int SIZE = 1000;

    public static void main(String[] args) {

        Collection<Fruit> collection = populateCollection();
        System.out.println(new Apple("Яблоко 1200").hashCode());

        printCollection(collection);
        System.out.println(collection.contains(new Apple("Яблоко 1200")));

    }

    private static void printCollection(Collection<Fruit> collection) {
        for (Fruit f : collection){
        System.out.println(f.getName() + " " + f.hashCode());
        }
    }

    private static Set<Fruit> populateCollection() {

        HashSet<Fruit> set = new HashSet<>();
        for (int i = 0 ; i < SIZE; i++){

            set.add(new Apple("Яблоко " + String.valueOf(i)));

            /*if (i!= 623){
                set.add(new Apple("Яблоко!"));
            } else {
                set.add(new Apple("Золотое Яблоко!"));
            }*/
        }
        return set;
    }

}
