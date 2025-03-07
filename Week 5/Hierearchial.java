class Vehicle{
    void company(){
        System.err.println("Vehicle Company");
    }
    void start(){
    System.out.println("Vehicle is starting");
    }
}
class cars extends Vehicle{
    void car(){
        System.out.println("It has 4 doors");
    }
}
class bikes extends Vehicle{
    void bike(){
        System.out.println("It has gears");
    }
}
class trucks extends Vehicle{
    void truck(){
        System.out.println("It has gears");
    }
}
public class Hierearchial{
    public static void main(String[] args) {
        cars c = new cars();
        c.car();
        c.start();
        c.company();
        bikes b = new bikes();
        b.bike();
        b.start();
        b.company();
        trucks t = new trucks();
        t.truck();
        t.start();
        t.company();
    }
}