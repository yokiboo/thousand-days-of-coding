
public class ScoreCalc {
    
    public static void main(String[] args) {
        
        System.out.println(calc(13));
    }
    
    public static int calc(int n){
        int i;
        int[] arr = new int[n+1];
        arr[0] =1;
        for(i=1; i<=n; i++){
            if(i-3 >= 0){
                arr[i] += arr[i-3];
            }
            if(i-5 >= 0){
                arr[i] += arr[i-5];
            }
            if(i-10>=0){
                arr[i] += arr[i-10];
            }
        }
        
        return arr[n];
        
    }
    
}