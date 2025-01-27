import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] choices = {"Rock", "Paper", "Scissors"};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your choice (Rock, Paper, Scissors): ");
        String userChoice = scanner.nextLine().trim();
        String computerChoice = choices[(int) (Math.random() * 3)];

        System.out.println("Computer chose: " + computerChoice);

        if (userChoice.equalsIgnoreCase(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (
            (userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
            (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
            (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))
        ) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }

        scanner.close();
    }
}
