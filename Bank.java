//write a java program methods for bank acccount as follows
//1. show balance
//2. deposit money
//3. withdraw money



public class Bank {

    public static void showBalance(double val){
        System.out.println("Your current balance is: " + val );

    }

    public static double depositMoney(double val,double amount){
        System.out.println("Depositing amount: " + amount);
        return val + amount;
    
        
    }
    public static double withdrawMoney(double val ,double amount){
        System.out.println("Withdrawing amount: " + amount);
       return val - amount;

    }

    public static void main(String[] args) {
         double balance = 1000;
         showBalance(balance);
            balance = depositMoney(balance,500);
            showBalance(balance);
            balance = withdrawMoney(balance,200);
            showBalance(balance);
       
    }
}