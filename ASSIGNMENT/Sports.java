interface Playable{
    void play();
}
class Football implements Playable{
    public void play(){
        System.out.println("Ronaldo is one of the greatest football players");
    }
}
class Volleyball implements Playable{
    public void play(){
    System.out.println("Gilberto Amauri de Godoy Filho is one of the greatest volleyball players");
    }
}
class Basketball implements Playable{
    public void play(){
        System.out.println("Micheal Jordan is one of the greatest Basketball players");
    }
}
class Sports{
    public static void main(String[] args){
        System.err.println("Pranav,24244,CSE-C");
        Playable f=new Football();
        Playable v=new Volleyball();
        Playable b=new Basketball();
        f.play();
        v.play();
        b.play();
    }
}