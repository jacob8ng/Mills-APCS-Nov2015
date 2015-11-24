/*
 * Jacob Ng
 * APCS
 * Fractional Calculator
 * Checkpoint 3
 */
import java.util.*;
public class FractionalCalculator3{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("What is your equation? (\"quit\" to quit) ");
        String x = userInput.nextLine();
        while(!(x.equals("quit"))){
            String answer = produceAnswer(x);
            System.out.println(answer);
            System.out.print("What is your equation? (\"quit\" to quit) ");
            x = userInput.nextLine();
        }
        System.out.println("Done.");
    }
    public static String produceAnswer(String x){
        String operand1whole = operand1whole(x);
        String operand1num = operand1num(x);
        String operand1denom = operand1denom(x);
        String operator = operator(x);
        String operand2whole = operand2whole(x);
        String operand2num = operand2num(x);
        String operand2denom = operand2denom(x);
        return solve(operand1whole, operand1num, operand1denom, operator, operand2whole, operand2num, operand2denom);
    }
    public static String operand1whole(String x){
        String a = x.substring(0,x.indexOf(" "));
        return whole(a);
    }
    public static String operand1num(String x){
        String a = x.substring(0,x.indexOf(" "));
        return num(a);
    }
    public static String operand1denom(String x){
        String a = x.substring(0,x.indexOf(" "));
        return denom(a);
    }
    public static String whole(String a){
        int x = a.indexOf("_");
        int y = a.indexOf("/");
        if(x!=-1){
            return a.substring(0,x);
        }else if(y!=-1){
            return "0";
        }else{
            return a.substring(0,a.length());
        }
    }
    public static String num(String a){
        int x = a.indexOf("_");
        int y = a.indexOf("/");
        if(x!=-1){
            return a.substring((x+1),y);
        }else if(y!=-1){
            return a.substring(0,y);
        }else{
            return "0";
        }
    }
    public static String denom(String a){
        int x = a.indexOf("_");
        int y = a.indexOf("/");
        if(x!=-1||y!=-1){
            return a.substring((y+1),a.length());
        }else{
            return "1";
        }
    }
    public static String operator(String x){
        return x.substring((x.indexOf(" ")+1),(x.indexOf(" ")+2));
    }
    public static String operand2whole(String x){
        String a = x.substring(0,x.indexOf(" "));
        return whole(a);
    }
    public static String operand2num(String x){
        String a = x.substring(0,x.indexOf(" "));
        return num(a);
    }
    public static String operand2denom(String x){
        String a = x.substring(0,x.indexOf(" "));
        return denom(a);
    }
    public static String solve(String operand1whole, String operand1num, String operand1denom, String operator, String operand2whole, String operand2num, String operand2denom){
        int whole1 = w(operand1whole);
        int num1 = n(operand1num);
        int denom1 = d(operand1denom);
        int whole2 = w(operand2whole);
        int num2 = n(operand2num);
        int denom2 = d(operand2denom);
        if(operator.equals("+")){
            return add(whole1, num1, denom1, whole2, num2, denom2);
        }else if(operator.equals("-")){
            return subtract(whole1, num1, denom1, whole2, num2, denom2);
        }else if(operator.equals("*")){
            return multiply(whole1, num1, denom1, whole2, num2, denom2);
        }else{
            return divide(whole1, num1, denom1, whole2, num2, denom2);
        }
    }
    public static int w(String whole){
        int index = 0;
        while(index<whole.length()){
            
        }
    }
    public static int n(String num){
        int index = 0;
        while(index<num.length()){
            
        }
    }
    public static int d(String denom){
        int index = 0;
        while(index<denom.length()){
            
        }
    }
    public static String add(int whole1, int num1, int denom1, int whole2, int num2, int denom2){
        
    }
    public static String subtract(int whole1, int num1, int denom1, int whole2, int num2, int denom2){
        
    }
    public static String multiply(int whole1, int num1, int denom1, int whole2, int num2, int denom2){
        
    }
    public static String divide(int whole1, int num1, int denom1, int whole2, int num2, int denom2){
        
    }
}