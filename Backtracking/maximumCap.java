public class maximumCap {
    public static int maxHeight(int arr[]){
        int l = 0;
        int r = arr.length-1;
        int max = 0;
        while (l < r) {
            int lh = arr[l];
            int rh = arr[r];
            int minHeight = Math.min(lh, rh);
            max = Math.max(max, minHeight*(r-l));
            if(lh < rh){ 
                l++;
            }
            else{ 
                r--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int height[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxHeight(height));
    }
    
}
