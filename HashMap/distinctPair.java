import java.util.HashSet;

public class distinctPair { 
    public static int distPairNumber(int arr[]){
        HashSet<Integer> mp1 = new HashSet<>();
        int pair = 0;
        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
            if(mp1.contains(num)){
                pair++;
            } else {
                mp1.add(num);
            }
        }
        return pair;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3, 2, 3};
        System.out.println(distPairNumber(arr));
    }
}