package Exercise2;

import java.util.Random;

public class Lotto {
    private int[] numbers; // Array to hold three random integers

    // Constructor
    public Lotto() {
        numbers = new int[3];
        Random random = new Random();

        // Populate the array with random numbers between 1 and 9
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(9) + 1; // Random number between 1 and 9
        }
    }

    // Method to return the array of generated numbers
    public int[] getNumbers() {
        return numbers;
    }

    // Method to calculate and return the sum of the numbers
    public int getSum() {
        int sum = 0;
        for (int number : numbers) {
            sum += number; // Add each number to the sum
        }
        return sum;
    }
}
