public class Advanced_Pattern {
    public static void print_half_triangle(int n) {
        int total_no_of_line = n;
        int space = n - 1;
        int star = 1;
        int curr_line = 1;

        while (curr_line <= total_no_of_line) {
            for (int i = 1; i <= space; i++) {
                System.out.print(" ");
            }

            for (int i = 1; i <= star; i++) {
                System.out.print("*");
            }

            System.out.println();
            curr_line++;
            space--;
            star++;
        }
    
    }

    public static void main(String[] args) {
        int n = 5;
        print_half_triangle(n);
    }

}
