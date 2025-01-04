import java.util.Scanner;

public class arrays {
    public static void main(String[] args){
        // Declaration of arr
        int arr[] = new int[]{10, 20, 30, 40, 50};
        // Or
        int[] arrr = new int[]{10, 20, 30, 40, 50};


        // how to Print Arrays

        // for(int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }


        // User Defined Array

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number Of elements");
        n = sc.nextInt(); // define the Size of Arrays3
        int a[] = new int[n];
        System.out.println("Enter the values");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt(); //  Print elements of Arrays 
        }
        for(int i = 0; i<n; i++){
            System.out.print(a[i] + " ");
        }
    }
}