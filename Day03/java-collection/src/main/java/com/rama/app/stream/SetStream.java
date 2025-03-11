package com.rama.app.stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SetStream {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        Stream<Integer> stream = set.stream();
        stream.forEach(System.out::println);
        for(Integer i : set) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        for(Integer i : set) {
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
        List<Integer> evenNumbers = set.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);
        List<Integer> oddNumbers = set.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        System.out.println("Odd numbers: " + oddNumbers);
    }
}