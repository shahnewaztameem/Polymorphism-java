package com.java.polymorphism;

public class Main {

    public static void main(String[] args) {
        // Base class
        Car car = new Car(4,"Normal Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        // Sub class
        Audi audi  = new Audi(4,"Audi");
        System.out.println(audi.startEngine());
        System.out.println(audi.accelerate());
        System.out.println(audi.brake());

        // Sub class
        Ford ford  = new Ford(4,"Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
    }
}
