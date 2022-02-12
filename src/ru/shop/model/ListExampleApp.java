package ru.shop.model;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class ListExampleApp {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        String fileName = sc.next();
        File f = new File(fileName);
        if (!f.exists()) {
            f.createNewFile();
            System.out.println("Файл создан " + f.getAbsolutePath());
        } else {
            System.out.println("Файл уже существует ");
        }


        /*f.deleteOnExit();*/




        LinkedList<Apple> list1 = new LinkedList<>();

        Map<String, PersonProfile> list2 = new TreeMap<>();

        list1.add(new Apple("Красное яблоко"));
        list1.addFirst(new Apple("Желтое яблоко"));
        list1.addFirst(new Apple("Зеленое яблоко"));


    }

}
