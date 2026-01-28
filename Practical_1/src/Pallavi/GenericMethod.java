package Pallavi;

import java.util.Scanner;

class GenericMethod {

    // Generic Method
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Integer array input
        System.out.print("Enter size of Integer array: ");
        int n1 = sc.nextInt();
        Integer[] intArray = new Integer[n1];

        System.out.println("Enter Integer elements:");
        for (int i = 0; i < n1; i++) {
            intArray[i] = sc.nextInt();
        }

        // String array input
        System.out.print("Enter size of String array: ");
        int n2 = sc.nextInt();
        sc.nextLine(); // clear buffer
        String[] strArray = new String[n2];

        System.out.println("Enter String elements:");
        for (int i = 0; i < n2; i++) {
            strArray[i] = sc.nextLine();
        }

        // Double array input
        System.out.print("Enter size of Double array: ");
        int n3 = sc.nextInt();
        Double[] dblArray = new Double[n3];

        System.out.println("Enter Double elements:");
        for (int i = 0; i < n3; i++) {
            dblArray[i] = sc.nextDouble();
        }

        // Call generic method
        System.out.println("Integer Array:");
        printArray(intArray);

        System.out.println("String Array:");
        printArray(strArray);

        System.out.println("Double Array:");
        printArray(dblArray);
    }
}
