public class pattern12 {
    public static void main(String args[])
    {
        int rows = 4;
        for(int i=1; i<=rows; i++)
        {
            int start;
            if(i%2==0)
                start=1;
            else
                start=0;
            
            for(int j=1; j<=i; j++)
            {
                System.out.print(start);
                start=1 - start; // flip between 0 and 1
            }
            System.out.println();
        }
    }
}
