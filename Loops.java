public class Loops {
    public static void main(String[] args){
        // 1. for loop : use for repetive work like (printing of array, print each elemnt of string , for recursion)
        for(int i = 0; i < 5; i++){
            System.out.print(i+1);
        }
        System.out.println("\n-----------------------------------------------------");

        int[] marks = {99,97,98,95,99,96};
        for(int mark : marks){// this will print all element of array (this type of initialisation use for array)
            System.out.println(mark);
        }
        System.out.println("-----------------------------------------------------");
        // 2. while loops 
        int i =0;
        while(i<=3){
            System.out.println(i);
            i++;
        }
        System.out.println("-----------------------------------------------------");
        // 3. do while loop : in this 1 iteration run then check the condition 
        i = 0;
        do{
            System.out.println(i);
            i++;
        }while(i<3);
    }
}
