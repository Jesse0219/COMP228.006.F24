package Exercise2;
import java.util.Random;


public class Lotto {
    //Array to hold three random integers between 1 and 9
    private int[] numbers;

    public Lotto() {
        numbers = new int[3];
        int[] availableNumbers = {1,2,3,4,5,6,7,8,9}; //number between 1-9
        Random random = new Random();
        //random the array of numbers
        for(int i = availableNumbers.length - 1; i >= 0; i--){
            int index = random.nextInt(i+1);

            int temp = availableNumbers[index];
            availableNumbers[index] = availableNumbers[i];
            availableNumbers[i] = temp;
        }

        //arrange the first three numbers in the random array
        for (int i=0; i<numbers.length; i++){
            numbers[i] = availableNumbers[i];
        }
    }
    //return the array of numbers
    public int[] getNumbers() {
        return numbers;
    }

    //calculation
    public int getSum(){
        int sum = 0;
        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }
}
