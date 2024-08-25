package com.cbfacademy.strings;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }

    public static String concatenate(String word1, String word2, String word3) {
        // Write code that concatenates the input parameters and returns the result
        String concatenated = word1 + word2 + word3;
        System.out.println(concatenated);
        return concatenated;
    }

    public static Boolean areEqual(String word1, String word2) {
        // Write code to determine whether the input parameters are equal strings
        boolean equaltest = word1.equals(word2);
        System.out.println(equaltest);
        return equaltest;
    }

    public static String format(String item, int quantity, double price) {
        // Write code to return a string formatted as follows: "Item: [item]. Price: £[amount]. Quantity: [quantity]". The date should be formatted as DD/MM/YYYY, e.g. 24/10/2023
        String myStr = String.format("Item: %s. Price: £%.2f. Quantity: %d", item, price, quantity);
        return myStr;
    }
}
