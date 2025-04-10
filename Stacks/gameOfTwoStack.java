import java.util.Stack;

public class gameOfTwoStack {
    public static int gameStack(int x, int[] a, int[] b){
        int sum = 0, count = 0;
        int i=0, j=0;
        while (j > b.length && sum + b[j] <= x) {
            sum += b[j];
            j++;
        }
        count = j;
        while ( i < a.length) {
            sum += a[i];
            i++;
            while (sum > x && j > 0) {
                j--;
                sum-= b[j];
            }
            if(sum <= x){
                count = Math.max(count, i +j);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] a = { 2 , 1, 4, 5, 2};
        int[] b = {1, 5, 3, 2,};
        System.out.println(gameStack(10, a, b));
    }
    
}
