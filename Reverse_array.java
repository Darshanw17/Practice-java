public class Reverse_array {
    // public static void Reverse(int arr[]){
    //     int temp;
        
    //     for(int i =0; i<arr.length/2;i++){
    //         temp=arr[i];
    //         arr[i]=arr[arr.length-i-1];
    //         arr[arr.length-i-1]=temp;
    //     }
    //     for(int k =0; k<arr.length;k++){
    //         System.out.print(arr[k]);
    //     }
    // }

     // By creating a new array

     public static void NewArray(int arr[],int n){
        int b[]= new int[n];
        int j = n;
        for(int i=0 ; i<=n-1;i++){
            b[j-1]=arr[i];
           j=j-1;
        }

        for(int k=0; k<n-1;k++){
            System.out.print(b[k]+" ");
        }
     }

    public static void main(String[] args) {
        int arr[] = {4,3,5,6,2,7};
       NewArray(arr,arr.length);
    }
}
