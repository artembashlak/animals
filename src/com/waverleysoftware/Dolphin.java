package com.waverleysoftware;

public class Dolphin extends Mammal{
    public Dolphin(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("Dolphin eat. ");
    }

    @Override
    public void sleep() {
        System.out.println("Dolphin sleep in water ");
    }

    @Override
    public void move() {
        System.out.println("Dolphin move. ");

    }
}
