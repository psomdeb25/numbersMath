package com.science.anarky;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Character.getNumericValue;

public class randGen {
    private static String userInput;
    private static Random rand;

    public static void main(String[] args) {
        rand = new Random();
        ArrayList<Integer> randNum = new ArrayList<Integer>();
        Scanner scn = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.print("Please enter a number: ");
        userInput = scn.next();
        for (int n = 0; n <= userInput.length() - 1; n++) {
            if (getNumericValue(userInput.charAt(n)) % 2 == 0) {
                randNum.add(oddRandNo());
            } else if (getNumericValue(userInput.charAt(n)) % 2 != 0) {
                randNum.add(evenRandNo());
            }
        }
        String stringRandNum = null;
        for (int m : randNum) {
            stringRandNum = String.valueOf(sb.append(m));
        }
        System.out.println("Your random number is " + stringRandNum);
    }

    public static int oddRandNo() {
        int x = rand.nextInt(9);
        while(x%2 == 0) {
            x = rand.nextInt(9);
        }
        return x;
    }
    public static int evenRandNo() {
        int z = rand.nextInt(9);
        while(z%2 != 0) {
            z = rand.nextInt(9);
        }
        return z;
    }
}


