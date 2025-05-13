import java.util.HashMap;

public class hashmapQuestion {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 1, 4, 1};
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int el : arr){
            if(!map.containsKey(el)){
                map.put(el, 1);
            } else{
                map.put(el, map.get(el) + 1);
            }
        }
        System.out.println(map);
        int maxFreq = -1;
        int ans = -1;
        for(var e: map.entrySet()){
            if(e.getValue() > maxFreq){
                maxFreq = e.getValue();
                ans = e.getKey();
            }
        }
        System.out.println(maxFreq);
        System.out.println(ans);
    }
}
