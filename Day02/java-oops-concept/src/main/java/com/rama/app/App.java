package com.rama.app;

import com.rama.app.concept.Calculator;
import com.rama.app.concept.Student;
import com.rama.app.model.Animal;
import com.rama.app.model.Goat;
import com.rama.app.model.Lion;

public class App {
    public static void main(String[] args) {
        Lion l = new Lion();
        Goat goat = new Goat();

        l.eat();
        goat.eat();

        l.sleep();
        goat.sleep();

        Calculator calculator = new Calculator();
        calculator.add(1,2);
        calculator.add(1.0,2.0);
        calculator.add(1,2,3);

        Animal animal = new Animal();
        animal.eat();

        Student student = new Student();
        student.setAge(25);
        student.setName("Rajeev");
        student.setRoll("134");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getRoll());
        student.studentDetail();
    }
}