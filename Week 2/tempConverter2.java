import java.util.Scanner;
public class tempConverter2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double Fahrenheit = scanner.nextDouble();
        double Celsius = (Fahrenheit -32)*5/9;
        System.out.println(Fahrenheit + "°F is equal to " + Celsius + "°C");
        scanner.close();
    }
}
