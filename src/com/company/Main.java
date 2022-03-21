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
        System.out.println(iteratorOne.hasNext());
        System.out.println(exampleOne.contains("Two") + " TEST");
        while (iteratorOne.hasNext()) {
            String value = iteratorOne.next();
            if (value == "Two") {
                iteratorOne.remove();
            }
        }
        System.out.println(exampleOne.contains("Two") + " TEST");
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
        System.out.println();
        Iterator<Map.Entry<String, Integer>> iteratorFour = exampleThree.entrySet().iterator();
        while (iteratorFour.hasNext()) {
            Map.Entry<String, Integer> entry = iteratorFour.next();
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }
    }
}
