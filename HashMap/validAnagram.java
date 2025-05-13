import java.util.HashMap;

public class validAnagram {
    static HashMap<Character, Integer> makeFreqMap(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            } else{
                map.put(ch, map.get(ch) + 1);
            }
        }
        return map;
    }
    public static boolean isAnagram(String s, String t){
        s = s.toLowerCase();
        t = t.toLowerCase();
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map1 = makeFreqMap(s);
        HashMap<Character, Integer> map2 = makeFreqMap(t);
        return map1.equals(map2);
    }
    public static void main(String[] args) {
        String s = "Keen";
        String t = "Knee";
        boolean ans = isAnagram(s, t);
        System.out.println(ans);
    }
}
