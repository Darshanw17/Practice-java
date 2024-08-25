public class Kadanes {

    public static void maxSubarraySumkadanes(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs =0;
        for(int i=0; i<arr.length ; i++){
            cs = cs+arr[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(ms,cs);
        }
        System.out.println("Our max subarray sum is: "+ms);
    }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        maxSubarraySumkadanes(arr);  
    }
    
}
