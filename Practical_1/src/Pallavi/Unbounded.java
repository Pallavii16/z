package Pallavi;

import java.util.*;

public class Unbounded {

    // Unbounded wildcard method
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.print(item + " ");
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

        // String list input
        System.out.print("Enter number of strings: ");
        int n2 = sc.nextInt();
        sc.nextLine(); // clear buffer
        List<String> strList = new ArrayList<>();

        System.out.println("Enter strings:");
        for (int i = 0; i < n2; i++) {
            strList.add(sc.nextLine());
        }

        // Double list input
        System.out.print("Enter number of doubles: ");
        int n3 = sc.nextInt();
        List<Double> doubleList = new ArrayList<>();

        System.out.println("Enter doubles:");
        for (int i = 0; i < n3; i++) {
            doubleList.add(sc.nextDouble());
        }

        // Print lists
        System.out.print("Integer List: ");
        printList(intList);

        System.out.print("String List: ");
        printList(strList);

        System.out.print("Double List: ");
        printList(doubleList);
    }
}
