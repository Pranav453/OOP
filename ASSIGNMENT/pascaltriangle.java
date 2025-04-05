import java.util.Scanner;
class pascaltriangle{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.err.println("Pranav,24244,CSE-C");
        System.out.print("Input number of rows:");
        int n = scanner.nextInt();
        int i;int j;

         for (i = 0; i < n; i++) {
            for (j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }
            for (char ch = (char) ('A' + i - 1); ch >= 'A'; ch--) {
                System.out.print(ch);
            }
            System.out.println();
        }
        for (i = n - 2; i >= 0; i--) {
            for (j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }
            for (char ch = (char) ('A' + i - 1); ch >= 'A'; ch--) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

    