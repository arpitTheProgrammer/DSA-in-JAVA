import java.util.HashMap;
import java.util.Map;
public class hashMap1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
		map.put("Akash", 21);
		map.put("Yash", 16);
		map.put("Lav", 17);
		map.put("Rishika", 19);
		map.put("HArry", 18);
		System.out.println(map.get("HArry"));
		System.out.println(map.get("Arpit"));
		System.out.println(map.get("Akash"));
        map.put("Akash", 25);
		System.out.println(map.get("Akash"));
        map.remove("Lav");
        System.err.println(map);
        map.putIfAbsent("Jashika", 32);
        map.putIfAbsent("Yash", 30);
        System.out.println(map);
        System.out.println(map.entrySet());
        for(String key : map.keySet()){
            System.out.printf("Age of %s of %d ", key, map.get(key));
            System.err.println();
        }
        System.out.println();
        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.printf("Age of %s of %d \n",  e.getKey(), e.getValue());
        }
        System.out.println();
        for(var e : map.entrySet()){
            System.out.printf("Age of %s of %d \n",  e.getKey(), e.getValue());

        }
}   
}
