public class largestArray {
    public static void arrays(int num[])
    {
        int max=num[0];
        for(int i=1; i<num.length;i++)
        {
            if(num[i]>max)
            {
                max=num[i];
            }
        }
        System.err.println(max);
    }
    public static void main(String[] args) {
        int num[]={2,4,6,7};
        arrays(num);
    }
    
}
