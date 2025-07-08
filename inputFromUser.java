import java.util.Scanner;
public class inputFromUser {
    public static void main(String args[])
    {
        int a;
        int b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number a: ");
        a=sc.nextInt();
        System.out.println("enter b number : ");
        b=sc.nextInt();
        if(a%b==0)
        {
            System.out.println("even number ");
        }
        else{
            System.out.println("odd");
        }
    }
    
}
