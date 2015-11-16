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
        while (!(player.equals("quit"))) {
            int generator = r.nextInt(3);
            String computer;
            if (generator == 0){
                computer = "Rock";
            }else if(generator == 1){
                computer = "Paper";
            }else{
                computer = "Scissors";
            }
            if(player.equals("Rock") || player.equals("rock")){
                if(computer.equals("Rock")){
                    System.out.println("The computer chose Rock. You tied.");
                }else if(computer.equals("Paper")){
                    System.out.println("The computer chose Paper. You lose.");
                }else {
                    System.out.println("The computer chose Scissors. You win!");
                }
            }else if(player.equals("Paper") || player.equals("paper")){
                if(computer.equals("Rock")){
                    System.out.println("The computer chose Rock. You win!");
                }else if(computer.equals("Paper")){
                    System.out.println("The computer chose Paper. You tied.");
                }else {
                    System.out.println("The computer chose Scissors. You lose.");
                }
            }else if(player.equals("Scissors") || player.equals("scissors")) {
                if(computer.equals("Rock")){
                    System.out.println("The computer chose Rock. You lose.");
                }else if(computer.equals("Paper")){
                    System.out.println("The computer chose Paper. You win!");
                }else {
                    System.out.println("The computer chose Scissors. You tied.");
                }
            }else{
                System.out.println("Not valid move.");
            }
            System.out.print("What is your next move? (\"quit\" to quit) ");
            player = userinput.next();
        }
        System.out.println("Game Over.");
    }
}
                    