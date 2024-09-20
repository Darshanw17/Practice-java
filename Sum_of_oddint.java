public class Sum_of_oddint {

    public static int sumofOddInt(int nums[],int n){
         n = nums.length;
        int sum =0;
        for(int i=0;i<n;i++){
            if(nums[i]%2 != 0){
                sum+=nums[i];
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        int nums[]={1,2,5,7,10,12,11,1};
        int result = sumofOddInt(nums, 8);
        System.out.println(result);
    }
}
