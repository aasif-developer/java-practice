import java.util.*;

public class StringsDemo {

    public static void main(String[] args) {

        // 1. Creating a String
        System.out.println("1. CREATING A STRING:");
        String s1 = "Hello";
        String s2 = new String("World");
        System.out.println(s1);
        System.out.println(s2);

        System.out.println();

        // 2. String Length
        System.out.println("2. STRING LENGTH:");
        System.out.println("Length of s1 = " + s1.length());

        System.out.println();

        // 3. String Concatenation
        System.out.println("3. CONCATENATION:");
        String s3 = s1 + " " + s2;
        System.out.println(s3);

        System.out.println();

        // 4. Access Character
        System.out.println("4. ACCESSING CHARACTER:");
        System.out.println("Character at index 1 = " + s1.charAt(1));

        System.out.println();

        // 5. Convert Case
        System.out.println("5. UPPERCASE & LOWERCASE:");
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        System.out.println();

        // 6. Comparing Strings
        System.out.println("6. COMPARING STRINGS:");
        String s4 = "hello";
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s4));

        System.out.println();

        // 7. Substring
        System.out.println("7. SUBSTRING:");
        System.out.println(s3.substring(0,5));

        System.out.println();

        // 8. Replace
        System.out.println("8. REPLACE:");
        System.out.println(s3.replace("Hello","Hi"));

        System.out.println();

        // 9. Check Contains
        System.out.println("9. CONTAINS:");
        System.out.println(s3.contains("World"));

        System.out.println();

        // 10. User Input String
        System.out.println("10. STRING FROM USER INPUT:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String user = sc.nextLine();
        System.out.println("You entered: " + user);

    }
}