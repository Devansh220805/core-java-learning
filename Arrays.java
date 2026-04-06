import java.util.*;
public class Arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Syntax
        int[] number = new int[5];
        number[0] = 40;
        number[1] = 50;
        // Or
        int[] marks = {97,98,85,89};
        
        // how to print Arrays
        for(int i = 0; i < number.length; i++){
            System.out.println("Index : "+i +"| Values : "+number[i]);
        }

        for(int i=0; i < marks.length; i++){
            System.out.println("Index : "+i+" | Values : "+ marks[i]);
        }
 

        // Q1. How to take input from useer in Array
        System.out.print("Enter number of value you want to enter :\t");
        int size = sc.nextInt();
        int no[]=new int[size];

        for(int i=0; i<size; i++){
            System.out.print("\nEnter "+(i+1)+" value :\t");
            no[i]=sc.nextInt();
        }
        // for(int i=0; i < no.length; i++){
        //     System.out.println("Index : "+i+" | Values : "+ no[i]);
        // }

        // Tacke an array as input from user Search for a given no X and print the index at which it occurs
        System.out.print("Enter number You want to Find in array :\t");
        int fno = sc.nextInt();

        if(size !=0){
            for(int i=0; i<size; i++){
                if(fno == no[i]){
                    System.out.println("\n Number found at index :\t"+i);
                    break;
                }
            }
        }
    }
}
