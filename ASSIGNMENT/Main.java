class VisibilityExample{
    public int publicVariable=10;
    private int privateVariable=20;
    
void publicMethod(){
    System.out.println("This is a public method");
   }
void privateMethod(){
    System.out.println("This is a private method");
   }
}
class Main{
    public static void main(String[] args) {
        System.err.println("Pranav,24244,CSE-C");
        VisibilityExample a= new VisibilityExample();
        a.publicMethod();
        a.privateVariable();  
    }
}