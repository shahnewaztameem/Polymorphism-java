package com.java.polymorphism;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine() called";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() +  " -> accelerate() called";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake() called";
    }
}
