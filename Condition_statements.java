import java.util.*;
public class Condition_statements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 1. if-else 
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not an Adult");
        }

        // 2. nested if-else
        int a = 10;
        int b = 12;
        if (a == b){
            System.out.println("Equal");
        }
        else{
            if(a>b){
                System.out.println("A is greater");
            }
            else{
                System.out.println("B is greater");
            }
        }

        // 3. else-if
        a=20;
        if (a==b){
            System.out.println("equal");
        }
        else if(a>b){
            System.out.println("A is greater");
        }
        else{
            System.out.println("B is greater");
        }

        // 4. Switch
        int s = 2;

        switch (s) {
            case 1:
                System.out.println("Stop");
                break;
            case 2: 
                System.out.println("Pause");
                break;
            case 3:
                System.out.println("Go");
                break;
            default:
                System.out.println("invalid entry!!!");
                break;
        }

        // break : use to terminate the rumming statement and start exectuing the next statement
        // continue : it can be use when we have to skip 1 iteration 
        // example :
        for (int i = 0; i<=5; i++){
            if(i+1==3){
                continue;
            }
            else if (i+1==5){
                break;
            }
            else{
                System.out.println(i+1);
            }
        }
    }
}
