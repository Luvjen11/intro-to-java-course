package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // create an empty linked list
        LinkedList<Integer> integers = new LinkedList<>();
        //  - add 4 as the first element of the list
        integers.add(4);
        //  - then add 5, 6, 8, 2, 9 to the list
        integers.add(5);
        integers.add(6);
        integers.add(8);
        integers.add(2);
        integers.add(9);
        //  - add another 2 as the last element of the list
        integers.addLast(2);
        //  - add 4 as the 3rd element of the list
        integers.add(2,4);
        //  - invoke the method element() on the list and print the result on the screen
        System.out.println(integers.element());
        //  - return the list
        return integers;
    }

    public Stack<Integer> useStack() {
        // create an empty stack
        Stack<Integer> stacky = new Stack<>();
        //  - add 5, 6, 8, 9 to the stack
        stacky.add(5);
        stacky.add(6);
        stacky.add(8);
        stacky.add(9);
        //  - print the first element of the stack on the screen
        System.out.print(stacky.firstElement());
        //  - print the last element of the stack on the screen
        // int lastEle = stacky.lastElement(); 
        System.out.print(stacky.lastElement());
        //  - invoke the method pop() on the stack and print the result on the screen
        System.out.print(stacky.pop());
        //  - invoke the push(4) method on the stack
        stacky.push(4);
        //  - return the stack
        return stacky;
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // create an empty arrayDeque
        ArrayDeque<Integer> arrayD = new ArrayDeque<>();
        //  - add 5, 6, 8, 9 to the queue
        arrayD.add(5);
        arrayD.add(6);
        arrayD.add(8);
        arrayD.add(9);
        //  - print the first element of the queue on the screen
        System.out.print(arrayD.peekFirst());
        //  - print the last element of the queue on the screen
        System.out.print(arrayD.peekLast());
        //  - invoke the method poll() on the queue and print the result on the screen
        // int arrayDpoll = arrayD.poll();
        System.out.print(arrayD.poll());
        //  - invoke the element() method on the queue and print the result on the screen
        System.out.print(arrayD.element());
        //  - return the queue
        return arrayD;
    }

    public HashMap<Integer, String> useHashMap() {
        // create an empty hash map
        HashMap<Integer, String> programminglang = new HashMap<>();
        //  - add {1, TypeScript} entry to the map
        programminglang.put(1,"TypeScript");
        //  - add {2, Kotlin} entry to the map
        programminglang.put(2,"Kotlin");
        //  - add {3, Python} entry to the map
        programminglang.put(3,"Python");
        //  - add {4, Java} entry to the map
        programminglang.put(4,"Java");
        //  - add {5, JavaScript} entry to the map
        programminglang.put(5,"JavaScript");
        //  - add {6, Rust} entry to the map
        programminglang.put(6,"Rust");
        //  - determine the set of keys from the map and print it on the screen
        System.out.print(programminglang.keySet());
        //  - determine the set of values from the map and print it on the screen
        System.out.print(programminglang.values());
        //  - determine whether the map contains "English" as a language and print the result on the screen
        System.out.print(programminglang.containsValue("English"));
        //  - return the HashMap
        return programminglang;
    }

    public String getName() {
        return "Collections Exercises";
    }
}
