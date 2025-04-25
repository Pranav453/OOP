public class university{
    String UniversityName="Amrita Vishwa Vidyaapetham";
    void name(){
    System.out.println("University Name: "+UniversityName);
    }
    class Department{
        String DeptName="Computer Science";
        int Deptcode=101;

        void Departmentinfo(){
            System.err.println("Department Name: "+DeptName);
            System.err.println("Department Code: "+Deptcode);
        }
    }
    class Student{
        String Studentname="Yuvraj";
        int RollNumber=12;
        
        void Studentinfo(){
            System.err.println("Student Name: "+Studentname);
            System.err.println("Student Code: "+RollNumber);
        }
    }
    public static void main(String[] args) {
        university u=new university();
        u.name();
        university.Department Dept=uni.new Department();
    }
}