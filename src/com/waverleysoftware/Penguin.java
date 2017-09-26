package com.waverleysoftware;

public class Penguin extends Mammal implements Action {

    Penguin(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("I EAT FISH");
    }

    @Override
    public void move() {
        System.out.println("I can run and SWIM");
    }
}
