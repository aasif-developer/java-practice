import java.util.Scanner;
import java.util.Stack;
public class ValidParentheses
{
    public static boolean isValid(String s)
    {
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(')
            {
                st.push('(');
            } 
            else if (c == '{')
            {
                st.push('{');
            } 
            else if (c == '[')
            {
                st.push('[');
            } 
            else
            {
                if (st.isEmpty())
                    return false;
                char x = st.pop();
                if (c == ')' && x != '(')
                    return false;
                if (c == '}' && x != '{')
                    return false;
                if (c == ']' && x != '[')
                    return false;
            }
        }
        if (st.isEmpty())
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        if (isValid(s))
            System.out.println("Valid Parentheses");
        else
            System.out.println("Invalid Parentheses");
        sc.close();
    }
}
/* EXPLANATION :
1. We store opening brackets in a stack.
2. When a closing bracket comes, we remove the last opening bracket.
3. If brackets do not match, return false.
4. If stack is empty at the end, the string is valid.
*/
