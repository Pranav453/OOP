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
        div obj = new div();
        System.out.println("Addition: "+obj.addition(10, 2));
        System.out.println("Addition: "+obj.subtraction(10, 2));
        System.out.println("Addition: "+obj.multiplication(10, 2));
        System.out.println("Addition: "+obj.division(10, 2));
    }
}
