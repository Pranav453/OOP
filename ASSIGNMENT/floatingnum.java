import java.util.Scanner;
class floatingnum{
    public static void main(String[] args){
        System.err.println("Pranav,24244,CSE-C");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input number: ");
        float number1= scanner.nextFloat();
        System.out.print("Input number: ");
        float number2= scanner.nextFloat();
        if (number1==number2){
            System.err.println("They are same.");
        }
        else{
            System.out.println("They are different.");
        }
        scanner.close();
    }
}