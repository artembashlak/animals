package com.waverleysoftware;

public abstract class Reptile extends Animal {

    public Reptile(int age, String name) {
        super(age, name);
    }

    public void feedKids(){
        System.out.println("I feed kids with meat");
    }

}
