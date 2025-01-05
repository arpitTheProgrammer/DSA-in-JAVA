import java.util.Scanner;

public class arraysOperation {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter the Size of array");
        a = sc.nextInt();
        int arr[] = new int[a];
       
        System.out.println("Enter the Elements");
        for(int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }

        // Insert Element in Array


        // int arr1[] = new int[a+1];
        // System.out.println("Select the position You want to insert Value");
        // int b = sc.nextInt();
        // // Enter the value
        // System.out.println("Enter the value of Array");
        // int c = sc.nextInt();
        // for(int i = 0; i < a+1; i++){
        //     if(i < b){
        //         arr1[i] = arr[i];
        //     } else if ( i == b){
        //         arr1[i] = c;
        //     }  else{
        //         arr1[i] = arr[i-1];
        //     }
        // }
        // for(int i = 0; i < a+1; i++){
        //     System.out.print(arr1[i] + " ");
        // }

        

        // Delete Value From an Array

        int arr1[] = new int[a-1];
        // Select position you want to Delete
        System.out.println("Enter Postion you want to delete");
        int b = sc.nextInt();
        for(int i = 0; i < a-1; i++){
            if( i < b){
                arr1[i] = arr[i];
            } else{
                arr1[i] = arr[i+1];
            }
        }
        for(int i = 0; i < a-1; i++){
            System.out.print(arr1[i] + " ");
        }
        
    }
}