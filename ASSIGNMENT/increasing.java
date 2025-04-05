import java.util.Scanner;
class increasing{
    public static void main(String[] args){
        System.err.println("Pranav,24244,CSE-C");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input number: ");
        float number1= scanner.nextFloat();
        System.out.print("Input number: ");
        float number2= scanner.nextFloat();
        System.out.print("Input number: ");
        float number3= scanner.nextFloat();
        if(number1>number2 && number2>number3 && number1>number3){
            System.err.println("Decreasing order");
        }
        if(number1<number3 && number2<number3 && number1<number2){
            System.err.println("Increasing order");
        }
        else{
            System.out.println("Neither increasing nor decreasing");
        }
    }
}