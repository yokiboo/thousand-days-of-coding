
public class MaximumProductSubArray {
    
    public static void main(String[] args) {
        
        int max =0;
        int maxSoFar = 0;
        
        int[] arr = {2,3,-2,4};
        
        for(int i=0; i<arr.length; i++){
            int cur = arr[i];
            max = Integer.max(cur, max*cur);
            
            maxSoFar = Integer.max(max, maxSoFar);
        }
        System.out.println(maxSoFar);
    }
    
}