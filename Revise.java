import java.util.Scanner;
public class Revise
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = obj.nextInt();
        if(num%2==0)
        {
            System.out.println("Even number");

        }
        else
        {
            System.out.println("Odd number");
        }   
    }
}