public class Divident {
    public static int Question(int arr[], int Divisor , int Quotient , int Remainder, int n ){
         int Dividend = Quotient*Divisor+Remainder;
        for(int i = 0 ; i<n; i++){
            if(arr[i]==Dividend){
                return i;
            }
        }
        return -1;
        
    }

    public static void main(String[] args) {
       int arr[]={2,4,6,8,10};
       int n =4;
       int Divisor = 2;
       int Quotient = 1;
       int Remainder = 0;
        int result = Question(arr,Divisor,Quotient,Remainder,n);
        System.out.println(result);
       

    }
    
}
