public class paremeterizedConst {
    public static void main(String[] args) {
        Student s1=new Student("CHandra");
        System.out.println(s1.name);
    }
}
class Student
{
    String name;

    public Student(String name) {
        this.name=name;
    }
    
    
}
