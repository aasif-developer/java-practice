import java.util.*;
public class Recall_Input
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER YOUR ROLL NUMBER :");
        int roll =obj.nextInt();
        System.out.println("ENTER YOUR FULL NAME :");
        String name = obj.nextLine();
        obj.next();
        
        System.out.println("ROLL NO : " + roll);
        System.out.println("NAME :" + name);
        
    }
}