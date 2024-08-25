public class Pairs {

    public static void FindPairs(int nums[]){
        for(int i = 0; i<nums.length; i++){
            int curr = nums[i];
            for (int j= i+1;j<nums.length; j++){
                System.out.print("("+curr+","+nums[j]+")");

            }
            System.out.println();
        }
    }


    public static void SubArrays(int nums[]){
        for(int i =0 ; i<nums.length; i++){
            int start =i ;
            for(int j = i+1; j<nums.length; j++){
                int end=j;
                for(int k = start ; k<= end ; k++){
                    System.out.print(nums[k] + " ");
                }

                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        
        //  FindPairs(nums);
    //  SubArrays(nums);
    }
    
}
