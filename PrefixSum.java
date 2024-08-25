public class PrefixSum { //naya array banate hai 
    public static void prefixSum(int arr[]){
        int currSum = 0;
        int maxSum= Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];

        prefix[0]=arr[0];
        //calculate prefix array
        for(int i=0; i<prefix.length;i++){
            prefix[i]= prefix[i-i]+arr[i];
        }

        for(int i =0; i<arr.length; i++){
            int start = i;
            for(int j= i;j<arr.length ; j++){
                int end = j;
                currSum= start == 0 ? prefix[end]:prefix[end]-prefix[start-1];

                if(maxSum<currSum){
                    maxSum=currSum;
                
            }
            
        }
    }
    System.out.println("Max sum of the array is "+ maxSum);
    
}
    
    
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        prefixSum(arr);
    }
    
}
