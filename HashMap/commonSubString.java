import java.util.HashMap;

public class commonSubString {
    public static String twoString(String s1, String s2){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s1.length(); i++){
            char s = s1.charAt(i);
            if (!map.containsKey(s)) {
                map.put(s, 1);
            }
        }
        for(int i = 0; i < s2.length(); i++){
            char ch = s2.charAt(i);
            if(map.containsKey(ch)){
                return "YES";
            }
        } 
        return "NO";
    }
    public static void main(String[] args) {
        String s1 = "hi";
        String s2 = "world";
        System.out.println(twoString(s1, s2));
    }
}
