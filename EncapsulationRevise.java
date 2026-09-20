class Recall
{
    static int Addition(int a , int b)
    {
        return a+b;
    }
}
public class EncapsulationRevise
{
    public static void main(String[] args)
    {
        int a = 10;
        int b=20;
        int c=Recall.Addition(a,b);
        System.err.println("THE SUM IS  : "+c);
    }
}