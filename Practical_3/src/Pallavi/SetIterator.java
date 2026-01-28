package Pallavi;

import java.util.*;

public class SetIterator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<String> cities = new LinkedHashSet<>();

        System.out.print("Enter number of cities: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.println("Enter city names:");
        for (int i = 0; i < n; i++) {
            cities.add(sc.nextLine());
        }

        System.out.println("\nCities (Forward Direction):");
        Iterator<String> itr = cities.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("\nCities (Reverse Direction):");
        List<String> cityList = new ArrayList<>(cities);
        ListIterator<String> listItr = cityList.listIterator(cityList.size());
        while (listItr.hasPrevious()) {
            System.out.println(listItr.previous());
        }
    }
}
