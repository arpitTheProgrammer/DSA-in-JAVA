import java.util.Scanner;
public class arrays2 {
    public static void main(String[] args){
        int a, b ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows");
        a = sc.nextInt();
        System.out.println("Enter the Number of Columns");
        b = sc.nextInt();
        int arr[][] = new int[a][b];
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // Print arrays

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}