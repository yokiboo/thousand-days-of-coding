
public class SubArray {
    
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(maxSumSub(arr));
    }
    
    public static int maxSumSub(int[] arr){
        int temp =0;
        int max =0;
        
        for(int i=0; i<arr.length; i++){
            temp = arr[i];
            
            for(int j=i+1; j<arr.length; j++){
                temp += arr[j];
                
                if(max < temp){
                    max = temp;
                }
            }
        }
        
        return max;
    }
}