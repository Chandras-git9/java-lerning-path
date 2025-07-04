import java.util.Scanner;
public class logicalOr {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
                System.out.println("enter the a number: ");
        int a =sc.nextInt();
                System.out.println("enter the b number: ");
        int b=sc.nextInt();
        if(a<=2 || b<=2)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
    
}
