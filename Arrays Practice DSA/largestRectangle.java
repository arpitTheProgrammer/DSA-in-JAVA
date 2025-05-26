import java.util.Stack;

public class largestRectangle {
    public static int largestRectangleArea(int heights[]){
        Stack<Integer> stack = new Stack<>();
        int largeArea = 0; 
        for(int i = 0; i <= heights.length; i++){
            int minHeight = (i == heights.length) ? 0 : heights[i];
            while(!stack.isEmpty() && minHeight < heights[stack.peek()]){
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() -1;
                largeArea = Math.max(largeArea, height*width);
            }
            stack.push(i);
        }
        return largeArea;
    }
    public static void main(String[] args) {
        int height[] = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(height));

    }
}
