import java.util.Scanner;

// Right Rotation
public class HackerRank {
    public static void rightRotation(int arr[]){
        int lastElement = arr[arr.length-1];
        for(int i = arr.length-1; i > 0; i--){
            arr[i] = arr[i-1];
            System.out.println(arr[i]);
        }
        arr[0] = lastElement;
    }
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        for(int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }
        rightRotation(arr);
        printArr(arr);
    }
    
}
