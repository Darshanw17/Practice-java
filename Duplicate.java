import java.util.Arrays;

public class Duplicate {
    public static boolean ContainDuplicate(int arr[]){
        Arrays.sort(arr);
       for(int i=0; i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                return true;
            }
       }
       return false;
    
    }

    public static void main(String[] args) {
        int arr[]={4,5,6,3,2,4,3,5,6};
       boolean result= ContainDuplicate(arr);
       System.out.println(result);
    }
}
