public class Single_digit {
    public static int changeSingleDigit(int n){
        while (n>9) {
            if(n%2==0){ //even
                n = ((n-2)/2);
            }
            else if(n%2!=0){//odd
                n = n/2;
            }
            else{
                return n;
            }
            
        }
        return n;

    }
    public static void main(String[] args) {
        int n = 4;
       int result= changeSingleDigit(n);
       System.out.println(result);
    }
}
