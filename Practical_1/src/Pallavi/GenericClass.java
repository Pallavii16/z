package Pallavi;

import java.util.Scanner;

class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class GenericClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Box<String> strBox = new Box<>();
        System.out.print("Enter Name: ");
        strBox.set(sc.nextLine());

        Box<Integer> intBox = new Box<>();
        System.out.print("Enter Roll No: ");
        intBox.set(sc.nextInt());

        System.out.println("Name: " + strBox.get());
        System.out.println("Roll No.: " + intBox.get());
    }
}
