<<<<<<< HEAD
public class multilevelInheritance {
    


    
    public static void main(String[] args) {
        Fish tuna=new Fish();
        Dog d=new Dog();
        d.bark();
        tuna.eat();
    }
}

class Animall{
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
class Fishh extends Animal
{
    int fins;
    void swim()
    {
        System.err.println("Swims in whater");
    }
}
class Dog extends Fish 
{
    void bark()
    {
        System.err.println("barking ");
    }
} 


=======
public class multilevelInheritance {
    


    
    public static void main(String[] args) {
        Fish tuna=new Fish();
        Dog d=new Dog();
        d.bark();
        tuna.eat();
    }
}

class Animall{
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
class Fishh extends Animal
{
    int fins;
    void swim()
    {
        System.err.println("Swims in whater");
    }
}
class Dog extends Fish 
{
    void bark()
    {
        System.err.println("barking ");
    }
} 


>>>>>>> 6ba8507bb649986bd7334f28ed51290999ae9040
