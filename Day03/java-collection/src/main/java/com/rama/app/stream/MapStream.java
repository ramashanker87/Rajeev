package com.rama.app.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStream {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1234);
        map.put("B", 567);
        map.put("c", 89);
        map.put("d", 0);
        Map<String, Integer> filterValue = map.entrySet().stream().filter(e -> e.getValue() > 0).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("Filter Value: "+filterValue);
        Map<String, Integer> filterLess1234Value = map.entrySet().stream().filter(e -> e.getValue() < 1234).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("Filter Less1234 Value: "+filterLess1234Value);
    }
}