public class Operators{
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        // Arithmetic Operators : +, -, *, /, %
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

        // Assignment Operators : =, +=, -=, *=, /= 
        // when we use any of this it will use variable value and (add, subtract, multiply, divide etc) with given value of variable 
        int c = 5;
        c += a; //15 output
        System.out.println(c);
        
        // Comparision Operators : == , >=, =<, <, >
        // we use them to compare 2 variable,value etc in if-else, switch, loops etc
        if(a==b){
            System.out.println("a and b is equal");
        }
        else{
            System.out.println("not equal");
        }

        // Logical Operators : &&, ||, !
        //  we use to check muntiple statement together 
        if(a==b && a==c){// both condition should be true
            System.out.println("every value is equal");
        }
        if(a<=b || a<=c){// at  least one of two conditions is true
            System.out.println(":)");
        }
        if(a!=20){
            System.out.println();
        }

        // Increment/Decrement : ++, --
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);
    }

    // Precedence : the operator are apply and evaluated based on precedence for example (+, -) has less precedence compared to (*, /) Hence * & / are evaluted first 
    // in case we like to change this order, we use parenthesis
}
