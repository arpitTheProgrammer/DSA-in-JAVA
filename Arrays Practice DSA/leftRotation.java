import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leftRotation {
    public static List<Integer> leftRotation(List<Integer> arr, int d){
        List<Integer> list = new ArrayList<>();
        int n = arr.size();
        for(int i = d; i < n; i++){
            list.add(arr.get(i));
        }   
        for(int i = 0; i < d; i++){
            list.add(arr.get(i));
        }
        return list;
    }
    public static void main(String[] args) {
        int d = 2;
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = leftRotation(arr, d);
        System.out.println(result);
    }
    
}
