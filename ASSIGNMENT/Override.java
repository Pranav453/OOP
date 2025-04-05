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
public class Override {
    public static void main(String[] args) {
        System.err.println("Pranav,24244,CSE-C");
        shape c=new circle();
        System.out.println("Area of circle = "+c.calculatearea(5));
        shape s=new shape();
        System.out.println("Area of square = "+s.calculatearea(5));
        shape r=new shape();
        System.out.println("Area of rectangle = "+r.calculatearea(5,6));
    }
}