import java.util.Scanner;

public class UserDefinedFunctionExample {

    // User-defined function
    public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Calling the user-defined function
        int result = addNumbers(num1, num2);

        System.out.println("Sum = " + result);
    }
}
