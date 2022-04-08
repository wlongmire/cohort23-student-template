import java.util.Arrays;
import java.util.Random;

public class Exercise11 {

    public static void main(String[] args) {
        int[] values = makeRandomArray();
        int[] positives;
        int amountPositive = 0;

        printArray(values);

        for(int i=0; i < values.length;i++) {
            amountPositive += (values[i] > 0)? 1: 0;
        }

        int currentPositive = 0;
        positives = new int[amountPositive];

        for(int i=0; i < values.length;i++) {
            if (values[i] > 0) {
                positives[currentPositive] = values[i];
                currentPositive ++;
            }
        }

        printArray(positives);

        // 1. Count the number of positive elements in `values`.
        // 2. Create a new int[] to hold the positive elements.
        // (We must count first to know the capacity to allocate.)
        // 3. Loop through `values` a second time. Add positive elements to the new array.
        // 4. Confirm the positive array is properly populated either by debugging or printing its elements.
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static int[] makeRandomArray() {
        Random random = new Random();
        int[] result = new int[random.nextInt(100) + 50];
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(1000) - 500;
        }
        return result;
    }

}
