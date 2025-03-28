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
        shape c=new circle();
        System.out.println("Area= "+c.calculatearea(5));
    }
}
