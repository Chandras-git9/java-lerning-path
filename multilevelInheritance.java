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


