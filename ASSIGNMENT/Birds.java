abstract class Bird{
    abstract void fly();
    abstract void makeSound();
}
class Eagle extends Bird{A
    void fly(){
        System.out.println("Eagle flies");
    }
    void makeSound(){
        System.err.println("Eagle screeches");
    }
}
class Hawk extends Bird{
    void fly(){
        System.out.println("Hawk glides");
    }
    void makeSound(){
        System.out.println("Hawk makes a a sharp, piercing cry");
    }
}
class Birds{
    public static void main(String[] args){
        System.err.println("Pranav,24244,CSE-C");
        Eagle e=new Eagle();
        Hawk h=new Hawk();
        e.fly();
        h.fly();
        e.makeSound();
        h.makeSound();
    }
}