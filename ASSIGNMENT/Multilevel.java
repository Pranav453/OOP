class Calculator{
}
class add  extends Calculator{
    public int addition (int a, int b){
        return a+b;
    }
}
class sub extends add {
    public int subtraction (int a, int b){
        return a-b;
    }
}
class mul extends sub{
    public int multiplication (int a, int b){
        return a*b;
    }
}
class  div extends mul{
    public int division (int a, int b){
        return a/b;
       
    }
}
public class Multilevel{
    public static void main(String[] args) {
        System.err.println("Pranav,24244,CSE-C");
        div obj = new div();
        System.out.println("Addition: "+obj.addition(10, 2));
        System.out.println("Subtraction: "+obj.subtraction(10, 2));
        System.out.println("Multiplication: "+obj.multiplication(10, 2));
        System.out.println("Division: "+obj.division(10, 2));
    }
}