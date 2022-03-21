package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> exampleOne = new ArrayList<String>();
        exampleOne.add("One");
        exampleOne.add("Two");
        exampleOne.add("Three");
        exampleOne.add("One");
        Iterator<String> iteratorOne = exampleOne.iterator();
        while (iteratorOne.hasNext()) {
            String value = iteratorOne.next();
            if (value == "Two") {
                iteratorOne.remove();
            }
        }
        for (String s : exampleOne) {
            System.out.println(s);
        }

        HashSet<String> exampleTwo = new HashSet<>();
        exampleTwo.add("One");
        exampleTwo.add("Two");
        exampleTwo.add("Three");
        Iterator<String> iteratorTwo = exampleTwo.iterator();
        System.out.println();
        while (iteratorTwo.hasNext()) {
            System.out.println(iteratorTwo.next());
        }


        Map<String, Integer> exampleThree = new HashMap<>();
        exampleThree.put("One", 1);
        exampleThree.put("Two", 1);
        exampleThree.put("Three", 1);
        Iterator<String> iteratorThee = exampleThree.keySet().iterator();
        System.out.println();
        while (iteratorThee.hasNext()) {
            String value = iteratorThee.next();
            System.out.println(value);
        }
    }
}
