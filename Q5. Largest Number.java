import java.util.*;
public class Biggest_Number 
{
    public static void main(String args[])
    {
        int x=47, y=54, z=24;
        Scanner s = new Scanner(System.in);
        System.out.println("For the numbers 47,54 and 24");
        if(x > y && x > z)
        {
            System.out.println("Largest number is:"+x);
        }
        else if(y > z)
        {
            System.out.println("Largest number is:"+y);
        }
        else
        {
            System.out.println("Largest number is:"+z);
        }
 
    
 
    }
}