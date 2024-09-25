package Exercise2;
import java.util.Random;


public class Lotto {
    //Array to hold three random integers between 1 and 9

    private int[] numbers;

    public Lotto() {
        numbers = new int[3];
        int[] availableNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Array of numbers from 1 to 9
        Random rand = new Random();

        // Shuffle the array of numbers
        for (int i = availableNumbers.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            // Swap the current element with the random index
            int temp = availableNumbers[index];
            availableNumbers[index] = availableNumbers[i];
            availableNumbers[i] = temp;
        }

        // Assign the first three numbers from the shuffled array to the numbers array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = availableNumbers[i];
        }
    }
    //return the array of numbers
    public int[] getNumbers() {
        return numbers;
    }

    //calculate the sum of the numbers
    public int getSum() {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

}
