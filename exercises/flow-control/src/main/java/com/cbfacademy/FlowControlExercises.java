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
        List<Integer> listNumIntegers = new ArrayList<>();

        for (int i=0; i<= 100; i++ ){
            listNumIntegers.add(i);
        }

        int sumOfEvens = 0;
        int sumOfOdds = 0;

        for (Integer i : listNumIntegers) {
            if (i % 2 == 0){
               sumOfEvens += i; //  - determines the sum of all the even numbers in the list
               //like writing sumOfEvens = sumOfEvens + i;
            } else {
                sumOfOdds += i; //  - determines the sum of all the odd numbers in the list
            }
        }
        //  - returns a map with two entries:
        Map<String, Integer> returnMap = new HashMap<>();
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}

        returnMap.put("SumOfEvens", sumOfEvens);
        returnMap.put("SumOfOdds", sumOfOdds);

        return returnMap;
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // Implement this method such that
        //  - it takes an array list of integers
        List<Integer> revList = new ArrayList<>(); 
        //  - it returns the list in reverse order
        for (int i = numbers.size() -1; i>=0; i--) {
            revList.add(numbers.get(i));
        }
        return revList;
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
