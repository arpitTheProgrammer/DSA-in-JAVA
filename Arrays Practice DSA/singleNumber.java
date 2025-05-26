import java.util.HashMap;
import java.util.Map;

public class singleNumber {
    public static int singleNumber(int nums[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int cl = nums[i];
            if(!map.containsKey(cl)){
                map.put(cl, 1);
            } else{
                map.put(cl, map.get(cl) + 1);
            }
        }
        
        for(Map.Entry<Integer, Integer>  entry : map.entrySet()){
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {1, 1, 3, 2, 2};
        System.out.println(singleNumber(nums));
    }
}
