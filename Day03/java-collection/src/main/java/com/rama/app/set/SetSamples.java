package com.rama.app.set;

import jdk.internal.classfile.impl.CodeStackTrackerImpl;

import java.util.*;

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
        System.out.println("LinkedHashSet: ");
        for(Integer data : setData){
            System.out.println(data);
        }
        Set<Integer> setTreeData = new TreeSet<>();
        setTreeData.add(1234);
        setTreeData.add(567);
        setTreeData.add(89);
        setTreeData.add(0);
        System.out.println("TreeSet: ");
        for(Integer data : setTreeData){
            System.out.println(data);
        }
        System.out.println("Iterator: ");
        Iterator<Integer> iterator = setData.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}