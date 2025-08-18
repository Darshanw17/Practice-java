public class MergeSort {
    public static void printArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void divide(int arr[],int si , int ei){
        if(si>=ei){
            return;
        }
       int mid = si+(ei-si)/2;
       divide(arr, si, mid);
       divide(arr, mid+1, ei);

       conqure(arr,si,mid,ei);
    }

    public static void conqure(int arr[],int si , int mid, int ei){
        int temp[]=new int[ei-si+1];
        int i=si; //index for 1st sorted part
        int j= mid+1; //index for 2nd sorted part
        int k=0; //index for new array i.e temp
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        //for leftover elements of 1st sorted part
        while (i<=mid) {
            temp[k++]=arr[i++]; 
        }
        while (j<=ei) {
            temp[k++]=arr[j++]; 
        }

        //to copy the elements form temp array to original array
        for(int k=0 ; k<temp.length ; k++){
            
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        int n = arr.length;

    }
    
}
