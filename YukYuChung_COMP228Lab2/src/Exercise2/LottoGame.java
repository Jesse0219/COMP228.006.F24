package Exercise2;

import javax.swing.JOptionPane;

public class LottoGame {
    public static void main(String[] args) {
        int userNumber = 0;
        boolean userWins = false;

        // Ask the user to choose a number between 3 and 27
        while (true) {
            String input = JOptionPane.showInputDialog(null, "Choose a number between 3 and 27:", "Lotto Game", JOptionPane.QUESTION_MESSAGE);
            if (input != null) {
                // Instead of parsing, we'll manually check if the input matches any number between 3 and 27
                boolean isValid = false;
                for (int i = 3; i <= 27; i++) {
                    if (input.equals(String.valueOf(i))) { // Check if input matches the string value of i
                        userNumber = i; // Assign the matched number to userNumber
                        isValid = true;
                        break;
                    }
                }

                if (isValid) {
                    // The user runs the lotto up to 5 times
                    for (int attempts = 1; attempts <= 5; attempts++) {
                        Lotto lotto = new Lotto();
                        int[] numbers = lotto.getNumbers();
                        int sum = lotto.getSum();

                        // Display the numbers and the sum
                        StringBuilder message = new StringBuilder();
                        message.append("Attempt ").append(attempts).append(": The lotto numbers are: ");
                        for (int num : numbers) {
                            message.append(num).append(" ");
                        }
                        message.append("\nSum of numbers: ").append(sum);

                        JOptionPane.showMessageDialog(null, message.toString());

                        if (sum == userNumber) {
                            JOptionPane.showMessageDialog(null, "Congratulations! You matched the sum and won the game!");
                            userWins = true;
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Sorry, the sums do not match.");
                        }
                    }

                    if (!userWins) {
                        JOptionPane.showMessageDialog(null, "You've used all attempts. The computer wins!");
                    }
                    break; // Exit the loop since a valid number was provided
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter a number between 3 and 27.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Game cancelled.");
                System.exit(0);
            }
        }
    }
}

