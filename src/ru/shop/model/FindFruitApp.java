package ru.shop.model;

import java.util.*;

public class FindFruitApp {

    public static int SIZE = 10000000;

    public static void main(String[] args) {

        Collection<Fruit> collection = populateCollection();
        System.out.println(collection.contains(new Apple("Яблоко 500")));
        /*printCollection(collection);*/

    }

    private static void printCollection(List<Fruit> collection) {
        for (int i = 0 ; i < SIZE; i++){
            if (collection.get(i).getName().equals("Золотое Яблоко!")){
                System.out.println("Found index: " + i + " Found apple: " + collection.get(i).toString());
                break;

            } else {
                System.out.println("Found index: " + i );
            }
        }
    }

    private static Collection<Fruit> populateCollection() {

        Set<Fruit> set = new HashSet<>();
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
