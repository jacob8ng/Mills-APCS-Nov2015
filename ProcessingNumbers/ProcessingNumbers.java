/*
 * Jacob Ng
 * APCS
 * Collaborative Programming Project
 */
import java.util.*;
public class ProcessingNumbers{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int count = console.nextInt();
        if(count>0){
            System.out.print("What is your first number? ");
            int x = console.nextInt();
            int sum;
            if(x%2==0){
                sum = x;
            }else{
                sum = 0;
            }
            int min = x;
            int max = x;
            minMax(count, min, max, sum, console);
        }else{
            if(count==0){
                System.out.println("Cannot compute zero numbers.");
            }else{
                System.out.println("Cannot compute negative amount of numbers.");
            }
        }
    }
    public static void minMax(int count, int min, int max, int sum, Scanner console){
        int i = 1;
        int minimum = min;
        int maximum = max;
        int summation = sum;
        int maxEven = summation;
        while(i<count){
            System.out.print("What is your next number? ");
            int next = console.nextInt();
            if(next%2==0){
                summation+=next;
                if(next!=0){
                    if(maxEven==0){
                        maxEven+=summation;
                    }
                }
                    maxEven = Math.max(maxEven, next);
            }
            minimum = Math.min(minimum, next);
            maximum = Math.max(maximum, next);
            i++;
        }
        System.out.println("Smallest number: "+minimum);
        System.out.println("Largest number: "+maximum);
        System.out.println();
        System.out.println("Sum of all even numbers: "+summation);
        System.out.println("Largest even number: "+maxEven);
    }
}
            