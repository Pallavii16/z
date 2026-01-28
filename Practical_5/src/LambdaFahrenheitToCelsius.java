
import java.util.Scanner;

public class LambdaFahrenheitToCelsius {
    interface TemperatureConverter {
        double convert(double fahrenheit);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();

        TemperatureConverter fahrenheitToCelsius = (temp) -> (temp - 32) * 5 / 9;
        double c = fahrenheitToCelsius.convert(f);

        System.out.println(f + " Fahrenheit = " + c + " Celsius");
    }
}
