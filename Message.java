public class Message {
    //WAJP and create a method which can accept one int number and print its table 
    public static void table(int a ){
        for(int i = 1; i<= 10 ; i++){
            System.out.println( a +"*" + i+ "=" +(a * i) );
        }
    }
    // Printing Message
    public static void msg(){
        System.out.println("Good Evening");
        System.out.println("Happy Ganesh Chatruthi");
    }
    public static void main(String[] args) {
        // msg();
        table(5);
    }
}


