public class MaxSubArr {
    public static void maxSubarraySum(int arr[]) { //Brute Force Approach
        int currsum = 0;
        int maxsum= Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            int start=i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                currsum=0;
                for(int k = start ; k<= end ; k++){
                    //subarry ka sum
                    currsum=currsum+arr[k];
                }
                System.out.println(currsum);
                    if(maxsum<currsum){
                        maxsum = currsum;
                    }
            }
        }
        System.out.println("The maxmium sum of the array is "+ maxsum);
    }
    public static void main(String[] args) {
        int nums[]={1,-2,6,-1,3};
        maxSubarraySum(nums);
    }
}
