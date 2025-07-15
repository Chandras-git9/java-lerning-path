public class pairsArray 
{
    public static void pairsArrays(int num[])
    {
        int start=0;
        int end=num.length;
        // while(start<end)
        
            for(int i=0; i<end; i++)
            {
                int curr=num[i];
                for(int j=i+1; j<end; j++)
                {
                    System.out.print(" ("+curr+ "," +num[j]+ ")");
                }
                    System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        int num[]={2,4,6,8,10};
        pairsArrays(num);
    }
}