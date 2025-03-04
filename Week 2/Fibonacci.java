import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int n = scanner.nextInt();
        int first = 0, second = 1;
        System.out.print("The first " + n + " terms of Fibonacci series: ");
        for (int i = 1; i <= n; i=i+1) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        scanner.close();
    }
}
