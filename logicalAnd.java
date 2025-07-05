import java.util.Scanner;
public class logicalAnd {
    public static void main(String args[])
    {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number: ");
            int a=sc.nextInt();
            int b =sc.nextInt();
            System.out.println("enter the number of b : ");
            if(a>=5 && b>=6)
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("ignore");
            }
    }
}
