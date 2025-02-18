package com.rama.app.model;
public class Animal {
    public int weight;
    public String name;
    public Animal(){

    }
    public Animal(int weight, String name){
        this.weight = weight;
        this.name = name;
    }
    public void callAnimal(){
        System.out.println("Calling animal");
    }
    public void animalDetail(){
        System.out.println("Animal Weight:"+weight +" Name:"+name);
    }
}