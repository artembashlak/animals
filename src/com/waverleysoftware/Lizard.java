package com.waverleysoftware;

public class Lizard extends Reptile {
    public Lizard(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {

    }

    @Override
    public void move() {
        System.out.println("We run !");
    }
}
