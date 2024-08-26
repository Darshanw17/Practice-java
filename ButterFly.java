public class ButterFly {
    public static void main(String[] args) {
        int n = 4;
        int total_no_of_line= 2*n;
        int star = 1;
         
        int space = 2*n-2;
        int curr_line = 1;


        while (curr_line<= total_no_of_line) {
            // print stars
            for(int i = 1; i<=star ; i++){
                System.out.print("*");
            }


            //print spaces
            for(int i =1 ; i<=space ; i++){
                System.out.print(" ");
            }


            //print stars
            for(int i = 1; i<=star ; i++){
                System.out.print("*");
            }

            //prepare for the next line
            System.out.println();
            if(curr_line<n){
                star++;
                space = space - 2;
            } else{
            star--;
            space = space + 2;
            }
            
            curr_line++;
            
              
        }
    }
    
}
