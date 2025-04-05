class Animal{
    void eat(){
        System.out.println("Animals eat food.");
    }
}
class Herbivores extends Animal{
    void eat(){
        System.err.println("Herbivores eat grass and leaves.");
    }
}
class Carnivores extends Animal{
    void eat(){
        System.err.println("Carnivores eat mostly meat.");
    }
}
class Omnivores extends Animal{
    void eat(){
        System.err.println("Omnivores eat both.");
    }
}
class Heirarchy{
    public static void main(String[] args) {
        System.err.println("Pranav,24244,CSE-C");
        Herbivores h=new Herbivores();
        Carnivores c=new Carnivores();
        Omnivores o=new Omnivores();
        h.eat();
        c.eat();
        o.eat();
    }
}