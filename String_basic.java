import java.util.*;
public class String_basic {
    public static void Main(String[] args){
        Scanner sc = new Scanner(System.in);
        // String are immutable 
        // Syntax
        String Name = "Devansh";
        System.out.println(Name);

        String str = new String("Hello World");
        System.out.println(str);

        // input from user 
        System.out.print("Enter any Sentence: ");
        String a = sc.nextLine();
        System.out.println(a);

    }
}
