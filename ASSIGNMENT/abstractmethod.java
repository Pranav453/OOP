abstract class Animal{
    abstract void sound();     
}
class Lion extends Animal{
    void sound(){
        System.err.println("Lion Roaring");
    }
}
class Tiger extends Animal{
    void sound(){
        System.out.println("Tiger Roaring");
    }
}
class abstractmethod{
    public static void main(String[] args){
        System.err.println("Pranav,24244,CSE-C");
        Animal l=new Lion();
        Animal T=new Tiger();
        l.sound();
        T.sound();
    }
}