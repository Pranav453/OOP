class vehicle{
    
}
class car extends vehicle{
    void displayinfo(){
    System.out.println("This is a Ferrari.");
    }
}
public class ovveride{
    public static void main(String[] args) {
        car c1=new car();
        c1.displayinfo();
    }
}

