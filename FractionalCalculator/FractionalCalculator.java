/*
 * Jacob Ng
 * APCS
 * Fractional Calculator
 * Checkpoint 1
 */
import java.util.*;
public class FractionalCalculator{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("What is your equation? ");
        String x = userInput.nextLine();
        String answer = produceAnswer(x);
        System.out.println(answer);
    }
    public static String produceAnswer(String x){
        String operand1 = operand1(x);
        String operator = operator(x);
        String operand2 = operand2(x);
        return operand2;
    }
    public static String operand1(String x){
        return x.substring(0,x.indexOf(" "));
    }
    public static String operator(String x){
        return x.substring((x.indexOf(" ")+1),(x.indexOf(" ")+2));
    }
    public static String operand2(String x){
        return x.substring((x.indexOf(" ")+3),x.length());
    }
}