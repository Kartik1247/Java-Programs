import java.util.Scanner;
public class Multiplication_Table 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
  System.out.print("Enter number:"); 
   int n=s.nextInt();
   System.out.print("Multiplication Table of "+n+"is\n");
        for(int i=1; i <= 10; i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
    }