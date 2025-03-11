package com.rama.app.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListStream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        Stream stream = list.stream();
        stream.forEach(System.out::println);
        List<Integer> evenNumbers = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);
        List<Integer> oddNumbers = list.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        System.out.println("Odd numbers: " + oddNumbers);
    }
}