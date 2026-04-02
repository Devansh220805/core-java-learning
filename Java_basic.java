import java.util.*;
public class Java_basic{
    public static void main(String[] args){
        System.out.println("Hello world!");// print statement

        // variable = container to store data 
        int a = 2;
        // data type =  that defines the type of value a variable can hold 

        /* 1. Primitive
            int : whole number
            long : store larger whole number then int 
            short : range of number is short then int 
            double : decimal value 
            char : single character 
            boolean : store true/false only 
            float : floting point number 
            byte : it can store 1 byte(8 bits)
            
          2. Non-Primitive
            Array : collection of similar type of data  
            String : use to store word , line 
            class : Blue print of an real world object 
            Object : Instance of class (Characters)
        */      

        // How to take an imput in java 
        /*
            1. we import library (import java.util.*;)
            2. in main section we write (Scanner sc = new Scanner(System.in);)
            3.for imput in any variable (int a = sc.nextInt();)
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int age = sc.nextInt();
        System.out.println("\nAge is : "+ age);

        /*
            variation of sc.next(): 
            1. next() : input only one(1) word
            2. nextline() : input ultiple word ( including space )
            3. nextInt() : to take input of Int value
            4. nextFloat() : to take input of Float value
            5. nextDouble() : to take input of Double value 
        */

        // Question 1: Take 2 variable  "b" & "c" and print their sum
        System.out.print("Input 1 value: ");
        int b = sc.nextInt();
        System.out.print("\nInput 2 value: ");
        int c = sc.nextInt();
        int sum = b + c;
        System.out.println("Sum of "+b+" + "+c+"\t=\t" + sum);

        
    }
}