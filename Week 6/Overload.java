 class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
}
public class Overload {
    public static void main(String[] args) {
        Calculator a=new Calculator(5,6);
        System.err.println("Sum is "+a.add(5,6));
        System.err.println("Sum is "+a.add(5.6,6));
        System.err.println("Sum is "+a.add(5,6,7));
    }
}
