//design a method which can accept a number and return its char value
public class Char_val {
    public static char getCharValue(int num){
        return (char) num;
    }
    public static void main(String[] args) {
        int number = 65;
        char charValue = getCharValue(number);
        System.out.println(charValue);
    }
}
