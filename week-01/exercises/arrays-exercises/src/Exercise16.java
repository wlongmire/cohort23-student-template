import java.util.Arrays;
import java.util.Random;

public class Exercise16 {

    public static void main(String[] args) {
        // MERGE
        int[] one = makeRandomAscendingArray();
        int[] two = makeRandomAscendingArray();
        int[] result = new int[one.length + two.length];

        //loop through 0 - result.length
        //  see if one[currentOne] < two[currentTwo]
        //      add one[currentOne] to result[currentResult]
        //      currentOne ++;
        //  else
        //      add two[currentTwo] to result[currentResult]
        //      currentTwo ++;
        //  currentResult ++
        //print results

        int currentOne = 0;
        int currentTwo = 0;

        for(int currentResult=0; currentResult < result.length; currentResult++) {
            if (currentOne == one.length) {
                result[currentResult] = two[currentTwo];
                currentTwo ++;
            } else if (currentTwo == two.length) {
                result[currentResult] = one[currentOne];
                currentOne ++;
            } else if (one[currentOne] < two[currentTwo]) {
                result[currentResult] = one[currentOne];
                currentOne ++;
            } else {
                result[currentResult] = two[currentTwo];
                currentTwo ++;
            }
        }

        printArray(result);
//        printArray(one);
//        printArray(two);

        // makeRandomAscendingArray creates a random array with a capacity between 50 and 150.
        // Its elements are guaranteed to be sorted ascending.
        // 1. Create a new int[] with capacity for all elements from `one` and `two`.
        // 2. "Merge" elements from `one` and `two` into the new array so that its values are sorted.

         /* Pseudocode:
         Create an integer index for `one`, `two`, and the result array, all starting at 0.
         Loop resultIndex from 0 to result.length - 1:
           if one[oneIndex] is less than two[twoIndex], add it to the result and increment oneIndex.
           if two[twoIndex] is less than one[oneIndex], add it to the result and increment twoIndex.
           determine how to settle ties
           if oneIndex >= one.length, there are no `one` elements remaining so use elements from two
           if twoIndex >= two.length, there are no `two` elements remaining so use elements from one
          */
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }


    public static int[] makeRandomAscendingArray() {
        Random random = new Random();
        int[] result = new int[random.nextInt(100) + 50];
        int current = random.nextInt(11);
        for (int i = 0; i < result.length; i++) {
            result[i] = current;
            current += random.nextInt(4);
        }
        return result;
    }
}
