public class Min_Max {
    public static int Maximum(int arr[]){
        int Max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(Max<arr[i]){
                Max = arr[i];
            }
        }
        return Max;
    }

    public static int Minimum(int arr[]){
        int Min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<Min){
                Min = arr[i];
            }
        }
        return Min;
    }
    public static void main(String[] args) {
        int arr[] ={2,3,7,8,4,1};
        int result = Maximum(arr);
        int result3 = Minimum(arr);
        System.out.println("The maximum element in the array is: "+result);
        System.out.println("The maximum element in the array is: "+result3);
    }
}
