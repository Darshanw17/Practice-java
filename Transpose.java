public class Transpose {
    public static void main(String[] args) {
        int arr[][] = {{ 2,4,12},{45,5,2},{12,13,24}};
        int n = arr.length;
        int m = arr[0].length;
        int [][] Transpose_arr = new int[m][n];
        for(int i=0; i<m;i++){
            for(int j = 0 ; j<n ; j++){
                Transpose_arr[i][j]= arr[j][i];
            }
        }


        for(int i=0; i<m;i++){
            for(int j = 0 ; j<n ; j++){
                System.out.print(Transpose_arr[i][j] + " ");
            }
            System.out.println();
        }
       

    }
   
    
}
