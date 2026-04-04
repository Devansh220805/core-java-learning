import java.util.*;
public class Strings {
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

        // Function 
        // 1. Concatenation : merge 1 or more strings 
        String first_name = "Devansh";
        String last_name = "Kuraria";
        String fullname = first_name+" "+last_name;
        System.out.println(fullname);

        // 2. length() : print length of String
        System.out.println(fullname.length()); 

        // 3. charAt() : we can check character at specific index 
        for(int i = 0; i < fullname.length(); i++){
            System.out.println(fullname.charAt(i));
        }
    }
}
