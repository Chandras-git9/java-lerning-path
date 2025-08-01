public class constuctorr {
    public static void main(String[] args) {
        Student s1=new Student("chandra");
        System.err.println(s1.name);
    }
}
class Student
{
    String name;
    int roll;

    public Student(String name) {
        this.name=name;
    }
    
}
