public class Superior_arr {
    public static int FindNumberOfSuperiorElement(int nums[], int n) {
        n = nums.length;
        int count = 0;
        int maxSeenSoFor=Integer.MIN_VALUE;
        for (int i = n-1; i >=0; i--) {
            if (nums[i] > maxSeenSoFor) {
                maxSeenSoFor = nums[i];
               count ++; 
            }
         
        }
        return count;

    }

    public static void main(String[] args) {
        int nums[] = { 1,2,3,4,5 };
        int result = FindNumberOfSuperiorElement(nums, 6);
        System.out.println(result);
    }
}
