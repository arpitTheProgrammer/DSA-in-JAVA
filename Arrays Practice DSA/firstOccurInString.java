import java.util.ArrayList;

public class firstOccurInString {
    public static int findOccur(String haystack, String needle){
        if(needle.length() == 0) return 0;
        for(int i = 0; i <= haystack.length() - needle.length(); i++){
            String sub = haystack.substring(i, i+needle.length());
            if(sub.equals(needle)){
                return i;
            }
        }
        return -1;
}
    
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad"; 
        System.out.println(findOccur(haystack, needle));

    }
}
