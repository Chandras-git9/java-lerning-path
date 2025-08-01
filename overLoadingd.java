public class overLoadingd {
    public static void main(String[] args) {


        //method over loading 
        // Calculator calc=new Calculator();
        // System.out.println(calc.sum(1,2,3));
    


        // method oevrriding
        Deer d=new Deer();
        d.eat();
    }
}

//method overriding
class Animal
{
    void eat()
    {
        System.out.println("eats anything");
    }
}
class Deer extends Animal
{
    void eat()
    {
        System.out.println("eats grass");
    }
}


//method overloading

class Calculator
{
    int sum(int a, int b)
    {
        return a+b;
    }
    float sum(float a, float b )
    {
        return  a+b;
    }
    int sum(int a, int b, int c)
    {
        return a+b+c;
    }
}