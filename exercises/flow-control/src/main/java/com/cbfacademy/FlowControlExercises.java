package com.cbfacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // Implement this method such that
        //  it creates a list where for each element of the input list ${numbers}
        List<String> result = new ArrayList<>();
        for (Integer i : numbers) { // for each index(with list type) in numbers(list name) do the following
            //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
            if (i % 3 == 0 && i % 5 == 0) {   
                result.add("FizzBuzz");
            //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
            } else if (i % 5 == 0) {
                result.add("Buzz");
            //  - if the ${element} is divisible by 3, it adds “Fizz” to the list 
            } else if (i % 3 == 0) {
                result.add("Fizz"); 
                //  - it adds the element to the list in any other case     
            } else {   
                result.add(String.valueOf(i)); // Converts the number to a string because this is a String list
            }
        }
        //  - it returns the constructed list 
        return result;
    }

    public String whichMonth(Integer number) {
        // Implement this method such that
        //  - it returns the month corresponding to the input ${number}
        //  - if the ${number} is invalid, the method should return "Invalid month number"
        switch (number) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3: 
                return"March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";      
            default:
                return "Invalid month number";
        }
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        List<Integer> numIntegers = new ArrayList<>();
        int sumOfEvens = 0;
        int sumOfOdds = 0;
        for (int i =1; i>= 100;) {
           if (i % 2 ==0) {
              sumOfEvens += numIntegers.get(i);
           } else {
              sumOfOdds += numIntegers.get(i);
           }
        }
        //  - determines the sum of all the even numbers in the list
        // what is an even number? if I divide by 2 it gives 0 as rest(modulo)
        // odd number? is the opposite of an even number (!even)
        //  - determines the sum of all the odd numbers in the list
        HashMap<String, Integer> resultMap = new HashMap<>();

            resultMap.put("SumOfEvens", sumOfEvens);
            resultMap.put("SumOfOdds", sumOfOdds);

        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        return resultMap;
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // Implement this method such that
        //  - it takes an array list of integers
        List<Integer> revList = new ArrayList<>(); 
        //  - it returns the list in reverse order
        return revList.reversed();
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
