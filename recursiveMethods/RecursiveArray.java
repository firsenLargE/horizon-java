package recursiveMethods;

public class RecursiveArray {
    public static void main(String[] args) { // main method needs String[] args
        int[] arr = new int[]{31, 11, 11, 123, 213, 23, 41, 11, 4, 2, 34};

        // Start the recursion from index 0 and store the result
        int count = has11(0, arr);

        // Print the final count
        System.out.println("The number 11 appears " + count + " times.");
    }

    /**
     * Recursively counts the occurrences of the number 11 in the array.
     * @param idx The current index to check.
     * @param arr The array being searched.
     * @return The total count of 11s found from the current index to the end.
     */
    public static int has11(int idx, int[] arr) {

        // Base Case: If the index is past the end of the array, stop recursion and return 0.
        if (idx >= arr.length) {
            return 0;
        }

        // Recursive Step: Call the method for the next index (idx + 1).
        // This is the count of 11s found later in the array.
        int recurse = has11(idx + 1, arr);

        // Check the current index's value:
        if (arr[idx] == 11) {
            // If it's 11, add 1 to the count from the rest of the array.
            return recurse + 1;
        } else {
            // If it's not 11, just return the count from the rest of the array.
            return recurse;
        }
    }
}
