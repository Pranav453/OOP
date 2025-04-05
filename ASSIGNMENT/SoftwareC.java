class Employee {
    String name;
    int EmployeeID;
    double salary;
    public Employee(String name, int EmployeeID, double salary) {
        this.name = name;
        this.EmployeeID = EmployeeID;
        this.salary = salary;
    }
     public double getSalary() {
        return salary;
    }
}
class RegularEmployee extends Employee {
    public RegularEmployee(String name, int EmployeeID, double salary) {
         super(name, EmployeeID, salary);
    }
         void details(){
            System.err.println("Name: "+name+", ID: "+EmployeeID+", Salary: "+salary);
         }
}
class Manager extends Employee {
    double bonus;
    public Manager(String name, int EmployeeID, double salary, double bonus) {
         super(name, EmployeeID, salary);
         this.bonus=bonus;
    }
    public double getbonus(){
        return bonus;
    }
         void details(){
            System.err.println("Name: "+name+", ID: "+EmployeeID+", Salary: "+salary+" Bonus: "+bonus);
         }
}
public class SoftwareC{
    public static void main(String[] args) {
        System.err.println("Pranav,24244,CSE-C");
        RegularEmployee emp1 = new RegularEmployee("Tim", 18, 50000);
        Manager manager1 = new Manager("David", 45, 70000,10000);
        emp1.details();
        manager1.details();
    }
}
