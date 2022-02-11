import java.util.Scanner;
public class Character
{
public static void main(String[] args) {
Scanner cs=new Scanner(System.in);
char ch;
System.out.println("Enter a character:");
ch=cs.next().charAt(0);
if(ch>='a' && ch<='z')
System.out.println("Entered character is lower case.");
else if(ch>='A' && ch<='Z')
System.out.println("Entered character is upper case.");
else if(ch>='0' && ch<='9')
System.out.println("Entered character is number.");
else
System.out.println("Entered character is a special character.");
cs.close();
}
}