import java.util.Scanner;
class Student
{
    int roll;
    String name;
    void display()
    {
        System.out.println("Roll number: "+roll);
        System.out.println("Name: "+name);
    }
}
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
        Student s1 = new Student();
        s1.roll = 101;
        s1.name="AASIF";
        s1.display();
    }
}