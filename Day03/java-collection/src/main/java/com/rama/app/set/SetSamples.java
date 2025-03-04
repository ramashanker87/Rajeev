package com.rama.app.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetSamples {
    public static void main(String[] args) {
        Set<String> setString = new HashSet();
        setString.add("test5");
        setString.add("test6");
        setString.add("A");
        setString.add("B");
        setString.add("c");
        setString.add("d");
        for(String data : setString){
            System.out.println(data);
        }
        Set<Integer> setData = new LinkedHashSet<>();
        setData.add(1234);
        setData.add(567);
        setData.add(89);
        setData.add(0);
        for(Integer data : setData){
            System.out.println(data);
        }
    }
}