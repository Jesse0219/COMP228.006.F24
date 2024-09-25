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
                try {
                    userNumber = Integer.parseInt(input);
                    if (userNumber >= 3 && userNumber <= 27) {
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Please enter a number between 3 and 27.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number between 3 and 27.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Game cancelled.");
                System.exit(0);
            }
        }

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
    }
}