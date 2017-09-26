package com.waverleysoftware;

public abstract class Mammal extends Animal {

    public Mammal(int age, String name) {
        super(age, name);
    }

    public void feedKids(){
        System.out.println("Feed with milk");
    }


}
