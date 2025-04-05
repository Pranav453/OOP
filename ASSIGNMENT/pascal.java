import java.util.Scanner;
public class pascal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Pranav,24244,CSE-C");
        System.out.print("Input number of rows: ");
        int n = scanner.nextInt();
        scanner.close();
        int i;int j;
        
        for (i = 0; i < n; i++) {
            for (j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            int number = 1;
            for (j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
