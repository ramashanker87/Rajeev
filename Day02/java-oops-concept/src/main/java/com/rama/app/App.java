package com.rama.app;
import com.rama.app.model.Animal;
public class App {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name="dog";
        animal.weight=15;
        animal.callAnimal();
        animal.animalDetail();
        Animal cow = new Animal(120,"Cow");
        cow.animalDetail();
    }
}