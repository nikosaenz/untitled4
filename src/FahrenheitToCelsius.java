//demo
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        double temperatureFahrenheit = 100.0;
        double temperatureCelsius = (temperatureFahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Fahrenheit: " + temperatureFahrenheit);
        System.out.println("Temperature in Celsius: " + temperatureCelsius);
    }
}