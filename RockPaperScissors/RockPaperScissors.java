/*
 * Jacob Ng & Nathan Chau
 * APCS
 * Nov. 13, 2015
 * Chapter 5 Programming Project
 */
import java.util.*;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in); // used for user's game move
        game(userinput);
    }
    public static void game(Scanner userinput) {
        Random r = new Random(); // used to generate a random number for later conversion
        System.out.println("Let's play a game of Rock, Paper, Scissors.");
        System.out.print("What is your first move? (\"quit\" to quit) " ); // prompts user for first move
        String player = userinput.next();
        while (!(player.equals("quit"))) { // sentinel is "quit": while userinput is not "quit", continue game
            int generator = r.nextInt(3); // generate a random integer between 0-2
            String computer;
            if (generator == 0){ // convert random number to a corresponding game move for the computer
                computer = "Rock";
            }else if(generator == 1){
                computer = "Paper";
            }else{
                computer = "Scissors";
            }
            if(player.equals("Rock") || player.equals("rock")){ // tests computer's move with rock
                if(computer.equals("Rock")){
                    System.out.println("The computer chose Rock. You tied.");
                }else if(computer.equals("Paper")){
                    System.out.println("The computer chose Paper. You lose.");
                }else {
                    System.out.println("The computer chose Scissors. You win!");
                }
            }else if(player.equals("Paper") || player.equals("paper")){ // tests computer's move with paper
                if(computer.equals("Rock")){
                    System.out.println("The computer chose Rock. You win!");
                }else if(computer.equals("Paper")){
                    System.out.println("The computer chose Paper. You tied.");
                }else {
                    System.out.println("The computer chose Scissors. You lose.");
                }
            }else if(player.equals("Scissors") || player.equals("scissors")) { // tests computer's move with scissors
                if(computer.equals("Rock")){
                    System.out.println("The computer chose Rock. You lose.");
                }else if(computer.equals("Paper")){
                    System.out.println("The computer chose Paper. You win!");
                }else {
                    System.out.println("The computer chose Scissors. You tied.");
                }
            }else{ // tells user to input valid move if invalid move is entered
                System.out.println("Not valid move.");
            }
            System.out.print("What is your next move? (\"quit\" to quit) "); // prompts user for next move
            player = userinput.next();
        }
        System.out.println("Game Over."); // signals end of game, after user enters "quit"
    }
}
                    