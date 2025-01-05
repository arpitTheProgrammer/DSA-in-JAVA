import java.util.Scanner;

public class twoDarraysOperation {
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter the Size of rows");
        a = sc.nextInt();
        System.out.println("Enter the size Column");
        b = sc.nextInt();
        int arr[][] = new int[a][b];
        System.out.println("Print the Values");
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<a; i++){
            for(int j = 0; j < b; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.err.println();
        }
    }    
}
