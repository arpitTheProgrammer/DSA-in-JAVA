import java.util.HashMap;
import java.util.Map;

public class hashmap{
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion Operation
        map.put("India", 120);
        map.put("China",  90);
        map.put("US", 130);
        System.out.println(map);
        map.put("India", 150);
        System.out.println(map);

        //Search 

        if(map.containsKey("London")) System.out.println("Present");
        else System.out.println("Node Present");


        // Another type of for loop
        int[] arr = {31, 32 , 23, 43};
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.err.println();

        // Using loop to print HashMap
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.print(e.getKey() + " = ");
            System.out.println(e.getValue());
        }

        
        // Remove

        map.remove("China");
        System.out.println(map);

    }
}