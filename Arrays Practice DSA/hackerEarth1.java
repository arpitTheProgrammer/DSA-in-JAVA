import java.util.Scanner;

public class hackerEarth1 {
    public static int specificPair(int n, int[] arr){
        int result = 0;
        String str ;
        int sum;
        for(int i = 0; i < arr.length; i++){
            str = "" + arr[i];
            for(int j = 0; j <= str.length(); j++){
                char ch = str.charAt(j);
                int num = (int)ch;
                sum =+ num;
            }
        }
        return result;
    }
    public static void printArray(int[] arr){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {17, 71, 51, 24};
        printArray(arr);
    }
}