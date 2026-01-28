
import java.util.Scanner;

public class LambdaMultiParam {
    interface Add {
        int sum(int a, int b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        Add addition = (a, b) -> a + b;
        int result = addition.sum(num1, num2);

        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + result);
    }
}
