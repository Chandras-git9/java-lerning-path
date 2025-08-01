public class binarySearchProblem3 {
    public static int searchh(int num[], int key)
    {
        int target=3;
        int start=0;
        int end=num.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(num[mid]==target)
            {
                return mid;
            }
            else if(num[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8,9};
        int target=3;
        System.err.println("the number is at index" +searchh(num, target));
    }
}
