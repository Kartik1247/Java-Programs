import java.util.Scanner;
public class Smallest_Number 
{
 public static void main(String[] args) 
{
 int a=47, b=54, c=24, sm;
 Scanner s = new Scanner(System.in);
 System.out.println("In the numbers 47,54 and 24");
 sm = c < (a < b ? a : b) ? c : ((a < b) ? a : b); 
 System.out.println("The smallest number is: "+sm);
 }
 }