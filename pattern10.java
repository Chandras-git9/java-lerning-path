public class pattern10
{
    public static void main(String[] args) {
        
    
     int rows = 5;
        for (int i = 1; i <= rows; i++) 
        {
            // print spaces
            for (int j = i; j < rows; j++) 
            {
                System.out.print(" ");
            }
            // print stars
            for (int k = 1; k <= (2 * i - 1); k++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
         
        for (int i = rows; i >= 1; i--) 
        {
            // print spaces
            for (int j = rows; j > i; j--) 
            {
                System.out.print(" ");
            }
            // print stars
            for (int k = 1; k <= (2 * i - 1); k++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
    
}
}
