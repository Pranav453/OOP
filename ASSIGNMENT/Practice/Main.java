abstract class Animal{
    abstract void makeSound();
    void eat(){
        System.err.println("Eat");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.err.println("Bark");
    }
}
class Main{
    public static void main(String[] args) {
        Animal d1=new Dog();
        //Dog d1=new Dog();
        d1.makeSound();
        d1.eat();
    }
}