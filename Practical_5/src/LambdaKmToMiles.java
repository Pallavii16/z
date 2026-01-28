
import java.util.Scanner;

public class LambdaKmToMiles {
    interface DistanceConverter {
        double convert(double kilometers);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();

        DistanceConverter kmToMiles = (k) -> k * 0.621371;
        double miles = kmToMiles.convert(km);

        System.out.println(km + " Kilometers = " + miles + " Miles");
    }
}
