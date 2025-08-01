public class largestArrays {
    public static void largestNum()
    {
        int arr[]={1,2,6,3,5};
        int largest=arr[0]; //assuming 
        for(int i=1; i<arr.length; i++)
        {
            
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        System.out.println("largest is" +largest);
    }
    public static void main(String args[])
    {
        largestNum();
    }
}
