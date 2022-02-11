import java.util.Scanner;
public class Largest_Number 
{
    public static void main(String[] args) 
    {
        double n,a;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        n = s.nextDouble();
        a = Math.sqrt(n); 
        System.out.println("Square Root of"+n+"is "+a);
         }
}