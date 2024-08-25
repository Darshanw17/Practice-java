import java.util.Scanner;

public class Rat{
    public static int solve(int r, int unit, int arr[],int n){
        if(arr==null){
            return -1;
        }
        int sum = 0;
        int count =0;
        int result = r*unit;
        for(int i=0; i<n; i++){
            sum += arr[i];
            count ++;
             
            if(sum >= result){
              break;
            }
        }
        if (sum<result) {
            return 0;
        }
        return count;
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         System.out.println("enter the no of rats");
    int r = sc.nextInt ();
    System.out.println("enter the unit");
    int unit = sc.nextInt ();
    System.out.println("enter the no of elements in array");
    int n = sc.nextInt ();
    System.out.println("enter the elements of array");  // take input from user
    int arr[] = new int[n];

    for (int i = 0; i < n; i++)
      arr[i] = sc.nextInt ();
      sc.close();
    System.out.println (solve (r, unit, arr, n));
    }
}