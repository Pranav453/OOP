import java.util.Scanner;
class areaOfRectangle{
	public static void main(String[] args){
	Scanner scanner=new Scanner(System.in);
	System.out.print("Enter the length: ");
	double length= scanner.nextDouble();
	System.out.print("Enter the breadth: ");
 	double breadth= scanner.nextDouble();
	double areaOfRectangle=length*breadth;
  	System.out.println("The area of rectangle is: " + areaOfRectangle);
        scanner.close();
    }
}
	
