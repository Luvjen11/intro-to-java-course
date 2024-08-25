package com.cbfacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // Implement this method such that
        //  it creates a list where for each element of the input list ${numbers}
        //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
        //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
        //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
        //  - it adds the element to the list in any other case
        //  - it returns the constructed list
        for (int i = 1; i <= numbers.size(); i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
        return fizzBuzz(numbers);
    }

    public String whichMonth(Integer number) {
        // Implement this method such that
        //  - it returns the month corresponding to the input ${number}
        //  - if the ${number} is invalid, the method should return "Invalid month number"
        switch (number) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3: 
                System.out.println("March");
                break;
            case 4:
                 System.out.println("April");
                 break;
            case 5:
                 System.out.println("May");
                 break;
            case 6:
                 System.out.println("June");
                 break;
            case 7:
                 System.out.println("July");
                 break;
            case 8:
                 System.out.println("August");
                 break;
            case 9:
                 System.out.println("September");
                 break;
            case 10:
                 System.out.println("October");
                 break;
            case 11:
                 System.out.println("November");
                 break;
            case 12:
                 System.out.println("December");
                 break;        
            default:
                 System.out.println("Invalid month number");
                break;
        }
        return whichMonth(number);
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        //  - determines the sum of all the even numbers in the list
        //  - determines the sum of all the odd numbers in the list
        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
       List<Integer> numIntegers = new ArrayList<>();

        for (int i = 0; i<= 100; i++) {
           numIntegers.add(i);
           //int calculatedSumOfEvens = 0;
           //int calculatedSumOfOdds = 0;
           if (i % 2 == 0) {
               numIntegers.iterator();
           } else {
              numIntegers.add(i);
           }
        }

        // sumOfOddsAndSumOfEvens().put("SumOfEvens", calculatedSumOfEvens);
       // sumOfOddsAndSumOfEvens().put("SumofOdds", calculatedSumOfOdds);

        return sumOfOddsAndSumOfEvens();
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // Implement this method such that
        //  - it takes an array list of integers
        //  - it returns the list in reverse order
        List<Integer> revList = new ArrayList<>(); {
            revList.reversed();
        }
        return reverse(numbers);
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
