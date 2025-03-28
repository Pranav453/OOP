class student{
    String name;
    double percentage;
public student(String name,double percentage){
    this.name=name;
    this.percentage=percentage;
    }
}
class UG extends student{
    public UG(String name,double percentage){
        super(name,percentage);
    }
    void eligibility(){
        if(percentage>=60){
            System.out.println(name+" is eligible for UG addmission");
        }
        else{
            System.err.println(name+" is not eligible for UG addmission.");
        }
    }
}
class PG extends student{
    public PG(String name,double percentage){
        super(name,percentage);
    }
    void eligibility(){
        if(percentage>=70){
            System.out.println(name+" is eligible for PG addmission");
        }
        else{
            System.err.println(name+" is not eligible for PG addmission.");
        }
    }
}
public class Admission{
    public static void main(String[] args) {
        UG s1=new UG("Dhanush",90);
        PG s2=new PG("Karthik",90);
        s1.eligibility();
        s2.eligibility();
    }
}