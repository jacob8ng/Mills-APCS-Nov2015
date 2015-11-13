/*
 * Jacob Ng & Nathan Chau
 * APCS
 * Nov. 13, 2015
 * Chapter 5 Programming Project
 */
import java.util.*;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        game(userinput);
    }
    
    public static void game(Scanner userinput) {
        Random r = new Random();
        System.out.println("Let's play a game of Rock, Paper, Scissors");
        System.out.print("What is your move? (\"quit\" to quit) " );
        String player = userinput.next();
        String computer;
        while (player != "quit") {
            int generator = r.nextInt(3);
            if (generator == 0){
                computer = "Rock";
            }else if(generator == 1){
                computer = "Paper";
            }else{
                computer = "Scissors";
            }
            if(player == "Rock" || player == "rock"){
                if(computer == "Rock"){
                    System.out.println("The computer chose Rock. You tied.");
                }else if(computer == "Paper"){
                    System.out.println("The computer chose Paper. You lose.");
                }else {
                    System.out.println("The computer chose Scissors. You win!");
                }
            }else if(player == "Paper" || player == "paper"){
                if(computer == "Rock"){
                    System.out.println("The computer chose Rock. You win!");
                }else if(computer == "Paper"){
                    System.out.println("The computer chose Paper. You tied.");
                }else {
                    System.out.println("The computer chose Scissors. You lose.");
                }
            }else {
                if(computer == "Rock"){
                    System.out.println("The computer chose Rock. You lose.");
                }else if(computer == "Paper"){
                    System.out.println("The computer chose Paper. You win!");
                }else {
                    System.out.println("The computer chose Scissors. You tied.");
                }
            }
        }
    }
}
                    