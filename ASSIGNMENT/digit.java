import java.util.Scanner;
class digit{
    public static void main(String[] args){
        System.err.println("Pranav,24244,CSE-C");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input number less than ten billion: ");
        long number= scanner.nextLong();
        if (number<0){
            System.err.println("Enter a positive number");
        }
        else if(number>=10_000_000_000L){
            System.err.println("Enter a number less than ten billion!");
        }
        else{
            int digits=0;
            long temp=number;
            if(temp==0){
                digits=1;
            }
            else{
                while(temp>0){
                    temp=temp/10;
                    digits=digits+1;
                }
            }
            System.err.println("Number of digits: "+digits);
        }
    }
}