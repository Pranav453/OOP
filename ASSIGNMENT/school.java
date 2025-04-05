class Student{
    private int student_id;
    private String student_name;

    public Student(int student_id,String student_name){
        this.student_id=student_id;
        this.student_name=student_name;
    }
int getstudent_id(){
    return student_id;
    }
void setstudent_id(int student_id){
    this.student_id=student_id;
    }
String getstudent_name(){
    return student_name;
    }
void setstudent_name(String student_name){
    this.student_name=student_name;
    }
void addGrade(String grade){
    System.err.println("Grade "+grade+" added.");
    }
void info(){
    System.out.println("Name: "+student_name+" ID: "+student_id);
    }
}
class school{
    public static void main(String[] args){
        System.err.println("Pranav,24244,CSE-C");
        Student s1=new Student(24244,"Madhu");
        s1.addGrade("O");
        s1.info();
    }
}