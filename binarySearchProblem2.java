public class binarySearchProblem2 {
    public static int problem2(int num[], int key)
    {
        int target=14;
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
        int num[]={11,12,13,14,15};
        int target=14;
        System.err.println(problem2(num, target));
    }
}
