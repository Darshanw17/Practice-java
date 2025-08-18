import java.util.Scanner;

public class Main {
    public int GetBMICategory(int weight, double height){
        double bmi = weight/(height*height);
        if(bmi<18){
            return 0;
        }
        else if(bmi>=18 && bmi<25){
            return 1;
        }

        else if(bmi>=25 && bmi<30){
            return 2;

        }
        else if(bmi>=30 && bmi<40){
            return 3;
        }
        else{
            return 4;
        }

    }

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        Main obj = new Main();
        int weight = sc.nextInt();
        double height = sc.nextDouble();
        int res = obj.GetBMICategory(weight, height);
        System.out.println(res);
        sc.close();
    }
}
