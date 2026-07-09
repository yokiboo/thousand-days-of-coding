
public class SearchInRotatedArray {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
    
    public int bSearchRotatedArray(int arr[], int i){
        if(i == null){
            return -1;
        }
        
        int left =0;
        int right = arr.length-1;
        
        while(lefr<right){
            int mid = left + (right-left)/2;
            
            if(arr[mid]==i){
                return mid;
            }
            
            if(i < arr[nid] && arr[mid] > arr[right]){
                right = mid -1;
            } else{
                left = mid+1;
            }
            
            if(i > arr[mid] && arr[mid] < arr[left]){
                lefr = mid +1;
            } else {
                right = mid -1;
            }
        }
        
        return -1;
    }
    
}