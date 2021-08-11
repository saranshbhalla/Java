package com.saranshbhalla.java.generics.demos.customgenerics;

public class Zoo {
    public static void main(String[] args) {
        /**
         * One way of using the generics -- first create the object and then add values
         */
        Cage<Monkey> cage = new Cage<Monkey>();
        cage.setAnimal1(new Monkey());
        cage.setAnimal2(new Monkey());

        Cage<Lion> lionCage = new Cage<Lion>();
        lionCage.setAnimal1(new Lion());
        lionCage.setAnimal2(new Lion());

        /**
         * Second way of using the generics
         */

        Cage<Monkey> cage2 = new Cage( new Lion(), new Monkey());
        // ^^^ this line doesn't give an error because the generic type of E is
        // not defined on the right side.
        //
        // new Cage<Monkey>( new Lion(), new Monkey()); will give the compile-time error
        // that we are looking for. That is why it is recommended to keep the <> on the right
        // when you have arguments being passed to constructor
    }
}
