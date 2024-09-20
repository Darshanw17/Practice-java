public class Count_number_of_Seven {
    public static void main(String[] args) {
        int count = 0;
        int arr[][] = {{4,6,7} , {8,8,7}};
        int n = arr.length;
        int m = arr[0].length;
        for(int i= 0; i<n;i++){
            for(int j = 0 ;j<m ; j++){
                if(arr[i][j]==7){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
