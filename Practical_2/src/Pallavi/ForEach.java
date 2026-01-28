package Pallavi;

import java.util.*;

public class ForEach {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> fruits = new ArrayList<>();

        System.out.print("Enter number of fruits: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.println("Enter fruit names:");
        for (int i = 0; i < n; i++) {
            fruits.add(sc.nextLine());
        }

        System.out.println("List of Fruits:");
        for (String fruit : fruits) {   // for-each loop
            System.out.println(fruit);
        }
    }
}
