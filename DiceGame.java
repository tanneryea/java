import java.util.Random;

public class DiceGame {
    public static void main(String[] args){
        int humanWins = 0;
        int compWins = 0;
        int ties = 0;
        Random dice = new Random();

        System.out.println("Welcome to the game!");

        for (int x = 1; x <=10; x++){
            int compDice = dice.nextInt(5) + 1;
            int humanDice = dice.nextInt(5) + 1;
            System.out.println("The computer rolled " + compDice + ". You rolled " + humanDice + ".");
            if (compDice > humanDice) {
                compWins++;
            } else if (humanDice > compDice){
                humanWins++;
            } else{
                ties++;
            }
        }

        System.out.println("The grand total is: ");
        System.out.println("Human: " + humanWins);
        System.out.println("Computer: " + compWins);
        System.out.println("Ties: " + ties);

        if (humanWins > compWins){
            System.out.println("You win!");
        } else if (compWins > humanWins){
            System.out.println("The computer wins!");
        } else {
            System.out.println("You and the computer tied!");
        }



    }
}