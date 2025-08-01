public class subArray {
    public static void subArrays(int num[])
    {
        for(int i=0; i<num.length; i++)
        {
            int start=0;
            for(int j=i; j<num.length; j++)
            {
                int end=j;
                for(int k=i; k<=j; k++)
                {
                    System.out.print(num[k] + " ");
                }
                                    System.out.println();
            }
        }
}
public static void main(String args[])
        {
            int num[]={2,4,6,8,10};
            subArrays(num);
        }
}
