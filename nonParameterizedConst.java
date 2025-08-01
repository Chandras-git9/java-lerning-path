public class nonParameterizedConst {
    public static void main(String[] args) {
        Student s1=new Student();
    }
}
class Student
{
    String name;
    int roll;
    public Student()
    {
        System.err.println("constructor called");
    }
}
    
