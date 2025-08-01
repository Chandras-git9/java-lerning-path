// package java-lerning-path;

public class swapInFunction {
    public static void swap(int a, int b)
    {
        
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        int a=30;
        int b=20;
        swap(a,b);
    }
    
}
