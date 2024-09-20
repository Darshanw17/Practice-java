public class PalindromePyramid {

    public static void p_Pyramid(int n){
        int total_no_of_line = 2*n-1;

        int star = 1;
        int space = n-1;
        int curr_line = 1;

        while (curr_line<=total_no_of_line) {
            //print space
            for(int i = 1 ; i<=space ; i++){
                System.out.print("  ");
            }
            //print star
            for(int i = 1; i<=star; i++){
                System.out.print("* ");
            }
            
            //prepare for next line
            System.out.println(); 
            if(curr_line<n){
                space --;
                star = star+2;
            }else{
                space++;
                star = star -2;
            }
            curr_line++;
        }
    }
    public static void main(String[] args) {
      int n =5;
      p_Pyramid(n);
    }
    
}
