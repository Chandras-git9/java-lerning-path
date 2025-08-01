<<<<<<< HEAD
public class linearr
{
    public static void shows(int number[], int target)
    {
        for(int i=0;i<number.length; i++)
        {
            if(number[i]==target)
            {
                System.err.println("found target at index "+i);
            }
            
        }
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        int target=8;
        shows(number, target);
    }
=======
public class linearr
{
    public static void shows(int number[], int target)
    {
        for(int i=0;i<number.length; i++)
        {
            if(number[i]==target)
            {
                System.err.println("found target at index "+i);
            }
            
        }
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        int target=8;
        shows(number, target);
    }
>>>>>>> 6ba8507bb649986bd7334f28ed51290999ae9040
}