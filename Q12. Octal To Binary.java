import java.util.Scanner;

public class OctToBin
{
   public static void main(String[] args)
   {
      int i;
      String binary="";
      
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter the Octal Number: ");
      String octal = s.nextLine();
      
      for(i=0; i<octal.length(); i++)
      {
         char ch = octal.charAt(i);
         switch(ch)
         {
            case '0': binary = binary + "000";
               break;
            case '1': binary = binary + "001";
               break;
            case '2': binary = binary + "010";
               break;
            case '3': binary = binary + "011";
               break;
            case '4': binary = binary + "100";
               break;
            case '5': binary = binary + "101";
               break;
            case '6': binary = binary + "110";
               break;
            case '7': binary = binary + "111";
               break;
            default: System.out.println("\nInvalid Octal Digit!");
               return;
         }
      }
      
      System.out.println("\nEquivalent Binary Value = " +binary);
   }
}