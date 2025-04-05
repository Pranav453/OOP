class Employee{
    String name;
    String address;
    String jobtitle;
    double salary;

    public Employee(String name,String address, double salary,String jobtitle){
        this.name=name;
        this.address=address;
        this.jobtitle=jobtitle;
        this.salary=salary;
    }
}
class Manager extends Employee{    
        public Manager(String name,String address, double salary,String jobtitle){
            super(name,address,salary,jobtitle);
        }
        void detail(){
            System.out.println("Name: "+name+", Address: "+address+", Job Title: "+jobtitle+", Salary: "+salary);
        }
}
 
class company{
    public static void main(String[] args){
        Manager m=new Manager("Akash","Bank Colony",100000,"Manager");
        m.detail();
         
    }
}