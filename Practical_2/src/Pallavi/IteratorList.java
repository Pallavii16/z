package Pallavi;

import java.util.*;

public class IteratorList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.println("Enter names:");
        for (int i = 0; i < n; i++) {
            names.add(sc.nextLine());
        }

        ListIterator<String> iterator = names.listIterator();

        System.out.println("\nList in Forward Direction:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nList in Backward Direction:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
