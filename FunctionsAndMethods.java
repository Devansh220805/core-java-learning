import java.util.*;
public class FunctionsAndMethods {
    public static void printmyname(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // function : function is a block of code which take some input and do some operation and produce an output
        /*Syntax:
          returntype function_name(type arg1, type arg2){
            operation
          }

          in main section :
          function_name(args1,args2); function call
        */
        System.out.print("Enter your name:\t");
        String name = sc.nextLine();

        printmyname(name);

    }
}
