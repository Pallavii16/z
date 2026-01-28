package Pallavi;

import java.util.*;

public class LowerBound {

    // Lower-bounded wildcard method
    public static void addNumbers(List<? super Integer> list, int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Number> numList = new ArrayList<>();

        System.out.print("How many numbers do you want to add? ");
        int n = sc.nextInt();

        addNumbers(numList, n);

        System.out.println("List after adding elements:");
        for (Object obj : numList) {
            System.out.print(obj + " ");
        }
    }
}

