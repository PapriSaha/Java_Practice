
import java.util.Scanner;

class TemperatureConverter {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter Celsius : ");
            double celsius = scan.nextDouble();

            double fahrenheit = 9 / 5.0 * celsius + 32; // F = 9/5 C + 32
            System.out.println("Fahrenheit: " + fahrenheit);
        }
    }
}