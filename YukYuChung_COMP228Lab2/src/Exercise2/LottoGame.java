package Exercise2;

import javax.swing.JOptionPane;

public class LottoGame {
    public static void main(String[] args) {
        int userNumber = 0;
        boolean userWins = false;

        // Ask the user to choose a number between 3 and 27
        while (true) {
            String input = JOptionPane.showInputDialog(null, "Please choose a number between 3 and 27:", "Lotto Game", JOptionPane.QUESTION_MESSAGE);

            if (input != null) { // Check if the user input or not
                // Check if the input is a valid integer and within the range
                if (isValidNumber(input, 3, 27)) {
                    userNumber = Integer.parseInt(input); // Convert to an integer

                    // Start the lotto game
                    for (int attempt = 1; attempt <= 5; attempt++) {
                        Lotto lotto = new Lotto();
                        int[] numbers = lotto.getNumbers(); // Get the generated lotto numbers
                        int sum = lotto.getSum(); // Get the sum of the lotto numbers

                        // Display the result of the current attempt
                        String message = "Attempt " + attempt + ": The lotto numbers are: ";
                        for (int num : numbers) {
                            message += num + " ";
                        }
                        message += "\nSum of numbers: " + sum;
                        JOptionPane.showMessageDialog(null, message);

                        // Check if the user's number matches the sum
                        if (sum == userNumber) {
                            JOptionPane.showMessageDialog(null, "Congratulations! You matched the sum and won the game!");
                            userWins = true;
                            break; // Exit the loop as the user has won
                        } else {
                            JOptionPane.showMessageDialog(null, "Sorry, the sum does not match.");
                        }
                    }

                    // Check if the user did not win after 5 attempts
                    if (!userWins) {
                        JOptionPane.showMessageDialog(null, "You've used all attempts. You lose!");
                    }
                    break; // Exit the outer loop as the game is finished
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number between 3 and 27.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Game cancelled.");
                System.exit(0); // Exit the program if the user cancels
            }
        }
    }

    // Helper method to check if the input is a valid integer within the given range
    private static boolean isValidNumber(String input, int min, int max) {
        // Check if the input is a number
        for (char c : input.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false; // Return false if any character is not a digit
            }
        }

        // Convert the input to an integer
        int number = Integer.parseInt(input);

        // Check if the number is within the specified range
        return number >= min && number <= max;
    }
}
