import java.util.Scanner;
class areaOfTriangle{
	public static void main(String[] args){
	Scanner scanner=new Scanner(System.in);
	System.out.print("a: ");
	double a= scanner.nextDouble();
	System.out.print("b: ");
 	double b = scanner.nextDouble();
	System.out.print("c: ");
	double c= scanner.nextDouble();
	double s=(a+b+c)/2;
	double areaOfTriangle=Math.sqrt(s*(s-a)*(s-b)*(s-c));
  	System.out.println("The area of triangle is: " + areaOfTriangle);
        scanner.close();
    }
}
	
