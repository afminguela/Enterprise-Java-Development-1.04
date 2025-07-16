package org.example;

public class Math1 {


    public static void findMinmax(int[] array) {
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
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }


    public static void findSmallest(int[] array) {
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


    }


public static final Integer POW = 2;
    public static Double getSquare(Double number) {
        return Math.pow(number, POW);
    }
    public static void calculateParty(double x, double y) {

        double result = 0.0;

        double n1= (4 * y) / 5;
        double n2= (n1 - x);
        double n3= getSquare(x);
        double n4= getSquare(n2);
        result = n3 + n4;

        System.out.println("Result task 3: " + result);

    }
}
