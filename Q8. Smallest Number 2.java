import java.util.Scanner;
public class Smallest_Number 
{
 public static void main(String[] args) 
{
 int x, y, z, sm;
 Scanner s = new Scanner(System.in);
 System.out.print("Enter the first number:");
 x = s.nextInt();
 System.out.print("Enter the second number:");
 y = s.nextInt();
 System.out.print("Enter the third number:");
 z = s.nextInt();
 sm = Math.min(x,y); 
 System.out.print("Smallest Number is "+ Math.min(sm,z));
}
}
