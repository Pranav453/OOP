abstract class Shape3D{
    public abstract double calculateVolume();
    public abstract double calculateSurfaceArea();
}
class Sphere extends Shape3D{
    private double radius;
    public Sphere(double radius){
        this.radius=radius;
    }
    public double calculateVolume(){
        return (4.0/3.0)*3.14*radius*radius*radius;

    }
    public double calculateSurfaceArea(){
        return 4*3.14*radius*radius;
    }
}
class Cube extends Shape3D{
    private double side;
    public Cube(double side){
        this.side=side;
    }
    public double calculateVolume(){
        return side*side*side;
    }
    public double calculateSurfaceArea(){
        return 6*side*side;
    }
}
class Math{

    static int PI;
    public static void main(String[] args) {
        System.err.println("Pranav,24244,CSE-C");
        Shape3D s=new Sphere(4);
        Shape3D c=new Cube(4);
        System.out.println("Sphere Volume:  "+ s.calculateVolume());
        System.out.println("Sphere Surface Area:  "+ s.calculateSurfaceArea());
        System.out.println("Cube Volume:  "+ c.calculateVolume());
        System.out.println("Cube Surface Area:  "+ c.calculateSurfaceArea());
    }
}