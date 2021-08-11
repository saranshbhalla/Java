package com.saranshbhalla.java.generics.demos.customgenerics;

/**
 * <E> marks a class as generic
 */

public class Cage<E extends Animal> {
    /**
     * There is no parent class of Lion and monkey, so let's specify the type of animal as Object
     * But this would allow someone to add Lion and Monkey in the same cage.
     *
     * We want to enfore that only one kind of animal be put in one cage.
     * So that can be implemented using Generics.
     */
    private E animal1;
    private E animal2;


    public Cage(E animal1, E animal2){
        this.animal1 = animal1;
        this.animal2=animal2;
    }

    public Cage(){}

    public E getAnimal1() {
        return animal1;
    }

    public void setAnimal1(E animal1) {
        this.animal1 = animal1;
    }

    public E getAnimal2() {
        return animal2;
    }

    public void setAnimal2(E animal2) {
        this.animal2 = animal2;
    }

    public boolean isCompatible(E animal1, E animal2){
        return animal1.getType() == animal1.getType();
        //TODO: question : will the parent method run if it is overriden in the child class ?
    }
}
