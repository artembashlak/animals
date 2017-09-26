package com.waverleysoftware;

public class Snake extends Reptile implements Action {


    public Snake(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("SNAKE ONLY KILL");
    }

    @Override
    public void move() {
        System.out.println("MOVE TO FIGHT");
    }

}
