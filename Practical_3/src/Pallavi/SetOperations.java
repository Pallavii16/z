package Pallavi;

import java.util.*;

public class SetOperations {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        Set<String> set1 = new HashSet<>();

	        System.out.print("Enter number of items for Set 1: ");
	        int n1 = sc.nextInt();
	        sc.nextLine(); // clear buffer

	        System.out.println("Enter items for Set 1:");
	        for (int i = 0; i < n1; i++) {
	            set1.add(sc.nextLine());
	        }

	        Set<String> set2 = new HashSet<>();
	        System.out.print("Enter number of items for Set 2: ");
	        int n2 = sc.nextInt();
	        sc.nextLine(); // clear buffer

	        System.out.println("Enter items for Set 2:");
	        for (int i = 0; i < n2; i++) {
	            set2.add(sc.nextLine());
	        }

	        set1.addAll(set2);
	        System.out.println("After adding Set 2 into Set 1: " + set1);

	        System.out.print("Enter item to remove: ");
	        String removeItem = sc.nextLine();
	        set1.remove(removeItem);
	        System.out.println("After removal: " + set1);

	        System.out.print("Enter item to search: ");
	        String searchItem = sc.nextLine();
	        if (set1.contains(searchItem))
	            System.out.println(searchItem + " is present in the set.");
	        else
	            System.out.println(searchItem + " is not present in the set.");
	    }
	}
