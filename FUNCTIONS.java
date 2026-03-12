import java.util.Scanner;
public class FUNCTIONS
{
    void Add(int a , int b , int c)
    {
        System.out.print("ADDITION OF A + B + C IS : " +(a+b+c));
    }
    void avg(int a1 , int a2)
    {
        return a1+a2;
    }
public static void main(String[] args)
{
        try (Scanner obj = new Scanner(System.in))
         {
            FUNCTIONS sc=new FUNCTIONS();
            System.out.println("ADDITION");
            System.out.print("ENTER A VALUE : ");
            int a=obj.nextInt();
            System.out.print("ENTER B VALUE : ");
            int b=obj.nextInt();
            System.out.print("ENTER C VALUE : ");
            int c=obj.nextInt();
            sc.Add(a,b,c);
        }
    int a1=99;
    int a2=1;
    sc.avg(a1,a2);
    
}
}
