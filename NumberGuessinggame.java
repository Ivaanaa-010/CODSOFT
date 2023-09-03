import java.util.*;
class NmberGuessinggame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        int myNumber = rm.nextInt(100);
        int noOfGuesses = 0;
        int noOfRounds = 0;
        int attemptsLimit = 8;
        int scoreTotal = 0;
        boolean playAgain = false;

        while (!playAgain) {

            while ((noOfGuesses <= attemptsLimit)) {
                noOfRounds++;
                System.out.println("Round "+ noOfRounds);
                System.out.println("Guess the number: ");
                int userNumber = sc.nextInt();
                noOfGuesses++;
                if (userNumber < myNumber) {
                    System.out.println("Too low...");
                } else if (userNumber > myNumber) {
                    System.out.println("Too high...");
                } else {
                    System.out.printf("Congratulations<^.^> YOU WON!!!\nYou guessed the number correctly in %d attempts\nThe number was: %d ", noOfGuesses, myNumber);
                    scoreTotal++;
                    playAgain = true;
                    System.out.format("\nYou played %d rounds & Your Binary Score is: %d\nKeep Winning!! " ,noOfRounds ,scoreTotal);
                    break;
                }


                if (noOfGuesses == attemptsLimit) {
                    System.out.println("Attempts Limit Exceeded!!The correct number was: "+myNumber);
                    break;

                }
            }


            break;
            }
          System.out.println("\n**Execute to Play Again**");
    }
}
