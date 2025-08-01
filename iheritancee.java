<<<<<<< HEAD
public class iheritancee {
    public static void main(String[] args) {
        Fish tuna=new Fish();
        tuna.eat();
    }
}

class Animal{
    String color;
    void eat()
    {
        System.err.println("eats");
    }
    void breathe()
    {
        System.err.println("breathes");
    }
}
class Fish extends Animal
{
    int fins;
    void swim()
    {
        System.err.println("Swims in whater");
    }
}
=======
public class iheritancee {
    public static void main(String[] args) {
        Fish tuna=new Fish();
        tuna.eat();
    }
}

class Animal{
    String color;
    void eat()
    {
        System.err.println("eats");
    }
    void breathe()
    {
        System.err.println("breathes");
    }
}
class Fish extends Animal
{
    int fins;
    void swim()
    {
        System.err.println("Swims in whater");
    }
}
>>>>>>> 6ba8507bb649986bd7334f28ed51290999ae9040
