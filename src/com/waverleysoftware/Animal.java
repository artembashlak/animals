package com.waverleysoftware;

public abstract class Animal implements Action {

    private int age;
    private String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public abstract void eat();
    public  void sleep(){
        System.out.println("Animals like to sleep!");
    }
    public abstract void feedKids();

}

