import java.util.Scanner;
public class airthmetic{
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        try {
            System.err.print("Enter first (numerator): ");
            int a=Scanner.nextInt();
            System.err.println("Enter first (denominator): ");
            int b=Scanner.nextInt();
            int result=a/b;
            System.err.print("Result: "+result);
        } 
        catch (Exception e) {
            System.err.println("An error occured");
        }
        finally{
            System.err.println("finally");
        }
        Scanner.close();
    }
}