import java.util.*;
public class String_basic{
    public static void main(String[] args){
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

        // 4. CompareTO() : compare 2 string and return 
        if(first_name.compareTo(last_name)==0){
            System.out.println("String is equal");
        }
        else{
            System.out.println("String is not equal");
        }

        // 5. substring() : extract part of string 
        System.out.println(fullname.substring(0,8));

        // 6. parseInt : comvert String into int 
        String no = "123";
        int num = Integer.parseInt(no);
        System.out.println(num);

        // 7. tostring() : convert number into string 
        int number = 1234;
        String str1 = Integer.toString(number);
        System.out.println(str1);


    }
}

