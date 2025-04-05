class Employee{
    void work(){
        System.err.println("Works 8 hrs a day");
    }
    void getSalary(){
        System.err.println("1,00,000");
    }
}
class HRManager extends Employee{
        void work(){
            System.out.println("Supervises the employees");
        }
        void addEmployee(){
            System.err.println("HR is recruiting new employees");
        }
}
public class Office{
    public static void main(String[] args) {
        System.err.println("Pranav,24244,CSE-C");
        HRManager h=new HRManager();
        h.addEmployee();
        h.work();
    }
}
