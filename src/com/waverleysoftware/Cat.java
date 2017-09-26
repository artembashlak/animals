package com.waverleysoftware;

public class Cat extends Mammal{

    public int getMoney() {
        return money;
    }

    private int money;

    public Cat(int age, String name) {
        super(age, name);
        this.money = 10;
    }

    public Cat(int age, String name, int money) {
        super(age, name);
        this.money = money;
    }



    @Override
    public void eat() {
        System.out.println("Cat eat. ");
    }

    @Override
    public void move() {
        System.out.println("Cat move. ");

    }

    @Override
    public void feedKids() {
        System.out.println("Cat feed his children");

    }

    public void payMoney() {
        this.money += 10;
    }

    public void payMoney(int someMoney) {
        this.money += someMoney;
    }


}
