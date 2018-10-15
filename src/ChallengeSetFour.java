import java.util.Scanner;
public class ChallengeSetFour {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[]args){
        new ChallengeSetFour();
    }


    public ChallengeSetFour(){
        guessingGame();

    }
    public void guessingGame() {
        while (5 != 4) {
            int randNum = (int) Math.floor(Math.random() * 1001);
            int guesses = 0;
            int guess;
            do {
                System.out.println("Guess my number! (between 0 and 1000)");
                guess = scanner.nextInt();
                if (guess == randNum) {
                    guesses++;
                    break;
                } else if (guess < randNum) {
                    System.out.println("That is less than my number.");
                } else {
                    System.out.println("That is greater than my number.");
                }
                guesses++;
            } while (randNum != guess);
            System.out.println("Congratulations! You guessed my number in " + guesses + " guesses!");
            System.out.println("Would you like to play again? (Y/N)");
            if (scanner.next().equals("N")) {
                break;
            }
        }


    }

    }









