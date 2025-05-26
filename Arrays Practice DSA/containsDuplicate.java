import java.util.HashSet;

public class containsDuplicate {
    public static boolean duplicate(int arr[]){
        HashSet<Integer> map = new HashSet<>();
        for(int i = 0; i < arr.length;i++){
            int currVal = arr[i];
            if(map.contains(currVal)){
                return true;
            } else{
                map.add(currVal);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 4};
        System.out.println(duplicate(arr));

    }
}
