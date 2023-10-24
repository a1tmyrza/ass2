import java.util.Scanner;

// Target interface that the client code expects

// Adaptee: FahrenheitTemperature class


// Adapter class that adapts FahrenheitTemperature to CelsiusTemperature

public class TemperatureConverterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheitInput = scanner.nextDouble();

        // Create a FahrenheitTemperature object with user input
        FahrenheitTemperature fahrenheitTemperature = new FahrenheitTemperature(fahrenheitInput);

        // Create an adapter to convert Fahrenheit to Celsius
        FahrenheitToCelsiusAdapter adapter = new FahrenheitToCelsiusAdapter(fahrenheitTemperature);

        // Display the temperature in Celsius
        System.out.println("Temperature in Celsius: " + adapter.getCelsius());

        scanner.close();
    }
}
