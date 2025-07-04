import java.util.Scanner;
public class sum {
    public static void main(String args[])
    {
        int sum=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number: ");
        int num=sc.nextInt();
        while(num<=10)
        {
            System.out.println(num);
            sum=sum+num;
            num++;
        }
        System.out.println(sum);
    }
    
}
