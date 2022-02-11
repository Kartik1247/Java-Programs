import java.util.Scanner;
public class Largest_Number 
{
    public static void main(String[] args) 
    {
        int x, y, z, a;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        x = s.nextInt();
        System.out.print("Enter the second number:");
        y = s.nextInt();
        System.out.print("Enter the third number:");
        z = s.nextInt();
        a = Math.max(x,y); 
        System.out.print("Largest Number is "+ Math.max(a,z));
         }
}