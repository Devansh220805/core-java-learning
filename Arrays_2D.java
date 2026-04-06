import java.util.*;
public class Arrays_2D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Syntax
        int [][] number = new int [2][2];

        number[0][0] =1;// how to enter value in 2D array

        // Q1. take input from user 
        System.out.print("Enter number of rows You want:\t");
        int rows = sc.nextInt();
        System.out.print("\nEnter number of columns You want:\t");
        int cols = sc.nextInt();

        int[][] no = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print("\nEnter value at index "+i+" "+j+"\t");
                no[i][j] = sc.nextInt();
            }
            System.out.println("\n");
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.println(no[i][j]+"\t");
            }            
        }

        // Q2. Search for given number by user in 2D array and show index at which it store
        System.out.print("Enter number you wnat to Find :\t");
        int fno = sc.nextInt();
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(no[i][j]== fno){
                    System.out.println("\nnumber store at index :\t"+"["+i+"]["+j+"]");
                    break;
                }
            }
        }
    }
}
