class shape{
    public double calculatearea(double side){
        return side*side;
    }
    
    public double calculatearea(double length,double breadth){
        return length*breadth;
    }
    
}
class circle extends shape{
    public double calculatearea(double radius){
        return 3.14*radius*radius;
    }
}
public class overrides {
    public static void main(String[] args) {
        circle c=new circle();
        shape s=new shape();
        shape r=new shape();
        ystem.out.println("Area of circle = "+c.calculatearea(5));
        System.out.println("Area of square = "+c.calculatearea(5));
        System.out.println("Area of rectangle = "+c.calculatearea(5,6));
    }
}
