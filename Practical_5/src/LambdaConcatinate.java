
import java.util.Scanner;

public class LambdaConcatinate {

    interface Concat {
        String join(String a, String b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        Concat c = (a, b) -> a + b;
        System.out.println("Concatenated String: " + c.join(str1, str2));
    }
}
