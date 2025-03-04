package com.rama.app.list;

import java.util.ArrayList;
import java.util.List;

public class ListSamples {
    public static List<String> stringList = new ArrayList<String>();
    public void add(String data){
        stringList.add(data);
    }
    public void printList(){
        for(String data : stringList){
            System.out.println(data);
        }
    }
    public void remove(String data){
        stringList.remove(data);
    }
    public void sizeOfList(){
        System.out.println(stringList.size());
    }
    public static void main(String[] args) {
        ListSamples listSamples = new ListSamples();
        listSamples.add("test1"); // Index 0
        listSamples.add("test2"); // Index 1
        listSamples.add("test3"); // Index 2
        listSamples.printList();
        System.out.println("Value at Index 1: "+stringList.get(1));
        stringList.set(1,"Rajeev");
        System.out.println("Value at Index 1: "+stringList.get(1));
        stringList.remove(1);
        listSamples.printList();
        listSamples.sizeOfList();
        listSamples.printList();
        listSamples.sizeOfList();
        listSamples.add("test4");
        System.out.println("After remove");
        listSamples.remove("test2");
    }
}