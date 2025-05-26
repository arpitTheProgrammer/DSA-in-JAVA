public class longestCommonPref {
    public static String longestPref(String[] str){
        if(str == null || str.length == 0) return "";
        String prefix = str[0];
        for(int i = 0; i < str.length; i++){
            while(str[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() -1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        String str[] = {"flowers", "flow", "flight"};
        System.out.println(longestPref(str));
    }
}
