package com.saranshbhalla.java.generics.demos.inheritance;

import java.util.ArrayList;
import java.util.List;

public class GenericsInheritance {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("name 1");
        names.add("name 2");
        printList(names);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        printList(numbers);
        printNumbers(numbers);

        List<Double> doubles = new ArrayList<>();
        doubles.add(1.0);
        doubles.add(2.0);
        printList(doubles);
        printNumbers(doubles);
    }

    /**Generics using wildcards
     *A person can add a <?> which would mean it's a list of SOME type - which we don't know what.
     * So this function will allow ANYTHING to be passed
     *
     * this function will only allow retrieval of the data as an Object type.
     * But since no type is defined in the declaration, there is no way to insert values to the list in this function
     */
    private static void printList(List<?> names) {
        names.forEach(System.out::println);
    }

    /**
     * This will allow a list of Numbers or a subtype of Number
     * You still cannot add elements to the list
     * @param names
     */
    private static void printNumbers(List<? extends Number> names) {
        names.forEach(System.out::println);
    }


    /**
     * The function listed down won't work
     * while generally an Integer/String can be passed into an Object parameter, it's not the case
     * with the lists. For Lists you can only pass the same kind of object and none other -- which
     * means that the concept of polymorphism (assigning child object to parent ref) doesn't work here.
     *
     * But why? because in case of lists, there are implications
     * what if we try to add a String to an incoming list of Integers -- this will break the type safety
     * @param names
     */
    private static void printLists(List<Object> names) {
        names.forEach(System.out::println);
    }

}
