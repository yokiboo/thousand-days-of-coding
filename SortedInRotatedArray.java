
public class SearchInRotatedArrayRedo {
    
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        System.out.println(searchIn(arr,0));
    }
    
    public static int searchIn(int[] arr, int i){
        if(arr == null || arr.length == 0){
            return -1;
        }
        
        int left = 0;
        int right = arr.length-1;
        
        while(left <= right){
            int mid = left + (right - left)/2;
            
            if(arr[mid] == i){
                return mid;
            }
            
            if(arr[left] <= arr[mid]){
                if(i < arr[mid] && i>= arr[left]){
                    right = mid-1;
                } else {
                    left = mid+1;
                }
            } else{
                if(i > arr[mid] && i<= arr[right]){
                    left = mid+1;
                } else {
                    right = mid-1;
                }
            }
        }
        
        return -1;
        
    }
}