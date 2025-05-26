import java.util.ArrayList;
import java.util.HashMap;

public class removeDublicateII {
    public static int[] removeDup(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> resultList = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            int val = arr[i];
            if(!map.containsKey(val)){
                map.put(val, 1);
            }
                if(map.get(val) <= 2){
                    resultList.add(val);
                }
                map.put(val, map.get(val) +1);
        }
        int result[] = new int[resultList.size()];
        for(int i = 0; i < resultList.size(); i++){
            result[i] = resultList.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5};
        int result[] = removeDup(arr);
        for(int val : result){
            System.out.print(val + " ");
        }

    }
}
