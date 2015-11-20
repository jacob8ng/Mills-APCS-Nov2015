/*
 * Jacob Ng
 * APCS
 * Fractional Calculator
 * Checkpoint 2
 */
import java.util.*;
public class FractionalCalculator2{
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
        String operand1 = operand1(x);
        String operator = operator(x);
        String operand2 = operand2(x);
        return operand2;
    }
    public static String operand1(String x){
        String a = x.substring(0,x.indexOf(" "));
        String whole = whole1(a);
        String num = num1(a);
        String denom = denom1(a);
        return "whole: "+whole+" numerator: "+num+" denominator: "+denom;
    }
    public static String whole1(String a){
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
    public static String num1(String a){
        int x = a.indexOf("_");
        int y = a.indexOf("/");
        if(x!=-1){
            return a.substring((x+1),y);
        }else if(y!=-1){
            return a.substring(0,a.indexOf("/"));
        }else{
            return "0";
        }
    }
    public static String denom1(String a){
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
    public static String operand2(String x){
        String a = x.substring((x.indexOf(" ")+3),x.length());
        String whole = whole2(a);
        String num = num2(a);
        String denom = denom2(a);
        return "whole: "+whole+" numerator: "+num+" denominator: "+denom;
    }
    public static String whole2(String a){
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
    public static String num2(String a){
        int x = a.indexOf("_");
        int y = a.indexOf("/");
        if(x!=-1){
            return a.substring((x+1),y);
        }else if(y!=-1){
            return a.substring(0,a.indexOf("/"));
        }else{
            return "0";
        }
    }
    public static String denom2(String a){
        int x = a.indexOf("_");
        int y = a.indexOf("/");
        if(x!=-1||y!=-1){
            return a.substring((y+1),a.length());
        }else{
            return "1";
        }
    }
}