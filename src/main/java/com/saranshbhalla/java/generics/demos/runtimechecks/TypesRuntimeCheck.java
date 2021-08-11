package com.saranshbhalla.java.generics.demos.runtimechecks;

public class TypesRuntimeCheck {
    public static void main(String[] args) {
        String[] namesArray = new String[5];
        addToArray(namesArray, "name 1");
        incorrectAddToArray(namesArray, 100);
        String name = namesArray[0];
    }

    private static void incorrectAddToArray(Object[] namesArray, Integer i) {
        namesArray[0]=i;
        /**
         * Here we tried to cheat the compiler. But when we run the code, it fails at this line.
         *
         * the type info for the arrays is linked to the object and is there for a runtime construct.
         *
         * However, in case of generics -- in example GenericsRuntimeCheck, the execution continues at this step
         * which shows that the Generics is not a runtime construct
         */

    }

    private static void addToArray(String[] namesArray, String s) {
        namesArray[0]=s;
    }

}
