
import java.util.Scanner;

public class LambdaReturn {
    interface Addition {
        int add(int a, int b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        Addition add1 = (a, b) -> { return a + b; };
        Addition add2 = (a, b) -> a + b;

        System.out.println("Using return keyword: " + add1.add(x, y));
        System.out.println("Without return keyword: " + add2.add(x, y));
    }
}
