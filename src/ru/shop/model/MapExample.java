package ru.shop.model;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {

        Map<String, Map<String, Integer>> map = new HashMap<>();

        populateMap(map);
        Map <String, Integer> operations = map.get("6667-1111-2222-3333");
        System.out.println(operations);
        System.out.println(operations.get("Перевод за ипотеку") + " рублей");
        Set<Map.Entry<String, Integer>> set = operations.entrySet();
        for (Map.Entry<String, Integer> entry: set){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(set);
        System.out.println("Вывод каждого элемента ");
        System.out.println(list.get(0) + " нулевой элемент");
        System.out.println(list.get(1) + " первый элемент");
        System.out.println(list.get(2) + " второй элемент");

        Object [] objects = list.toArray();


    }

    public static void populateMap(Map<String, Map<String, Integer>> myMap) {
        myMap.put("1234-5677-2345-1213", Map.of("Покупка продуктов в магните", 1231, "Перевод маме", 1222));
        myMap.put("6667-1111-2222-3333", Map.of("Оплата связи", 111, "Перевод за ипотеку", 35000, "Оплата продуктов", 3000));

    }
}
