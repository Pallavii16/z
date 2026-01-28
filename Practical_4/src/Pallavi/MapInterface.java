package Pallavi;

import java.util.*;

public class MapInterface {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<Integer, String> map1 = new HashMap<>();

        System.out.print("Enter number of entries for Map 1: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.println("Enter key and value pairs:");
        for (int i = 0; i < n; i++) {
            System.out.print("Key: ");
            int key = sc.nextInt();
            sc.nextLine(); // clear buffer
            System.out.print("Value: ");
            String value = sc.nextLine();
            map1.put(key, value);
        }

        System.out.println("Map 1: " + map1);

        System.out.print("Enter key to remove: ");
        int removeKey = sc.nextInt();
        map1.remove(removeKey);
        System.out.println("After removing key " + removeKey + ": " + map1);

        System.out.print("Enter key to search: ");
        int searchKey = sc.nextInt();
        if (map1.containsKey(searchKey))
            System.out.println("Key " + searchKey + " is present in the map.");
        else
            System.out.println("Key " + searchKey + " is not present in the map.");

        System.out.print("Enter key to get value: ");
        int getKey = sc.nextInt();
        System.out.println("Value for key " + getKey + ": " + map1.get(getKey));

        System.out.print("Enter number of entries for Map 2: ");
        int m = sc.nextInt();
        sc.nextLine();
        Map<Integer, String> map2 = new HashMap<>();
        System.out.println("Enter key and value pairs for Map 2:");
        for (int i = 0; i < m; i++) {
            System.out.print("Key: ");
            int key = sc.nextInt();
            sc.nextLine();
            System.out.print("Value: ");
            String value = sc.nextLine();
            map2.put(key, value);
        }

        map1.putAll(map2);
        System.out.println("After adding Map 2 into Map 1: " + map1);

        System.out.println("All keys and values in Map 1:");
        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
