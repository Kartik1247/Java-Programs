import java.util.Scanner;  
public class QuadEq 
{  
public static void main(String args[])   
{  
Scanner input = new Scanner(System.in);
System.out.println("For the standard quadratic equation ax^2 + bx + c");
System.out.print("Enter the value of a: ");
double a = input.nextDouble();  
System.out.print("Enter the value of b: ");  
double b = input.nextDouble();  
System.out.print("Enter the value of c: ");  
double c = input.nextDouble(); 
double d= b * b - 4.0 * a * c;  
if (d> 0.0)   
{  
double r1 = (-b + Math.sqrt(d)) / (2.0 * a);  
double r2 = (-b - Math.sqrt(d)) / (2.0 * a);  
System.out.println("The roots are " + r1 + " and " + r2);  
}   
else if (d == 0.0)   
{  
double r1 = -b / (2.0 * a);  
System.out.println("The root is " + r1);  
}   
else   
{  
System.out.println("Roots are not real.");  
}  
}  
}  