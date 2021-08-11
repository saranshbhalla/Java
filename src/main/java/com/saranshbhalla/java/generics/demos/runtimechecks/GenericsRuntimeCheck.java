package com.saranshbhalla.java.generics.demos.runtimechecks;

import java.util.ArrayList;
import java.util.List;

public class GenericsRuntimeCheck {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        addToNames(names,"name1");
        addToNames(names,"name2");
        System.out.println(names);
        incorrectAddToNames(names, 100);
        System.out.println(names);
        String str = names.get(2);

        /**1. Generics is a compile time construct
         *
         * 2. Generics do no apply to the instance. i.e. in this case, it is not applied to the list object. Instead
         * it is a property of the variable name. Compiler just makes sure that the variable name is associated to the
         * assigned parameterized type.
         *
         * 3. Once all compile checks are done, the compiler removes all generics information and makes it the original List type (without generics)
         * This is called type erasure
         */

    }

    private static void addToNames(List<String> names, String s) {
        names.add(s);
    }

    private static void incorrectAddToNames(List list, Integer i) {
        list.add(i);
    }

}
