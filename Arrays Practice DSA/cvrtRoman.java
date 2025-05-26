import java.util.HashMap;
import java.util.Map;

public class cvrtRoman {

    public static int convertIntoRoman(String str) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int ans = 0;
        int prevVal = 0;
        for (int i = str.length()-1; i >= 0; i--) {
            char currChar = str.charAt(i);
            if(romanMap.get(currChar) < prevVal){
                ans -= romanMap.get(currChar);
            } else {
                ans += romanMap.get(currChar);
            }
            prevVal = romanMap.get(currChar);
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "MCMXCIV";
        System.out.println(convertIntoRoman(str));
    }
}
