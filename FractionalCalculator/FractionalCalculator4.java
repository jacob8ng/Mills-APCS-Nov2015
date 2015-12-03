/*
 * Jacob Ng
 * APCS
 * Fractional Calculator
 * Final
 */
import java.util.*;
public class FractionalCalculator4{
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
        String a = x.substring((x.indexOf(" ")+3),x.length());
        return whole(a);
    }
    public static String operand2num(String x){
        String a = x.substring((x.indexOf(" ")+3),x.length());
        return num(a);
    }
    public static String operand2denom(String x){
        String a = x.substring((x.indexOf(" ")+3),x.length());
        return denom(a);
    }
    public static String solve(String operand1whole, String operand1num, String operand1denom, String operator, String operand2whole, String operand2num, String operand2denom){
        int whole1 = w(operand1whole);
        int num1 = n(operand1num);
        int denom1 = d(operand1denom);
        int whole2 = w(operand2whole);
        int num2 = n(operand2num);
        int denom2 = d(operand2denom);
        int numerator1;
        int numerator2;
        if(whole1>=0){
            numerator1 = (whole1*denom1)+num1;
        }else{
            numerator1 = (whole1*denom1)-num1;
        }
        if(whole2>=0){
            numerator2 = (whole2*denom2)+num2;
        }else{
            numerator2 = (whole2*denom2)-num2;
        }
        if(operator.equals("+")){
            return add(numerator1, denom1, numerator2, denom2);
        }else if(operator.equals("-")){
            return add(numerator1, denom1, (-1*numerator2), denom2);
        }else if(operator.equals("*")){
            return multiply(numerator1, denom1, numerator2, denom2);
        }else{
            return multiply(numerator1, denom1, denom2, numerator2);
        }
    }
    public static int w(String whole){
        return Integer.parseInt(whole);
    }
    public static int n(String num){
        return Integer.parseInt(num);
    }
    public static int d(String denom){
        return Integer.parseInt(denom);
    }
    public static String add(int num1, int denom1, int num2, int denom2){
        int denom = denom1*denom2;
        num1 *= denom2;
        num2 *= denom1;
        int num = num1+num2;
        return simplify(num, denom);
    }
    public static String multiply(int num1, int denom1, int num2, int denom2){
        int num = num1*num2;
        int denom = denom1*denom2;
        return simplify(num, denom);
    }
    public static String simplify(int num, int denom){
        int whole = num/denom;
        num %= denom;
        int i;
        i = Math.abs(denom);
        while(num%i != 0 || denom%i != 0){
            i--;
        }
        num/=i;
        denom/=i;
        if(whole==0 && num==0 && denom==1){
            return "0";
        }else if(whole==0){
            return num+"/"+denom;
        }else if(num==0){
            return Integer.toString(whole);
        }else{
            return whole+"_"+Math.abs(num)+"/"+denom;
        }
    }
}