interface Shape{
    double getPerimeter();
}
class Rectangle implements Shape{
    private double length,breadth;
    public Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public double getPerimeter(){
        return 2*(length+breadth);
    }
}
class Circle implements Shape{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double getPerimeter(){
        return 2*3.14*radius;
    }
}
class Triangle implements Shape{
    private double side1,side2,side3;
    public Triangle(double side1,double side2,double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public double getPerimeter(){
        return side1+side2+side3;
    }
}
class Mains{
    public static void main(String[] args) {
        System.err.println("Pranav,24244,CSE-C");
        Shape r=new Rectangle(5,6);
        System.err.println("Perimeter of rectangle: "+r.getPerimeter());
        Shape c=new Circle(5);
        System.err.println("Perimeter of circle: "+c.getPerimeter());
        Shape t=new Triangle(7,8,9);
        System.err.println("Perimeter of Triangle: "+t.getPerimeter());
    }
}
