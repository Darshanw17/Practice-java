public class Sum_of_secondRow {
    public static void main(String[] args) {
        int num[][] = {{1,4,9},{11,5,3},{12,4,3}};
        int m = num[0].length;
        int sum = 0;
        for(int j=0; j<m;j++){
            sum+=num[1][j];
        }
        System.out.println(sum);
    }
    
}
