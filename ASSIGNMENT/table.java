import java.util.Scanner;
class table{
    public static void main(String[] args){
        System.err.println("Pranav,24244,CSE-C");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input number(Table to be calculated): ");
        int integer= scanner.nextInt();
        System.out.print("Input number of terms: ");
        int terms= scanner.nextInt();
        for (int i=0;i<=terms;i++){
            System.err.println(integer+"x"+i+"="+i*integer);
        }
    }
}