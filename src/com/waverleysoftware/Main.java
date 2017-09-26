package com.waverleysoftware;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        Animal someCat = new Cat(10,"Vasia");
        Animal somePenguin = new Penguin(4,"Petyx" );
        listOfAnimals.add(someCat);
        listOfAnimals.add(new Dolphin(6,"Kisa"));
        listOfAnimals.add(new Lizard(3,"Pes"));
        Animal someSnake = new Snake(8,"Artur");
        listOfAnimals.add(someSnake);
        listOfAnimals.add(somePenguin);

        for (int i = 0; i < listOfAnimals.size(); i++) {
            System.out.println(listOfAnimals.get(i).getClass().getSimpleName());
            listOfAnimals.get(i).eat();
            listOfAnimals.get(i).move();
            listOfAnimals.get(i).sleep();
            listOfAnimals.get(i).feedKids();
            System.out.println("Ma name is " + listOfAnimals.get(i).getName());
            System.out.println("I'm "+ listOfAnimals.get(i).getAge() + " years old.");
            System.out.println("~~~~~~~");
        }
    }
}
