
import java.util.Scanner;

public class LambdaSingleParam {
    interface Square {
        int calculate(int x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Square square = (x) -> x * x;
        int result = square.calculate(num);

        System.out.println("Square of " + num + " is: " + result);
    }
}
