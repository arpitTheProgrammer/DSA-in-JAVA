import java.util.HashMap;

public class isomorphicString {
    public static boolean isIsomorphic(String s, String t){
        s = s.toLowerCase();
        t = t.toLowerCase();
        if(s.length() != t.length()) return false;
        HashMap<Character, Character> mp1 = new HashMap<>();
        HashMap<Character, Character> mp2 = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(mp1.containsKey(ch1)){
                if(mp1.get(ch1) != ch2) return false;
            } else{
                mp1.put(ch1, ch2);
            }

            if(mp2.containsKey(ch2)){
                if(mp2.get(ch2) != ch1){
                    return false;
                }
            } else{
                mp2.put(ch2, ch1);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "aab";
        String t = "xry";
        boolean ans = isIsomorphic(s, t);
        System.out.println(ans);
    }
}
