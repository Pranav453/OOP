import java.util.Scanner;
class Weekday{
    public static void main(String[] args){
        System.err.println("Pranav,24244,CSE-C");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input number: ");
        int integer= scanner.nextInt();
        if (integer<1 || integer>7){
            System.out.print("Enter a integer between 1 and 7.");
        }
        else{
           if (integer==1){
            System.err.print("Monday");
           }
           if (integer==2){
            System.err.print("Tueday");
           }
           if (integer==3){
            System.err.print("Wednesday");
           }
           if (integer==4){
            System.err.print("Thursday");
           }
           if (integer==5){
            System.err.print("Friday");
           }
           if (integer==6){
            System.err.print("Saturday");
           }
           if (integer==7){
            System.err.print("Sunday");
           }
        }
    }
}