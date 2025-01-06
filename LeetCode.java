import java.util.Scanner;

public class LeetCode {
    // public static void reverseArray(int N,  int A[], int a){
    //     if(a >= N){
    //         return;
    //     }
    //     int temp = A[a];
    //     A[a] = A[N];
    //     A[N] = temp;
    //     reverseArray(N-1, A, a+1);
    // }

    // Hourglass Problem

    public static int printHourglass(int Arr[][]){
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                int sum = Arr[i][j] + Arr[i][j+1] + Arr[i][j+2]
                        + Arr[i+1][j+1]
                        + Arr[i+2][j] + Arr[i+2][j+1] + Arr[i+2][j+2];

                        maxSum = Math.max(maxSum, sum);
                    }
        }
        return maxSum;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // int A[] = {1, 2, 3, 4};
        // reverseArray(A.length-1, A, 0);
        // for(int i = 0; i<A.length; i++){
        //     System.out.print(A[i] + " ");
        // }

        // Hourglass problem;
        int Arr[][] = new int[6][6];
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                Arr[i][j] = sc.nextInt();
            }
        }
        int result = printHourglass(Arr);
        System.out.println(result);
    }
}
