package Pallavi;

import java.util.*;

public class UpperBound {

    // Upper-bounded wildcard method
    public static void printNumbers(List<? extends Number> list) {
        for (Number n : list) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Integer list input
        System.out.print("Enter number of integers: ");
        int n1 = sc.nextInt();
        List<Integer> intList = new ArrayList<>();

        System.out.println("Enter integers:");
        for (int i = 0; i < n1; i++) {
            intList.add(sc.nextInt());
        }

        // Double list input
        System.out.print("Enter number of doubles: ");
        int n2 = sc.nextInt();
        List<Double> doubleList = new ArrayList<>();

        System.out.println("Enter doubles:");
        for (int i = 0; i < n2; i++) {
            doubleList.add(sc.nextDouble());
        }

        System.out.println("Integer List:");
        printNumbers(intList);

        System.out.println("Double List:");
        printNumbers(doubleList);
    }
}
