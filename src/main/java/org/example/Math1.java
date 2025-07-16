package org.example;

public class Math1 {


    public static int task1(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array must have at least one element");
        }

        int max = array[0];
        int min = array[0];

        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        return max - min;
    }

    // Task 2
    // Write a Java method that finds the smallest and second smallest elements of a given array and prints them
    // to the console.
    public static int task2(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : array) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Second Smallest: " + secondSmallest);

        return secondSmallest;

    }


//Task 3
    //Write a Java method that calculates the result of the following mathematical expression, where x and y are
    // two variables that have been pre-set in your code:
public static final Integer POW = 2;
    public static Double getSquare(Double number) {
        return Math.pow(number, POW);
    }
    public static double task3(double x, double y) {
        double result =0;

        double n1= 4*y/5;
        double n2= (n1 - x);
        double n3= getSquare(x);
        double n4= getSquare(n2);
        result = n3 + n4;

        System.out.println("Result task 3: " + result);
        return result;

    }
}
